package com.serialization;

import java.io.*;

public class SerializeObject 
{
    public static void main(String[] args) 
    {
        try 
        {
            Employee e = new Employee(100, "Arul");

            FileOutputStream fos = new FileOutputStream("C:\\FileExamples\\C.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(e);

            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully");
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
