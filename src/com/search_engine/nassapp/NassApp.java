//A standalone GUI search engine app- stub user interface.



import java.awt.*;
import javax.swing.*;
//import java.awt.font;

public class NassApp2 extends JFrame
{

    public static void main ( String[] args )
    {
		JFrame frame = new JFrame ("NASS Engine");
        frame.setLayout(new FlowLayout());
		Panel pn1 = new Panel();
        JLabel label = new JLabel ("Nass search: ");
        JTextField tf1 = new JTextField( 25);
        JButton search = new JButton ("Search");
		Panel pn2 = new Panel();
        JRadioButton anyButton = new JRadioButton();
        JLabel all = new JLabel ("All Search Values");
        JRadioButton allButton = new JRadioButton();
        JLabel any = new JLabel ("Any Search Values");
        JRadioButton exactButton = new JRadioButton();
        JLabel exact = new JLabel ("Exact Match");
		Panel pn3 = new Panel();
        JButton maintenace = new JButton ("Maintenance...");
        JButton about = new JButton ("About...");

        frame.add(pn1);
		frame.add(pn2);
		frame.add(pn3);
		pn1.add(label);
		pn1.add(tf1);
		pn1.add(search);
		pn2.add(all);
		pn2.add(allButton);
		pn2.add(any);
		pn2.add(anyButton);
		pn2.add(exact);
		pn2.add(exactButton);
		pn3.add(maintenace);
		pn3.add(about);
		


        label.setFont (new Font("Futura", Font.BOLD,22));
        search.setFont (new Font("Futura",Font.BOLD, 12));
        frame.setSize (600, 200);
        frame.setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




}
class HouseKeeping{
    public static void main ( String args[])
    {
        //open file/database to be searched.

        NassApp2 obj = new NassApp2();



        //close file/database, add or delete files.


    }
}