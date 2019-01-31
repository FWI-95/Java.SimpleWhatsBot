import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Main {
	static Properties opt;
	static ControlCenter center;
	static Network network;
	static Frame frame;
	
	public static void main(String[] args) {
		opt = loadProps("C:/WhatsBot/options.config");
		
		network = new Network(opt);
		center = new ControlCenter(network);
		frame = new Frame(center);
		
		
		
	}
	
	private static Properties loadProps(String Path) {
		Properties props = null;
		
		try {
			props.load(new BufferedReader(new FileReader(new File(Path))));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return props;
	}

}
