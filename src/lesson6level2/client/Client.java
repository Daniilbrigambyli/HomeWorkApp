package lesson6level2.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private static final String SERVER_ADDR = "localhost";
    private static final int SERVER_PORT = 8189;

    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;


    public static void main(String[] args) {
        try {
            inEchoServer();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void inEchoServer() throws Exception {
        socket = new Socket(SERVER_ADDR,SERVER_PORT);
        System.out.println("Клиент запущен");
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());
        inMessegeClient(in);
        outMessageClient(out);

    }

    private static void outMessageClient(DataOutputStream out) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String message = scanner.next();
            out.writeUTF(message);
            if(message.equals("/end")) {
                break;
            }
        }
    }

    private static void inMessegeClient(DataInputStream in) {
        new Thread(() -> {
            while (true) {
                try {
                    String message = in.readUTF();
                    System.out.println("Сервер отправил: " + message);
                    if (message.equals("/end")) {
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}


