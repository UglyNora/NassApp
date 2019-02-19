
package com.search_engine.nassapp;

//A standalone GUI search engine app- stub user interface.
//Written by Mac Wiener, Valrico FL, 2019


import java.awt.*;
import javax.swing.*;
//import java.awt.font;

public class NassApp extends JFrame
{

    public NassApp()
    {
        JFrame frame = new JFrame ("NASS Engine");
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        JLabel label = new JLabel ("NASS");
        JTextField textfield = new JTextField( 28);
        JButton button = new JButton ("Search");
        JRadioButton radiobutton = new JRadioButton();
        JLabel label2 = new JLabel ("All Search Values");
        JRadioButton radiobutton2 = new JRadioButton();
        JLabel label3 = new JLabel ("Any Search Values");
        JRadioButton radiobutton3 = new JRadioButton();
        JLabel label4 = new JLabel ("Exact Match");
        JButton button2 = new JButton ("Maintenance...");
        JButton button3 = new JButton ("About...");

        container.add (label);
        container.add (textfield);
        container.add (button);
        container.add (radiobutton);
        container.add (label2);
        container.add (radiobutton2);
        container.add (label3);
        container.add (radiobutton3);
        container.add (label4);
        container.add (button2);
        container.add (button3);


        label.setFont (new Font("Futura", Font.BOLD,30));
        button.setFont (new Font("Futura",Font.BOLD, 15));
        frame.setSize (550, 200);
        frame.setVisible (true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }




}
class HouseKeeping{
    public static void main ( String args[])
    {
        //open file/database to be searched.

        NassApp obj = new NassApp();



        //close file/database, add or delete files.


    }
}
