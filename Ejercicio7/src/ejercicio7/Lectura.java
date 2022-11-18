package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Lectura extends Thread {
    
    private String mail = null;
    public void run(){
        lector();
    }
    
    public Lectura(String mail){
        this.mail = mail;
    }
    
    
    public synchronized void lector(){
        
        while(mail==null){
            try {
                System.out.println("    *  Buzón vacío. Imposible leer.");
                wait();
                
            } catch (InterruptedException ex) {
                System.out.println("A");
            }
        }
        System.out.println("Lendo: "+mail);
        
        mail = null;
        notify();
   
    }
}
