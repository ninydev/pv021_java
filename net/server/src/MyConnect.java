import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MyConnect extends Thread implements Runnable
{
    static List<MyConnect> connectList = new ArrayList<MyConnect>();

    Socket socket;
    BufferedReader in;
    PrintWriter out;

    /**
     * Строит работу с соединением на основе 1 сокета
     * @param socket
     */
    public MyConnect(Socket socket) {
        try {
            this.socket = socket;
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            connectList.add(this);
        } catch (Exception ex) {
            System.out.println(" Ошибка открытия потока данных");
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Метод отсылающий сообщение в поток
     * @param msg
     */
    public void sendMessage(String msg) {
        out.println(msg);
    }

    /**
     * Метод отсылающий сообщение в всем клиентам
     * @param msg
     */
    public void sendMessageToAll(String msg) {
        for (MyConnect c:connectList
             ) {
            c.sendMessage(msg);
        }
        System.out.println("Send: " + msg);
    }


    @Override
    public void run() {
            try {
                while (true) {
                    String msg = in.readLine();
                    if(msg.equals("BYE")) {
                        System.out.println(" Клиент отключился ");
                        socket.close();
                        connectList.remove(this);
                        break;
                    } else {
                        sendMessageToAll(msg);
                    }
                }
            } catch (Exception ex) {
                System.out.println(" Ошибка открытия потока данных");
                System.out.println(ex.getMessage());
            }

    }

}
