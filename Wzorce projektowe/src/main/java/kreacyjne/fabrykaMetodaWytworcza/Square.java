package fabrykaMetodaWytworcza;

public class Square implements Figures {

    String name;
    static int number;
    double sideLength;

    Square(String name, double sideLength) {
	number++;
	this.name = (name+number);
	this.sideLength = sideLength;

    }

    @Override
    public double surfaceArea() {
	return sideLength * sideLength;
    }

    @Override
    public String toString() {
	return "Name:" + name + ", surface area:" + surfaceArea();
    }

}
