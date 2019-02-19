package com.search_engine.nassapp;

//A standalone GUI search engine app- stub user interface.
//Written by Mac Wiener, Valrico FL, 2019


import java.awt.*;
import javax.swing.*;


public class NassApp extends JFrame
{

	public static void main ( String[] args )
    {
        JFrame frame = new JFrame ("NASS Engine");
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());

        JLabel label = new JLabel ("NASS Search: ");
        JTextField tf1 = new JTextField();
        JButton search = new JButton ();

        container.add (label);
        container.add (tf1);
        container.add (search);

        frame.setSize (500, 300);
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
