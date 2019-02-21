package com.search_engine.nassapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMenu
{
    //|Fields|\\

    private SearchEngine  administeredEngine;

    //|Controls|\\

    private JFrame        adminFrame;
    private JLabel        windowHeaderLabel;
    private JList<String> fileList;
    private JButton       addFileButton;
    private JButton       removeFileButton;
    private JButton       rebuildIndexButton;
    private Container     adminContainer;

    //|Instance Methods|\\

    //TODO : This method should take window controls (searchbox, labels, etc) and configure them so they
    //- are visible, are positioned on the page somewhere appropriate, and any relevant properties have been
    //- set (i.e. height, width, etc);
    private void SetWindowDisplay()
    {

    }

    //TODO :  This method should use the GetListOfFilesUsedInIndex method for the administered engine to
    //- populate the fileList control with the names of the files used to create the index
    private void SetFileListContents()
    {

    }

    //TODO : This method should assign the event listeners declared in the Event Listeners section to their
    //- appropriate controls
    private void SetEventListeners()
    {

    }

    //|Constructors|\\

    public AdminMenu(SearchEngine engineToAdminister)
    {
        adminFrame        = new JFrame ("Admin Menu");
        windowHeaderLabel = new JLabel ("Admin Menu");
        fileList          = new JList<String>();
        addFileButton     = new JButton ("Add File");
        removeFileButton  = new JButton ("Remove File");
        rebuildIndexButton = new JButton ("Rebuild Index");

        adminContainer = adminFrame.getContentPane();
        adminContainer.setLayout(new FlowLayout());

        adminFrame.setSize (600, 800);
        adminFrame.setVisible (true);
        adminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        administeredEngine = engineToAdminister;
    }

    //|SubClasses|\\



    //|Event Listeners|\\

    //- Handles the events for the Add File Button
    private class AddFileButtonListener implements ActionListener
    {
        AdminMenu windowContainingTriggeredControl;

        //TODO : This method should trigger a dialog box which asks the user for the path of the file to be added.
        //- The method should then use the AddFileToIndexFileList method for the administeredEngine and
        //- update the fileList to reflect the new addition.
        @Override public void actionPerformed(ActionEvent e)
        {

        }

        public AddFileButtonListener(AdminMenu parentWindow)
        {
            windowContainingTriggeredControl = parentWindow;
            return;
        }
    }

    //- Handles the events for the Remove File Button
    private class RemoveFileButtonListener implements ActionListener
    {
        AdminMenu windowContainingTriggeredControl;

        //TODO : This method should get the text of the currently selected item in the fileList control.
        //- It should then trigger a dialog box which asks the user if they are sure they want to remove
        //- that file.  If confirmed, the method should use the RemoveFileFromIndexFileList method for
        //- the administeredEngine and update the fileList to reflect the removal.
        @Override public void actionPerformed(ActionEvent e)
        {

        }

        public RemoveFileButtonListener(AdminMenu parentWindow)
        {
            windowContainingTriggeredControl = parentWindow;
            return;
        }
    }

    //- Handles the events for the Rebuild Index Button
    private class RebuildIndexButtonListener implements ActionListener
    {
        AdminMenu windowContainingTriggeredControl;

        //TODO : This method should trigger a dialog box which asks the user if they are sure they want
        //- to clear the current index.  If confirmed, use the DiscardAndRebuildIndex() method for the
        //- administeredEngine to rebuild the index
        @Override public void actionPerformed(ActionEvent e)
        {

        }

        public RebuildIndexButtonListener(AdminMenu parentWindow)
        {
            windowContainingTriggeredControl = parentWindow;
            return;
        }
    }

}
