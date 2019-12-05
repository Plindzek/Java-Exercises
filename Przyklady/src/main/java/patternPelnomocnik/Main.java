package patternPelnomocnik;

public class Main {

    public static void main(String[] args) {
	/*
	 * subject will do just work
	 */
	Subject subject = new RealSubject();
	subject.makeWork();
	/*
	 * proxy will do something before subject, and then load subject
	 */

	Subject proxy1 = new ProxySubject();

	proxy1.makeWork();
    }

}
