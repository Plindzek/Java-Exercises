package io.github.mat3e;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * provide display greeting in given lang
 */
class HelloService {
    Logger logger = LoggerFactory.getLogger(HelloService.class);
    static final String FALLBACK_NAME = "world";
    static final Lang FALLBACK_LANG = new Lang(1, "Hello", "en");
    private LangRepository repository;

   public HelloService(){
        this(new LangRepository());
    }

    HelloService(LangRepository repository) {
       this.repository=repository;
    }


    String prepareGreeting(String name, String lang){
/**
 * pobieramy optionalem lang, na wypadek, gdyby był null i mapujemy go na obiekt Long
 */
       int langId;
       try{
           langId = Optional.ofNullable(lang).map(Integer::valueOf).orElse(FALLBACK_LANG.getId());
       }
       catch(NumberFormatException e){
           logger.info("Non-numeric language id used: "+ lang);
       langId =FALLBACK_LANG.getId();
    }

       var welcomeMessage =  repository.findByID(langId).orElse(FALLBACK_LANG).getWelcomeMsg();
       var nameToWelcome = Optional.ofNullable(name).orElse(FALLBACK_NAME);
       return welcomeMessage+" "+nameToWelcome + "!";
    }

}
