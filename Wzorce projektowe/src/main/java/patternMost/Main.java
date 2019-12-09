package patternMost;

public class Main
{
    public static void main(String[] args)
    {
        Switch tvButton = new ClickSwitch(new TV());

        tvButton.On();
        tvButton.Off();

        Switch radioButton = new ClickSwitch(new Radio());

        radioButton.On();
        radioButton.Off();

        Switch lampButton = new ClickSwitch(new Lamp());
        
        IDevice lampButton111 = new Radio(); //standardowa droga
        
        lampButton.On();
        lampButton.Off();

        
    }
}