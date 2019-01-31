import java.util.Properties;

import javax.swing.JFrame;

public class CommandFrame extends JFrame{
	static ControlCenter center;
	
	static Properties opt;
	
	public CommandFrame(String Title, ControlCenter c) {
		center = c;
		this.setTitle(Title);

		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		opt = center.getNetwork().getOpt();
	}
}
