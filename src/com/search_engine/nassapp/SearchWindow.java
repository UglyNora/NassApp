package com.search_engine.nassapp;

//A standalone GUI search engine app- stub user interface.
//Written by Dexter Sicarius, Tampa FL, 2019


import javafx.scene.control.Control;
import javafx.scene.control.RadioButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;


public class SearchWindow extends JFrame
{
    //|Controls|\\

    private SearchEngine currentEngine;

    //|Fields|\\

    private JFrame       searchWindowFrame;
    private JLabel       windowHeaderLabel;
    private JTextField   searchField;
    private JButton      searchButton;
    private JButton      adminButton;
    private ButtonGroup  searchOptionGroup;
    private JRadioButton phraseRadioButton;
    private JRadioButton andRadioButton;
    private JRadioButton orRadioButton;
    private JRadioButton notRadioButton;
    private Container    container;


    //|Instance Methods|\\

    public static void main ( String args[])
    {

        SearchWindow searchWindow = new SearchWindow();

        return;
    }

    //TODO :  This method should center a given control vertically within the given Dimension
    private void CenterControlVertically(Control controlToCenter, Dimension areaSize)
    {

    }
    //TODO :  This method should center a given control horizontally within the given Dimension
    private void CenterControlHorizontally(Control controlToCenter, Dimension areaSize)
    {

    }

    //TODO :  This method should call all of the other methods concerned with setting up the initial
    //- display for the window in a reasonable order;
    private void SetWindowDisplay()
    {

    }

    //TODO :  This method should assign the 4 search option radio buttons to the searchOptionGroup and
    //- then configure them so they are visible, are positioned on the page somewhere appropriate,
    //- and any relevant properties have been set (i.e. height, width, etc)
    private void ConfigureSearchOptionRadioGroup()
    {

    }

    //TODO :  This method should take the JButtons and configure them so they are visible, are positioned on
    //- the page somewhere appropriate, and any relevant properties have been set (i.e. height, width, etc)
    private void ConfigureButtons()
    {

    }

    //TODO :  This method should take the remaining controls (searchbox, labels, etc) and configure them so they
    //- are visible, are positioned on the page somewhere appropriate, and any relevant properties have been
    //- set (i.e. height, width, etc)
    private void ConfigureMisc()
    {

    }

    //TODO : This method should assign the event listeners declared in the Event Handlers section to their
    //- appropriate controls
    private void SetEventListeners()
    {

    }


    //|Constructors|\\

    public SearchWindow()
    {
        searchWindowFrame = new JFrame ("NASS Engine");
        windowHeaderLabel = new JLabel ("NASS");
        searchField       = new JTextField();
        searchButton      = new JButton ("Search");
        adminButton       = new JButton ("Admin");
        searchOptionGroup = new ButtonGroup();
        phraseRadioButton = new JRadioButton("Phrase");
        andRadioButton    = new JRadioButton("And");
        orRadioButton     = new JRadioButton("Or");
        notRadioButton    = new JRadioButton("Not");

        container = searchWindowFrame.getContentPane();
        container.setLayout(new FlowLayout());

        container.add(windowHeaderLabel);
        container.add(searchButton);
        container.add(searchField);
        container.add(phraseRadioButton);
        container.add(andRadioButton);
        container.add(orRadioButton);
        container.add(notRadioButton);
        container.add(adminButton);


        searchWindowFrame.setSize(1200, 700);
        searchWindowFrame.setVisible(true);
        searchWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentEngine = new SearchEngine();
    }

    //|SubClasses|\\



    //|Event Listeners|\\

    //- Handles the events for the Add File Button
    private class SearchButtonListener implements ActionListener
    {
        SearchWindow windowContainingTriggeredControl;

        //TODO : This method should get the query typed into the searchbox and which of the search option radio
        //- buttons is selected, and then pass that information to the SearchDatabase method of the current engine
        @Override public void actionPerformed(ActionEvent e)
        {

        }

        public SearchButtonListener(SearchWindow parentWindow)
        {
            windowContainingTriggeredControl = parentWindow;
            return;
        }
    }

    //- Handles the events for the Add File Button
    private class AdminButtonListener implements ActionListener
    {
        SearchWindow windowContainingTriggeredControl;

        //TODO : This method should create and open a new admin window using the currentEngine
        @Override public void actionPerformed(ActionEvent e)
        {

        }

        public AdminButtonListener(SearchWindow parentWindow)
        {
            windowContainingTriggeredControl = parentWindow;
            return;
        }
    }

    //- Handles the events for the Add File Button
    private class SearchWindowListener extends WindowAdapter
    {
        SearchWindow windowContainingTriggeredControl;

        //TODO : This method should perform any save or close operations that need to be done before
        //- the program closes
        @Override public void windowClosing(WindowEvent e)
        {
            super.windowClosing(e);
        }

        public SearchWindowListener(SearchWindow parentWindow)
        {
            windowContainingTriggeredControl = parentWindow;
            return;
        }
    }

}