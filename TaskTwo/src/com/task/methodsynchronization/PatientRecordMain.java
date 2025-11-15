package com.task.methodsynchronization;

import java.io.*;

class Patient implements Serializable 
{
    String name;
    int age;

    Patient(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}

class PatientSerializer 
{
    synchronized void savePatient(Patient p) throws Exception 
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\MethodSynchronization\\patients.ser", true));
        oos.writeObject(p);
        oos.close();
        System.out.println("Saved: " + p.name);
    }
}

class PatientThread extends Thread 
{
    PatientSerializer ps;
    Patient p;

    PatientThread(PatientSerializer ps, Patient p) 
    {
        this.ps = ps;
        this.p = p;
    }

    public void run() 
    {
        try 
        {
            ps.savePatient(p);
        } 
        catch (Exception e) 
        {
        	System.out.println(e);
        }
    }
}

public class PatientRecordMain 
{
    public static void main(String[] args) 
    {
        PatientSerializer ps = new PatientSerializer();

        new PatientThread(ps, new Patient("Ram", 30)).start();
        new PatientThread(ps, new Patient("Ravi", 40)).start();
    }
}
