package strukturalne.kompozyt;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	Leaf leaf1 = new Leaf();
	Leaf leaf2 = new Leaf();
	Leaf leaf3 = new Leaf();

	Composite composite = new Composite();
	composite.AddChild(leaf1);
	composite.AddChild(leaf2);
	composite.AddChild(leaf3);

	leaf1.operation();
	leaf2.operation();
	leaf3.operation();

	composite.operation();
	
	
    }
}
