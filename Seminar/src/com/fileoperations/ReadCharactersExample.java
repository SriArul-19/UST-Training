package com.fileoperations;

import java.io.FileReader;

public class ReadCharactersExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileReader fr = new FileReader("C:\\FileExamples\\B.txt");

            int ch;
            while ((ch = fr.read()) != -1) 
            {
                System.out.print((char) ch);
            }

            fr.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
