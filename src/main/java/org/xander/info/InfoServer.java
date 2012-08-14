package org.xander.info;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class InfoServer {

    static Logger logger = Logger.getLogger(InfoServer.class.getName());

    public void go (){

        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            Info info = new Info();

            while(true){
                Socket sock = serverSocket.accept();

                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("Info.ser"));
                objectOutputStream.writeObject(info);
            }
        } catch (FileNotFoundException e){
            System.out.println("Resource for inner usage was not found, please try again...");
            logger.severe("FileNotFoundException happens...");
            e.printStackTrace();

        } catch (IOException e){
            System.out.println("There was an error in input/output operations, please try again...");
            logger.severe("IOException happens...");
            e.printStackTrace();
        }
    }
}