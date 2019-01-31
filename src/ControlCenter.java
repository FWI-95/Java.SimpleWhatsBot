
public class ControlCenter {
	static Network network;
	static Translator trans;
		
	static SettingFrame setframe;
	static CommandFrame comframe;
	
	public ControlCenter(Network n) {
		network = n;
		
		trans = new Translator(n);
		
		setframe = new SettingFrame("Settings", this);
		comframe = new CommandFrame("Commands", this);
		
	}
	
	public void register() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Network getNetwork() {
		return network;
	}
	
	public void showSettings() {
		setframe.setVisible(true);
	}
	
	public void showCommands() {
		comframe.setVisible(true);
	}
	
	public void exit() {
		network.close();
		System.exit(0);
	}
}
