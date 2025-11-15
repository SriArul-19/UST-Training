package com.task.objectsynchronization;

import java.io.*;

class FileExporter 
{
    private final Object lock = new Object();

    public void export(Object obj, String fileName) 
    {
        synchronized (lock) 
        {
            try
            {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ObjectSynchronization\\"+fileName));
                oos.writeObject(obj);
                oos.close();
                System.out.println("Exported: " + fileName);
            } 
            catch (Exception e) 
            {
            	System.out.println(e);
            }
        }
    }
}

public class FileExporterMain 
{
    public static void main(String[] args) 
    {
        FileExporter fe1 = new FileExporter();
        FileExporter fe2 = new FileExporter();

        new Thread(() -> fe1.export("Report A", "A.ser")).start();
        new Thread(() -> fe1.export("Report B", "B.ser")).start();
        new Thread(() -> fe2.export("Report C", "C.ser")).start();
    }
}
