package com.fileoperations;

import java.io.FileInputStream;

public class ReadBytesExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream fis = new FileInputStream("C:\\FileExamples\\A.txt");

            int b;
            while ((b = fis.read()) != -1) 
            {
                System.out.print((char)b);
            }
            fis.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
