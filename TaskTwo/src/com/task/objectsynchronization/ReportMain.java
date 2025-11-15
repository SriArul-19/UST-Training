package com.task.objectsynchronization;

import java.io.*;

class PatientReport implements Serializable 
{
    String reportName;

    PatientReport(String name) 
    {
        this.reportName = name;
    }
}

class ReportExporter 
{

    public void exportReport(PatientReport report) 
    {
        synchronized (report) 
        {
            try 
            {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\ObjectSynchronization\\"+report.reportName + ".ser"));
                oos.writeObject(report);
                oos.close();
                System.out.println("Exported: " + report.reportName);
            } 
            catch (Exception e) 
            {
            	System.out.println(e);
            }
        }
    }
}

public class ReportMain 
{
    public static void main(String[] args) 
    {
        ReportExporter re = new ReportExporter();

        PatientReport r1 = new PatientReport("R1");
        PatientReport r2 = new PatientReport("R2");

        new Thread(() -> re.exportReport(r1)).start();
        new Thread(() -> re.exportReport(r2)).start();
        new Thread(() -> re.exportReport(r1)).start(); // waits for r1 lock
    }
}
