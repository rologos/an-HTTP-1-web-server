import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;

public class http1webserver {
    public static void main(String[] args) {

        int port = 8080;

        while (true) {
            try {
                BufferedReader bf = new BufferedReader();
                PrintWriter pw = new PrintWriter();
                ServerSocket serverSocket = new ServerSocket(port);
                serverSocket.accept();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
