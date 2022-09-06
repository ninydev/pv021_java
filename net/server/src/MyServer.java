import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer implements Runnable
{
    private static final int PORT = 8080;


    @Override
    public void run() {

        try {
            // Создаю экземпляр сервера
            ServerSocket srv = new ServerSocket(PORT);
            System.out.println("Ожидаю соединения: ");
            // Ожидаю соединения
            Socket socket = srv.accept();
            try {
                System.out.println("Соединение произошло: " + socket);
                // Можем создавать новый поток. Зациклить ожидание соединений и так далее

                // Получаю поток на вход
                BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));

                while (true) {
                    // Читаю очередную строку
                    String str = in.readLine();
                    // Если эта строка -  команда END - выхожу из чтения потока
                    if(str.equals("END")) {
                        break;
                    }
                    // Вывожу входящую информацию на экран сервера
                    System.out.println(str);
                }



            }catch (Exception ex) {
                System.out.println(" Ошибка чтения данных");
                System.out.println(ex.getMessage());
            } finally {
                socket.close();
                srv.close();
            }
        }
        catch (Exception ex) {
            System.out.println("Ошибка создания сервера");
            System.out.println(ex.getMessage());
        }


    }
}
