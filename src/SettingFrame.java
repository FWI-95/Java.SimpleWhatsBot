import java.util.Properties;
import java.util.Set;

import javax.swing.JFrame;

public class SettingFrame extends JFrame{
	static ControlCenter center;
	
	static Properties opt;
	
	String[][] optArray;
	
	public SettingFrame(String Title, ControlCenter c) {
		center = c;
		this.setTitle(Title);
		
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		opt = center.getNetwork().getOpt();
		
		optArray = new String[opt.size()][3];
		
		Set<Object> keys = opt.keySet();
		String[] akeys = (String[]) keys.toArray();
		
		for(int x = 0; x < opt.size(); x++) {
			optArray[x][0] = akeys[x];
			String tmp[] = opt.getProperty(akeys[x]).split(";");
			optArray[x][1] = tmp[0];
			optArray[x][2] = tmp[1];
		}
		
		
	}
}
