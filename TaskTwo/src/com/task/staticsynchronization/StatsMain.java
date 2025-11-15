package com.task.staticsynchronization;

import java.io.*;

class HospitalStats implements Serializable 
{
    static int patientCount = 0;

    public static synchronized void saveStats() throws Exception 
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\StaticSynchronization\\stats.ser"));
        oos.writeObject(new HospitalStats());
        oos.close();
        System.out.println("Stats Saved: Count = " + patientCount);
    }
}

public class StatsMain 
{
    public static void main(String[] args) 
    {
        Runnable task = () -> {
            HospitalStats.patientCount++;
            try { HospitalStats.saveStats(); } catch (Exception e) {System.out.println(e);}
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}
