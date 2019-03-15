package nass_maintenance;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import nass_gui.MyGUI;

public class AdminGui extends Frame
{
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	Label titleLbl = new Label("NASS Engine - Admin");
	Label fileName = new Label("File Name");
	Label status = new Label("Status");
	Button addFile = new Button("Add File...");
	Button rebuild = new Button("Rebuild Out-of-date");
	Button remove = new Button("Remove Selected Files");
	Button reset  = new Button("Reset Windows");
	Label indexed = new Label("Number of files indexed: ");
	Label indexedNum = new Label("");
	Label version = new Label("NASS Engine version 1.0");
	
	AdminGui()
	{
		super("NASS Engine Maintenance");
		
		p1.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout(1,2));
		p3.setLayout(new GridLayout(1,2));
		p4.setLayout(new GridLayout(2,3));
		
		p1.add(titleLbl);
		p2.add(fileName);
		p2.add(status);
		p4.add(addFile);
		p4.add(rebuild);
		p4.add(remove);
		p4.add(reset);
		p4.add(indexed);
		p4.add(indexedNum);
		p4.add(version);
		
		Frame f = new Frame();
		f.setLayout(new GridLayout(4,1));
		f.setSize(500,500);
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new AdminGui();
	}
}
