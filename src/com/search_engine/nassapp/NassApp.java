package nass_gui;
import java.awt.*;

public class MyGUI extends Frame
{
	Label searchLbl = null;
	TextField searchFld = null;
	Button searchBtn = null;
	Button maintenanceBtn = null;
	Button aboutBtn = null;
	
	MyGUI()
	{
		super("NASS Search Engine");
		
		searchLbl = new Label("Search: ");
		searchFld = new TextField("",50);
		searchBtn = new Button("Search");
		maintenanceBtn = new Button("Maintenance");
		aboutBtn = new Button("About");
		
		this.add(searchLbl);
		this.add(searchFld);
		this.add(searchBtn);
		this.add(maintenanceBtn);
		this.add(aboutBtn);
		
		this.setLayout(new FlowLayout());
		this.setSize(700,200
			);
		this.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new MyGUI();
	}

}
