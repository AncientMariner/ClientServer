package org.xander.info;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class InfoClient {
    public void go() throws ClassNotFoundException {
        try {
            Socket s = new Socket("127.0.0.1", 4242);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("Info.ser"));

            Info sysInfo = (Info) objectInputStream.readObject();

            System.out.println("\n" + sysInfo.availableProcessors);
            System.out.println(sysInfo.freeMemory);
            System.out.println(sysInfo.maxMemoryAmount);
            System.out.println(sysInfo.totalMemory);

        } catch (EOFException e){
            System.out.println("There was an internal error, please try again...");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Thre was an internal error in input/output operations, please try again...");
            e.printStackTrace();
        }
    }
}