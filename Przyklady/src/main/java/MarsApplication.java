class MarsApplication  {

public static void main(String[] args) {
MarsRobot spirit = new MarsRobot();
MarsRobot.status = "zmieni³em static";
spirit.speed = 2;
spirit.temperature = -60;

spirit.showAttributes();
System.out.println("zwiêkszanie prêdkoœci do 3");
spirit.speed=3;
spirit.showAttributes();
System.out.println("Zmiana temperatury na -90");
spirit.temperature=-90;
spirit.showAttributes();
System.out.println("sprawdzenie temperatury.");
spirit.checkTemperature();
spirit.showAttributes();
System.out.println("testujemy ogranicznik prêdkoœci");
spirit.speed=12000;
spirit.showAttributes();
spirit.checkSpeed();
spirit.showAttributes();
MarsRobot Mirek = new MarsRobot();
Mirek.showAttributes();

}
}
