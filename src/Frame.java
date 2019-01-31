import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame implements ActionListener{
	static ControlCenter center;
	
	JMenuBar mb;
	JMenu mFile;
	JMenu mOptions;
	
	JMenuItem mCommands;
	JMenuItem mClose;
	JMenuItem mSettings;
	
	public Frame(ControlCenter c) {
		center = c;
		
		mb = new JMenuBar();
		
		mFile = new JMenu("File");
		mOptions = new JMenu("Options");
		
		mCommands = new JMenuItem("Commands");
		mCommands.setActionCommand("Commands");
		mCommands.addActionListener(this);
		
		mClose = new JMenuItem("Close");
		mClose.setActionCommand("Close");
		mClose.addActionListener(this);
		
		mSettings = new JMenuItem("Settings");
		mSettings.setActionCommand("Settings");
		mSettings.addActionListener(this);
		
		mFile.add(mCommands);
		mFile.add(mClose);
		
		mOptions.add(mSettings);
		
		mb.add(mFile);
		mb.add(mOptions);
		
		this.add(mb);
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		switch(ae.getActionCommand()) {
		case "Commands":
			center.showCommands();
			break;
		case "Close":
			center.exit();
			break;
		case "Settings":
			center.showSettings();
			break;
		default:
			break;
		}
	}
}
