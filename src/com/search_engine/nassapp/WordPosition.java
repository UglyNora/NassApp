package com.search_engine.nassapp;

public class WordPosition
{
    //|Fields|\\

    private int[] coordinates;

    //|Instance Methods|\\

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
        return coordinates[0] == documentNumber;
    }

    public boolean IsAtPosition(int position)
    {
        return coordinates[1] == position;
    }

    //TODO :  This method should cast the given argument as an WordPosition and then check the
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
        coordinates = new int[] {1,1};

        return;
    }

    //TODO :  This constructor accepts another WordPosition and should copy its fields to the
    //- appropriate positions in the coordinates array.
    public WordPosition(WordPosition entryToCopy)
    {
        coordinates = new int[] {1,1};

        return;
    }
}
