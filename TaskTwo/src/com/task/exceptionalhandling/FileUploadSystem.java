package com.task.exceptionalhandling;

import java.io.*;

public class FileUploadSystem 
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
        try 
        {
            fis = new FileInputStream("C:\\ExceptionHandling\\A.txt");
            int data;
            while ((data = fis.read()) != -1) 
            {
                System.out.print((char) data);
            }
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found!");
        } 
        catch (IOException e) 
        {
            System.out.println("IO Error occurred!");
        }
        catch (SecurityException e) 
        {
            System.out.println("No permission to read the file!");
        } 
        finally 
        {
            try 
            {
                if (fis != null) fis.close();
                System.out.println("\nFile closed successfully.");
            } 
            catch (IOException e) 
            {
                System.out.println("Error closing file.");
            }
        }
    }
}
