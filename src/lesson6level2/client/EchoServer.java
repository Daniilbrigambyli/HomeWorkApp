package lesson6level2.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import static java.lang.Thread.interrupted;

public class EchoServer {

    public static final int PORT = 8189;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Ожидаем подключение");
            Socket accept = serverSocket.accept();
            DataInputStream input = new DataInputStream(accept.getInputStream());
            DataOutputStream output = new DataOutputStream(accept.getOutputStream());
            System.out.println("Клиент подключился");
            inputEchoServer(input);
            outputEchoServer(output);
            System.out.println("Клиент отключился");
        } catch (IOException e) {
            System.err.println("Ошибка при подключении к порту " + PORT);
            e.printStackTrace();
        }
    }

    private static void outputEchoServer(DataOutputStream output) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String message = scanner.next();
            output.writeUTF(message);
            if(message.equals("/end")) {
                break;
            }
        }
    }

    private static void inputEchoServer(DataInputStream input) {
        new Thread(() -> {
            while (true) {
                try {
                    String message = input.readUTF();
                    System.out.println("Клиент отправил: " + message);
                    if (message.equals("/end")) {
                        interrupted();
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

