package dziedziczenie2;

class Klasa implements Methodable {

	public String pole = "Jest dost�p do pola Klasy.";

	public void method() {
		System.out.println("Wywo�ana zostaje metoda z Klasy.");
	}

	public static void main(String[] args) {

		System.out.println(
			"1.Zadeklarowanie zmiennej \"obiekt\" typu Klasa i przypisanie do niej obiektu Klasa:\nKlasa obiekt = new Klasa();");

		Klasa obiekt = new Klasa();
		obiekt.method();
		System.out.println(obiekt.pole);
		System.out.println("Nie ma dost�pu do pola Podklasy.\n");

		System.out.println(
			"2.Do zmiennej \"obiekt\" typu Klasa przypisujemy obiekt podklasy:\nobiekt = new Podklasa();");
		
		obiekt = new Podklasa();
		obiekt.method();
		System.out.println(obiekt.pole);
		System.out.println("Nie ma dost�pu do pola Podklasy.\n");

		System.out.println(
			"3.Zadeklarowanie zmiennej \"podobiekt\" typu Podklasy i przypisanie do niej obiektu Podklasy:\nPodklasa podobiekt = new Podklasa();");

		Podklasa podobiekt = new Podklasa();
		podobiekt.method();
		System.out.println(podobiekt.podPole);
		System.out.println(podobiekt.pole);

		System.out.println(
		"\nPodklasa podobiekt1 =new Klasa(); lub =(Podklasa) new Klasa(); <--tak si� nie da! Obiekt klasy nie widzi funkcjonalno�ci podklasy i kompilator zg�asza b��d.\nCo mo�na zrobi�?\n");

		System.out.println(
			"4. Zadeklarowanie zmiennej \"obiekt1\" typu Klasa i przypisanie do niej obiektu Klasy:\nKlasa obiekt1=new Klasa();");
		
		Klasa obiekt1 = new Klasa();
		System.out.println(
				"\n4a.Rzutowanie obiektu typu Podklasy \"podobiekt\" na typ Klasy, nast�pnie przypisanie go do obiektu typu Klasy: \nobiekt1 = podobiekt;\n(Rzutowanie odbywa sie niejawnie, zachodzi tu: obiekt1 = (Klasa)podobiekt;)");
		
		obiekt1 = podobiekt;
		System.out.println("\"podobiekt\" ma dost�p do Klasy, dzi�ki temu mo�liwe bedzie kolejne rzutowanie.\n");
		obiekt1.method();
		System.out.println(obiekt1.pole);
		System.out.println("Nadal nie ma dost�pu do pola Podklasy.\n");

		System.out.println(
			"4b.Zadeklarowanie zmiennej \"podobiekt1\" typu Podklasy i przypisanie do niej obiektu Klasa.obiekt1 rzutowanego na typ Podklasy.\nDzi�ki temu mamy dostep do podPola:\nPodklasa podobiekt1 = (Podklasa)obiekt1; ");
		
		Podklasa podobiekt1 = (Podklasa) obiekt1;
		System.out.println("Teraz kompilator nie zg�asza b��du i uzyskali�my dost�p do p�l Podklasy.");
		podobiekt1.method();
		System.out.println(podobiekt1.pole);
		System.out.println(podobiekt1.podPole);
		

		System.out.println("\nobiekt1.equals(podobiekt)? " + obiekt1.equals(podobiekt));
		System.out.println("obiekt1.equals(podobiekt1)? " + obiekt1.equals(podobiekt1));
		new Klasa();
		System.out.println(
			"Jak wida�, teraz referencje do obiekt, podobiekt i podobiekt1 wskazuj� na ten sam obszar pami�ci.");
		
	}
}

class Podklasa extends Klasa {

	public String podPole = "Jest dost�p r�wnie� do pola Podklasy.";

	
	
	public void method() {
		System.out.println("Wywo�ana zosta�a metoda z Podklasy(przes�oni�ta metoda z klasy nadrz�dnej).");
	}
}