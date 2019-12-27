package fabryka;

public class Circle implements Figures {

    String name;
    static int number;
    double radius;

    Circle(String name, double radius) {
	number++;
	this.name = (name+number);
	this.radius = radius;

    }

    @Override
    public double surfaceArea() {

	return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
	return "Name:" + name + ", surface area:" + surfaceArea();
    }

}
