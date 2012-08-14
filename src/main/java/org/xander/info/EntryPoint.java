package org.xander.info;

import java.util.logging.Logger;

class EntryPoint {

    static Logger logger = Logger.getLogger(EntryPoint.class.getName());

    public static void main(String[] args) throws ClassNotFoundException {

        //   PropertyConfigurator.configure(args[0]);
        logger.info("Enterring application.");
        if(args.length != 0 ){
            System.out.println("Please use either \"client\" or \"server\" " +
                    "parameters to invoke client or server");
            // System.exit(0);
            if (args[0].equals("client")){
                InfoClient client = new InfoClient();
                client.go();
            } else if (args[0].equals("server")){
                InfoServer server = new InfoServer();
                server.go();
            }
        } else {
            System.out.println("Please use either \"client\" or \"server\" " +
                    "parameters to invoke client or server");
        }
        logger.info("Exiting application.");

    }
}