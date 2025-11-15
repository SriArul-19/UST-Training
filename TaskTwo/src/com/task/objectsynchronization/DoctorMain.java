package com.task.objectsynchronization;

import java.io.*;

class Doctor implements Serializable 
{
    String name;

    Doctor(String name) 
    {
        this.name = name;
    }

    public synchronized void serializeDoctor() throws Exception 
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ObjectSynchronization\\"+name +".ser"));
        oos.writeObject(this);
        oos.close();
        System.out.println("Serialized doctor: " + name);
    }
}

public class DoctorMain 
{
    public static void main(String[] args) 
    {
        Doctor d1 = new Doctor("Dr.Karthik");
        Doctor d2 = new Doctor("Dr.Ragu");

        new Thread(() -> { 
        	try 
        	{ 
        		d1.serializeDoctor(); 
        	} 
        	catch (Exception e) 
        	{
        		System.out.println(e);
        	} 
        	}).start();
        new Thread(() -> { 
        	try 
        	{ 
        		d2.serializeDoctor();
        	} 
        	catch (Exception e) 
        	{
        		System.out.println(e);
        	} 
        	}).start();
    }
}
