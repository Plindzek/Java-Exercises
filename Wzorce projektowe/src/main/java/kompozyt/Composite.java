package kompozyt;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {

    @Override
    public void operation() {
	System.out.println("display leaf: " + this);
    }

    private List<IComponent> children = new ArrayList<IComponent>();

    public void AddChild(IComponent component) {
	children.add(component);
    }

    public void RemoveChild(IComponent component) {
	children.remove(component);
    }

    public List<IComponent> GetChild() {
	return children;
    }

    @Override
    public String toString() {
	return "Composite children=" + children ;
    }
    

}
