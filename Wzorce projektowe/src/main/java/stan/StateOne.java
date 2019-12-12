package stan;

public class StateOne extends State{

    @Override
    public void goNext(Context context) {
	context.setState(new StateTwo());	
    }

}
