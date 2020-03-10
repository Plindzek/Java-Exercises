package czynnosciowe.stan;

public class StateThree extends State{

    @Override
    public void goNext(Context context) {
	context.setState(new StateOne());	
    }

}
