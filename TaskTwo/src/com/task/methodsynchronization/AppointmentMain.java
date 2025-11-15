package com.task.methodsynchronization;

import java.io.*;

class Appointment implements Serializable 
{
    String patient;
    String doctor;

    Appointment(String p, String d) 
    {
        patient = p;
        doctor = d;
    }
}

class AppointmentManager 
{
    synchronized void saveAppointment(Appointment a) throws Exception 
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\MethodSynchronization\\appointments.ser", true));
        oos.writeObject(a);
        oos.close();
        System.out.println("Appointment Saved for " + a.patient);
    }
}

public class AppointmentMain 
{
    public static void main(String[] args) 
    {
        AppointmentManager am = new AppointmentManager();

        new Thread(() -> {
            try 
            { 
            	am.saveAppointment(new Appointment("Arul", "Dr. Ravi")); 
            } 
            catch (Exception e) 
            {
            	System.out.println(e);
            }
        }).start();

        new Thread(() -> {
            try 
            { 
            	am.saveAppointment(new Appointment("Arun", "Dr. Ram")); 
            } 
            catch (Exception e) 
            {
            	System.out.println(e);
            }
        }).start();
    }
}
