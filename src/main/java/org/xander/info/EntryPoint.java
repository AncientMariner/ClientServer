package org.xander.info;

class EntryPoint {
    public static void main(String[] args){

        if (args[0].isEmpty()){
            System.out.println("Please use either \"client\" or \"server\" " +
                    "parameters to invoke client or server");
            return;
        }

        if (args[0].equals("client")){
            InfoClient client = new InfoClient();
            client.go();
        } else if (args[0].equals("server")){
            InfoServer server = new InfoServer();
            server.go();
        }
        System.out.println("Please use either \"client\" or \"server\" " +
                "parameters to invoke client or server");

    }
}