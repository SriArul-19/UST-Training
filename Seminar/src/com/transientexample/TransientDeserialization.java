package com.transientexample;

import java.io.*;

public class TransientDeserialization 
{
    public static void main(String[] args) 
    {
        try 
        {
        	FileInputStream fis=new FileInputStream("C:\\FileExamples\\D.ser");
            ObjectInputStream ois =new ObjectInputStream(fis);

            User u = (User) ois.readObject();

            System.out.println("Username: " + u.username);
            System.out.println("Password (transient): " + u.password); // null

            ois.close();
            fis.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
