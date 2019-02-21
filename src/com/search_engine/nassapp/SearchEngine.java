package com.search_engine.nassapp;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public  class SearchEngine
{
    public enum SearchType { And, Or, Phrase, Not }

    //- The HashMap that will serve as the searchable index for all of the words and their positions
    private HashMap<String, HashSet<IndexEntry>> wordIndex = new HashMap<String, HashSet<IndexEntry>>();
    //- The location of the file containing the file paths for the data files to be searched by the engine
    private String pathFileLocation = "DataFiles.txt";
    //- A String[] of the filepaths for the datafiles being used by the index
    private String filesInIndex[];


    //TODO : This method should return the contents of filesInIndex
    public String[] GetListOfFilesUsedInIndex()
    {
        return new String[] {"Stub"};
    }

    //TODO :  This method should remove the given file from filesInIndex if present
    public void RemoveFileFromIndexFileList(String filePath)
    {

    }


    //TODO :  This method should add the given file from filesInIndex if it does not already exist
    public void AddFileToIndexFileList(String filePath)
    {

    }


    //TODO :  This method should use the StripAndSeparateString method to process the query into individual lines
    //- The method should then use a switch case statement to pass that processed String[] to one of the
    //- PerformXSearch methods based on the SearchType provided.  Finally the method should return the
    //- product of whichever search method was chosen
    private ArrayList<String> SearchDatabase(String userQuery, SearchType searchtype)
    {
        return new ArrayList<String>();
    }

    //- Work in Progress
    private ArrayList<String> PerformAndSearch(String[] wordsToQuery)
    {
        boolean searchIsValid = true;

        String firstWord = wordsToQuery[0];
        HashSet<IndexEntry> indexEntriesForWord = wordIndex.get(firstWord);
        HashSet<Integer> documentsContaingAllWords = GetDocumentNumbers(indexEntriesForWord);

        if(wordsToQuery.length > 1)
        {
            for (String word : wordsToQuery)
            {

            }
        }

        return new ArrayList<String>();
    }

    //- I am in the process of breaking this method down into smaller chunks for assignment
    private ArrayList<String> PerformOrSearch(String[] wordsToQuery)
    {
        return new ArrayList<String>();
    }
    //- I am in the process of breaking this method down into smaller chunks for assignment
    private ArrayList<String> PerformPhraseSearch(String[] wordsToQuery)
    {
        return new ArrayList<String>();
    }

    //TODO : This method should return a HashSet of Integers containing only
    //-  the documents numbers which are in the given set
    private HashSet<Integer> GetDocumentNumbers(HashSet<IndexEntry> setToSearch)
    {
        return new HashSet<Integer>();
    }

    //- This method takes a set of IndexEntries and returns a new set containing only
    //- those entries with the given document number
    private HashSet<IndexEntry> FilterSetByDocumentNumber(HashSet<IndexEntry> setToFilter, int documentNumber)
    {
        HashSet<IndexEntry> filteredSet = new HashSet<IndexEntry>();

        for (IndexEntry potentialMatch : setToFilter)
        {
            if(potentialMatch.IsInDocument(documentNumber))
            {
                filteredSet.add(new IndexEntry(potentialMatch));
            }
        }

        return filteredSet;
    }


    //- Returns a BufferedReader object for the file found at the path passed as an argument
    private BufferedReader CreateBufferedReaderFromFilePath(String filePathAsString)
    {
        BufferedReader createdBuffer = null;
        File dataFile = new File(filePathAsString);

        if(dataFile.exists())
        {
            try
            {
                FileReader dataFileReader = new FileReader(dataFile);
                createdBuffer = new BufferedReader(dataFileReader);
            }
            catch(FileNotFoundException e)
            {
                e.printStackTrace();
            }
        }

        return createdBuffer;
    }

    //TODO :  This method should open the file at the location specified by pathFileLocation using the
    //- CreateBufferedReaderFromFilePath method, read each line into a String[], and then return that array
    private String[] GetDataFilePaths()
    {
        return new  String[] { "Data.txt" };
    }

    //- This method reads the data files in order and uses them to build the wordIndex
    private void BuildIndexFromDataFiles()
    {

        for (String filePath : GetDataFilePaths())
        {
            BufferedReader dataFileBuffer = CreateBufferedReaderFromFilePath(filePath);
            int fileNumber = 0;

            if (dataFileBuffer != null)
            {
                AddFileContentsToWordIndex(dataFileBuffer, fileNumber);
                fileNumber++;
            }
        }

        return;
    }

    //TODO :  This method should clear the current wordIndex and rebuild it
    private void DiscardAndRebuildIndex()
    {
        return;
    }

    //- This method takes a BufferedReader representing a file ans well as an int representing the file
    //- number and creates IndexEntries for every word in the file
    private void AddFileContentsToWordIndex(BufferedReader fileToAdd, int fileNumber)
    {
        int wordPosition = 0;
        String fileLine;

        try
        {
            while((fileLine = fileToAdd.readLine()) != null)
            {
                String[] wordsInLine = StripAndSeparateString(fileLine);

                for(String word : wordsInLine)
                {
                    AddWordInstanceToIndex(word, fileNumber, wordPosition);
                    wordPosition++;
                }
            }

            fileToAdd.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        return;
    }

    //TODO :  This method should iterate through the elements of the wordIndex and remove any
    //- elements with the given document number
    private void RemoveFileFromWordIndex(int fileNumber)
    {

        return;
    }


    //TODO :  This method should take the provided String, strip it of punctuation and non-word characters, and
    //- then separate the individual words and put them into a String[], which it returns
    private String[] StripAndSeparateString(String lineToProcess)
    {
        return new String[] {"This", "is", "a", "stub"};
    }

    //- This method checks to see if a word is already in the index, if so it adds a new IndexEntry
    //- for the given position, if not it adds the word to the index with a new HashSet containing
    //- the given position
    private void AddWordInstanceToIndex(String wordInstance, int fileNumber, int position)
    {
        IndexEntry indexEntryForWordInstance = new IndexEntry(fileNumber, position);

        if(wordIndex.containsKey(wordInstance))
        {
            HashSet setOfEntriesForWord = wordIndex.get(wordInstance);
            setOfEntriesForWord.add(indexEntryForWordInstance);
        }
        else
        {
            HashSet<IndexEntry> setOfIndexEntriesForWord = new HashSet<IndexEntry>();

            setOfIndexEntriesForWord.add(indexEntryForWordInstance);
            wordIndex.put(wordInstance, setOfIndexEntriesForWord);
        }

        return;
    }


    //TODO :  This method should open the file used to store the filepaths for the datafiles and write
    //- the contents of the FilesInIndex[] array to the file
    private void UpdateFilePaths()
    {
        return;
    }

    //- This method will be broken down into smaller chunks for assignment one I have finished designing the
    //- schema for the data
    private void WriteIndexToFile()
    {

    }

    //- This method will be broken down into smaller chunks for assignment one I have finished designing the
    //- schema for the data
    private void ReadIndexFromFile()
    {

    }

    //- This method will be broken down into smaller chunks for assignment one I have finished designing the
    //- schema for the data
    private void CheckIfDataFilesHaveChanged()
    {

    }

    //|Constructors|\\

    public SearchEngine()
    {
        BuildIndexFromDataFiles();
    }

}
