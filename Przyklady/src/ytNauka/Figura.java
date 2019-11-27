package ytNauka;

public  abstract class Figura implements Areable{

	private String kolor;
	private boolean wype³nienie;
	
	public Figura()
	{this ("Czarny", false);}
	
	public Figura(String k, boolean w)
	{kolor =k;
	wype³nienie = w;}
	
	 public String toString() 
	 {return "Kolor: " + kolor + ", Wype³nienie: " + wype³nienie;}
	
	// public double obliczPole ()
	 //{return 666;}
	 //public abstract double obliczPole(); //metoda stworzona, aby uzyskaæ dostêp do metody z podklasy
	 //public abstract double obliczObwód(); //metoda stworzona, aby uzyskaæ dostêp do metody z podklasy
	 
	public static void main(String[] args) {
	

	}

}
