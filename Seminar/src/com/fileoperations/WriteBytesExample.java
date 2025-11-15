package com.fileoperations;

import java.io.FileOutputStream;

public class WriteBytesExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream("C:\\FileExamples\\A.txt");
            String s="Welcome to UST";
            byte b[]=s.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Bytes Written Successfully");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
