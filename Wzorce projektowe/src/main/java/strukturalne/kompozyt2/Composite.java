package kompozyt2;

import java.util.ArrayList;
import java.util.List;

public class Composite extends ProductAbstract {

    private List<ProductAbstract> children = new ArrayList<ProductAbstract>();
    String name;
    
    public Composite(String name) {
        this.name=name;
    }
    @Override
    protected String getProductName() {

        return name;

    }
    @Override
    public void showMe() {

        super.showMe();

        for(ProductAbstract pa : children)
        {
            pa.showMe();
        }
    }

    @Override
    public void addChild(ProductAbstract p) {

        children.add(p);
        p.depth=this.depth+1;
        p.repair();

    }

    @Override
    public void removeChild(ProductAbstract p) {
        children.remove(p);

    }
    @Override
    protected void repair() {
	 
	for(ProductAbstract pa : children)
	        {
	            pa.depth=this.depth+1;
	            pa.repair();
	        }	
    }
    @Override
    public void makeIndependent() {
	depth=0;
	repair();
    }

}