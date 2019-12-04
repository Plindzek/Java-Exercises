package ytNauka;

public class MojeKolo extends Kolo {

	public MojeKolo(double r)
	{
		super(r);
	}
	
	public double obliczPole()
		{
		double r = getPromien();
		return 1000*r;
		}
	
	public static void main(String[] args) {
	
		MojeKolo Kolo2 = new MojeKolo(6);
		System.out.println("Promie�: "+Kolo2.getPromien());
		System.out.println("Pole: "+Kolo2.obliczPole());
		

	}

}
