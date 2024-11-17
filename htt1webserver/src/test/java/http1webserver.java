import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class http1webserver {
    public static void main(String[] args) {

        int port = 8080;

        while (true) {
            try {
                ServerSocket serverSocket = new ServerSocket(port);
                Socket clientSocket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String request = in.readLine();

                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                System.out.println("Request: " + request);

                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/plain");
                out.println();
                out.println("Hello from the server!");

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
