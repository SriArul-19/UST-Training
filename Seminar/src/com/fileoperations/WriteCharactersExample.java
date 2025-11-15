package com.fileoperations;

import java.io.FileWriter;

public class WriteCharactersExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileWriter fw = new FileWriter("C:\\FileExamples\\B.txt");

            fw.write("Hello\n");
            fw.write("Welocme to trivandrum");

            fw.close();
            System.out.println("Characters Written Successfully");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
