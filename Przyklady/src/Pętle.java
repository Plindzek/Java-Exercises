
public class Pêtle {
	int a = 0;
	int b = 100;
	int c = 500;
	int d = 1000;
		 
	void instrukcjaWarunkowaIf() {if(a<0) {System.out.println(a + " wynik if true\n"); } 	//je¿eli (nawias) jest true blok jest wykonywany
	 					else {System.out.println(b + " wynik if false\n");}			//je¿eli (nawias) jest false blok po else jest wykonywany. else nie jest obowi¹zkowe	
	 }
	 
	void instrukcjaWarunkowaSwitch() {switch (a)  //sprawdza czym jest a i wykonuje przypisan¹ instrukcjê
		{case 1:System.out.println("wynik case 1");
		break;									   //je¿eli nie damy break wszystkie nastêpuj¹ce instrukcje po prawid³owej te¿ siê wykonaj¹		
		case 2:System.out.println("wynik case 2");
		break;
		case 3:System.out.println("wynik case 3");
		break;
		default:System.out.println("wynik default");
		
		}}

	void petlaFor() { 
		  for ( a=-9; a<3;a++,System.out.println(a))  //inicjalizuje lub zmienia wartoœæ a i sprawdza czy a<3 jest true, jezeli tak, 

	 { System.out.println("wynik petli for");		  //wykonuje instrukcjê a potem iteracjê i kolejn¹ pêtlê
	   System.out.println("wynik 2 petli for"); }}	  //je¿eli jest false, przerywa zadanie bez iteracji

	void petlaWhile() {
		while(a<5) {a++; if (a==1) {continue;}System.out.println(a + " while");} //pêtla wykonuje sie dopóki wynik wyra¿enia jest true. Je¿eli false, nie wykona siê wcale
 }														//doda³em instrukcjê if z uzyciem s³owa kluczowego continue czyli je¿eli a=1 petla restartuje siê 																		
	
	void petlaDoWhile() {
		do{System.out.println(a + " a przed++");a++;System.out.println(a + " a po++");} while(a<10);  //pêtla wykonuje sie dopóki wynik wyra¿enia jest true. 
 }																									  //Je¿eli false, wykona siê raz
	
 int operatorTrojargumentowy() //zwraca wartoœæ po sprawdzeniu test?wynikdlatrue:wynikdlafalse
 {int coWieksze=a>b?a:b;
	return coWieksze;}
 
	public static void main(String[] args) 
	 {	Pêtle petle = new Pêtle();

	 	
	 	//petle.instrukcjaWarunkowaIf();
	 	//petle.instrukcjaWarunkowaSwitch();
	 	//petle.petlaFor();
	 	petle.petlaWhile();
	 	//petle.petlaDoWhile();
	 	//System.out.println(petle.operatorTrojargumentowy());
	 }

}
