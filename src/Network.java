import java.util.Properties;

public class Network implements Runnable{
	static Properties opt;
	public Network(Properties p) {
		opt = p;
		
		
		
	}

	@Override
	public void run() {
		
	}
	
	public boolean sendCommand(String cmd) {
		
		
		return true;
	}
	
	
	public Properties getOpt() {
		return opt;
	}
	
	public void close() {
		
	}

}
