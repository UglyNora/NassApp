package com.search_engine.nassapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class WordPosition
{
    //|Fields|\\

    private int[] indexEntries;

    //Connecting to DataBase in order to write text files that have been converted into CVS files and are
    //stored on a flash drive.

    private static String  JDBC_CONNECTION_URL = "jdbc:h2:/Users/marysotomayor/Desktop/NassAppBackup2";


    //|Instance Methods|\\



    private static Connection getCon(){

        Connection connection = null;

        try {
            Class.forName("insert proper name of DB driver here");
            connection = DriverManager.getConnection(JDBC_CONNECTION_URL);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
    //TODO :  This method should return the first element in the coordinates array
    //- which corresponds to the document in which the word instance is located.
    public int GetDocumentNumber()
    {
        return 1;
    }

    //TODO :  This method should return the second element in the coordinates array
    //- which corresponds to the position of the word in its document.
    public int GetWordPosition()
    {
        return 1;
    }


    public boolean IsInDocument(int documentNumber)
    {
        return indexEntries[0] == documentNumber;
    }

    public boolean IsAtPosition(int position)
    {
        return indexEntries[1] == position;
    }

    //TODO :  This method should cast the given argument as a WordPosition and then check the
    //- document number and position in that instance.  If they are the same as the instance
    // it is being compared to, return true, else return false
    @Override public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    //|Constructors|\\

    //TODO :  This constructor accepts two int arguments and should assign those to their
    //- appropriate positions in the coordinates array.
    public WordPosition(int documentNumber, int wordPosition)
    {
        indexEntries = new int[] {1,1};

        return;
    }

    //TODO :  This constructor accepts another WordPosition and should copy its fields to the
    //- appropriate positions in the coordinates array.
    public WordPosition(WordPosition entryToCopy)
    {
        indexEntries = new int[] {1,1};

        return;
    }
}
