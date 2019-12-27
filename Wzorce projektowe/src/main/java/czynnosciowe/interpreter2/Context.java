package interpreter2;

public class Context {
        private String _input;
        private int _output;

        public Context(String input)
        {
            _input = input;
        }

        
        
	public String get_input() {
	    return _input;
	}

	public void set_input(String _input) {
	    this._input = _input;
	}

	public int get_output() {
	    return _output;
	}

	public void set_output(int _output) {
	    this._output = _output;
	}

        
}
