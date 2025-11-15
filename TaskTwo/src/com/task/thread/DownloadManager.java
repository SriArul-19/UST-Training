package com.task.thread;

class FileChunkDownloader extends Thread 
{
    int chunk;

    FileChunkDownloader(int chunk) 
    {
        this.chunk = chunk;
    }

    public void run() 
    {
        try 
        {
            System.out.println("Downloading chunk " + chunk);
            Thread.sleep(2000);
            System.out.println("Chunk " + chunk + " downloaded.");
        } 
        catch (Exception e) 
        {
        	System.out.println(e);
        }
    }
}

public class DownloadManager 
{
    public static void main(String[] args) throws Exception 
    {
        Thread t1 = new FileChunkDownloader(1);
        Thread t2 = new FileChunkDownloader(2);
        Thread t3 = new FileChunkDownloader(3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Download complete");
    }
}
