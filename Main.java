import Клиент.ClientGUI;
import Сервер.ServerWindow;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}