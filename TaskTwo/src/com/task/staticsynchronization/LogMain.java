package com.task.staticsynchronization;

import java.io.*;

class LogWriter 
{
    public static synchronized void writeLog(String msg) 
    {
        try 
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\StaticSynchronization\\log.ser", true));
            oos.writeObject(msg);
            oos.close();
            System.out.println("Log Written: " + msg);
        } 
        catch (Exception e) 
        {
        	System.out.println(e);
        }
    }
}

public class LogMain 
{
    public static void main(String[] args) 
    {
        new Thread(() -> LogWriter.writeLog("Started System")).start();
        new Thread(() -> LogWriter.writeLog("Database Connected")).start();
    }
}
