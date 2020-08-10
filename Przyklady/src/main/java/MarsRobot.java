class MarsRobot {
static String status="kuku";
int speed;
float temperature;
int topSpeed = 10000;

void checkTemperature() {
	if(temperature< -62) {
	status = "ale zimno, spadamy klasa";
	speed = 9000;
	}

}
void checkSpeed() {
	if(speed>topSpeed) {
		status = "jedziesz za szybko - ograniczenie prêdkoœci";
		speed=9999;
		
			}
}
void showAttributes() {

	System.out.println("Co siê dzieje? " + status);
	System.out.println("Zmiana prêdkoœci na " + speed);
	System.out.println("temperatura: " + temperature);
	}

}