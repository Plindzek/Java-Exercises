package ytNauka;

public class MojeKo³o extends Ko³o {

	public MojeKo³o(double r)
	{
		super(r);
	}
	
	public double obliczPole()
		{
		double r = getPromieñ();
		return 1000*r;
		}
	
	public static void main(String[] args) {
	
		MojeKo³o Ko³o2 = new MojeKo³o(6);
		System.out.println("Promieñ: "+Ko³o2.getPromieñ());
		System.out.println("Pole: "+Ko³o2.obliczPole());
		

	}

}
