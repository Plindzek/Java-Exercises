package most;

public abstract class Switch {
   
    /*
     * abstrakcją jest tutaj klasa Switch, używając dependency injection wstrzykujemy do konstruktora klasy 
     * Button, która dziedziczy po klasie Switch obiekt klasy na którym chcemy operować i w kliencie wywołujemy jej metody.
     */
        
        protected IDevice device;
        
        public Switch(IDevice device)
        {
            this.device = device;
        }
        

        public abstract void On();

        public abstract void Off();

    }


