import java.io.*;
import java.net.*;
import java.util.logging.Logger;

public class Server{
    static Logger logger = Logger.getLogger("global");

    public static void main(String[] args){
        ServerSocket serversocket = new ServerSocket(8080);
        logger.info("Socket funzionale, accetto connessione...");

        Socket socket = ServerSocket.accept();
        logger.info("Connessione accettata");

        ObjectOutputStream outS = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inpS = new ObjectInputStream(socket.getInputStream());

        String name = (String) inpS.readObject();
        outS.writeObject("Hello"+ name);

        socket.close();

     }catch(EOFException e) {
            logger.severe("Problemi con la connessione:"+
                 e.getMessage()); e.printStackTrace();
      }catch(Throwable t)

    {
        logger.severe("Lanciata Throwable:" +
                t.getMessage());
        t.printStackTrace();
    }

    }
}