package com.task.staticsynchronization;

import java.io.*;

class ClinicConfig implements Serializable 
{
    static String hospitalName = "City Hospital";
    static String location = "Chennai";

    public static synchronized void saveConfig() throws Exception 
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\StaticSynchronization\\config.ser"));
        oos.writeObject(new ClinicConfig());
        oos.close();
        System.out.println("Config Saved");
    }
}

public class ConfigMain 
{
    public static void main(String[] args) 
    {
        Thread t1 = new Thread(() -> { 
        	try 
        	{ 
        		ClinicConfig.saveConfig(); 
        	} 
        	catch (Exception e) 
        	{
        		System.out.println(e);
        	} 
        });
        Thread t2 = new Thread(() -> { 
        	try 
        	{ 
        		ClinicConfig.saveConfig(); 
        	} 
        	catch (Exception e) 
        	{
        		System.out.println(e);
        	} 
        });

        t1.start();
        t2.start();
    }
}
