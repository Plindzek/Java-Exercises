package most;

public class Main
{
    public static void main(String[] args)
    {
	
	/*
	 * tworząc referencję typu Switch tak naprawdę powstaje referencja typu IDevice
	 * pomimo, ze nie odwołujemy sie do niej w kodzie bezpośrednio, ale powstaje poprzez konstruktor Switch
	 *  obiekt korzysta z metod Button(bo new Button), które uruchamiają implementację metod z konkretnych urządzeń 
	 *  
	 */
        
	Switch tvButton = new Button(new TV());

        tvButton.On();
        tvButton.Off();

        Switch radioButton = new Button(new Radio());

        radioButton.On();
        radioButton.Off();

        Switch lampButton = new Button(new Lamp());
        
       
        IDevice button = new Radio(); //standardowa droga

        
        lampButton.On();
        lampButton.Off();
        
        button.On();

        
    }
}