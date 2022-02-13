package com.company.server;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3000);
            System.out.println("Server start....");

            Socket client = server.accept();
            System.out.println("Server get client on addr" + client.getInetAddress());

            //write data
            DataOutput data_client = new DataOutputStream(client.getOutputStream());
            data_client.writeUTF("Hello on server!");

            client.close();
            server.close();
            System.out.println("Server close....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
