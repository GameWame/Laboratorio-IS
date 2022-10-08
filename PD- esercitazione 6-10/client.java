 import java.io.*;
 import java.net.*;
 import java.util.logging.Logger;


 public class Client{
  static Logger logger = Logger.getLogger("global");
  public static void main(String args[]) { try{
   Socket socket = new Socket ("localhost", 8080); ObjectOutputStream out = new
           ObjectOutputStream(socket.getOutputStream()); ObjectInputStream in = new
           ObjectInputStream(socket.getInputStream()); out.writeObject("Gianluca");
           System.out.println(in.readObject()); socket.close();
  }catch(EOFException e) {
   logger.severe("Problemi con la connessione:"+ e.getMessage());
   e.printStackTrace();}

   catch(Throwable T){
   logger.severe("Lanciata Throwable" + t.getMessage());
   t.printStackTrace();
    }
  }
 }
