package ytNauka;

public class MojeKo�o extends Ko�o {

	public MojeKo�o(double r)
	{
		super(r);
	}
	
	public double obliczPole()
		{
		double r = getPromie�();
		return 1000*r;
		}
	
	public static void main(String[] args) {
	
		MojeKo�o Ko�o2 = new MojeKo�o(6);
		System.out.println("Promie�: "+Ko�o2.getPromie�());
		System.out.println("Pole: "+Ko�o2.obliczPole());
		

	}

}
