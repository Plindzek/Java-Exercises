package io.github.mat3e.hello;

import io.github.mat3e.lang.Lang;
import io.github.mat3e.lang.LangRepository;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class HelloServiceTest {
    private final static String WELCOME = "Hello";
    private final static String FALLBACK_ID_WELCOME = "Hola";
    //SUT=SystemUnderTest

    @Test
    public void test_prepareGreting_nullName_returnsGreetingWithFallbackName() throws Exception {
        //given

        var mockRepository = alwaysReturningHelloRepository();
        var SUT = new HelloService(mockRepository);

        // when

        var result = SUT.prepareGreeting(null, -1);

        //then
        assertEquals(WELCOME + " " + HelloService.FALLBACK_NAME + "!", result);

    }

    @Test
    public void test_prepareGreting_name_returnsGreetingWithName() throws Exception {
        //given
        var mockRepository = alwaysReturningHelloRepository();
        var SUT = new HelloService(mockRepository);
        var name = "test";

        //when

        var result = SUT.prepareGreeting(name, -1);

        //then
        assertEquals(WELCOME + " " + name + "!", result);
    }

    @Test
    public void test_prepareGreting_nullLang_returnsGreetingWithFallbackIDLang() throws Exception {
        //given

        var mockRepository = fallbackLangIdRepository();
        var SUT = new HelloService(mockRepository);

        //when

        var result = SUT.prepareGreeting(null, null);

        //then
        assertEquals(FALLBACK_ID_WELCOME + " " + HelloService.FALLBACK_NAME + "!", result);
    }

    @Test
    public void test_prepareGreeting_nonExistingLang_returnsGreetingWithFallbackLang() throws Exception {
        //given

        var mockRepository = nonExistingLangIdRepository();
        var SUT = new HelloService(mockRepository);

        //when

        var result = SUT.prepareGreeting(null, -1);

        //then
        assertEquals(HelloService.FALLBACK_LANG.getWelcomeMsg() + " " + HelloService.FALLBACK_NAME + "!", result);
    }

    private LangRepository fallbackLangIdRepository() {
        return new LangRepository() {

            @Override
            public Optional<Lang> findById(Integer id) {
                if (id.equals(HelloService.FALLBACK_LANG.getId())) {
                    return Optional.of(new Lang(null, FALLBACK_ID_WELCOME, null));
                }
                return Optional.empty();
            }
        };
    }

    private LangRepository alwaysReturningHelloRepository() {
        return new LangRepository() {

            @Override
            public Optional<Lang> findById(Integer id) {
                return Optional.of(new Lang(null, WELCOME, null));
            }

        };
    }

    private LangRepository nonExistingLangIdRepository() {
        return new LangRepository() {

            @Override
            public Optional<Lang> findById(Integer id) {

                return Optional.empty();
            }
        };
    }
}
