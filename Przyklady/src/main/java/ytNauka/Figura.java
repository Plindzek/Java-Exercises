package ytNauka;

public  abstract class Figura implements Areable{

	private String kolor;
	private boolean wype�nienie;
	
	public Figura()
	{this ("Czarny", false);}
	
	public Figura(String k, boolean w)
	{kolor =k;
	wype�nienie = w;}
	
	 public String toString() 
	 {return "Kolor: " + kolor + ", Wype�nienie: " + wype�nienie;}
	
	// public double obliczPole ()
	 //{return 666;}
	 //public abstract double obliczPole(); //metoda stworzona, aby uzyska� dost�p do metody z podklasy
	 //public abstract double obliczObw�d(); //metoda stworzona, aby uzyska� dost�p do metody z podklasy
	 
	public static void main(String[] args) {
	

	}

}
