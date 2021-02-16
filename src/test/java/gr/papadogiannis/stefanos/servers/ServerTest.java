package gr.papadogiannis.stefanos.servers;

import org.junit.Test;

import java.io.*;
import java.net.Socket;

public class ServerTest {

    @Test
    public void sendDirections() throws IOException, ClassNotFoundException {
        final Socket socket = new Socket("localhost", 8083);
        final ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject("38.047972167426146 23.803995667062868 38.04941691585683 23.79992943834163");
        objectOutputStream.flush();
        final ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        final Object o = objectInputStream.readObject();
        System.out.println(o);
    }

}
