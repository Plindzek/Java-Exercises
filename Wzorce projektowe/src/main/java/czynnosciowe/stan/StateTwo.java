package czynnosciowe.stan;

public class StateTwo extends State{

    @Override
    public void goNext(Context context) {
	context.setState(new StateThree());
    }

}
