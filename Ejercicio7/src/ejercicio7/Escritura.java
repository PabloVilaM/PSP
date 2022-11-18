package ejercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;



public class Escritura extends Thread {
     private String txt;
     private String mail;
        
    public Escritura(String texto, String mail){
        txt = texto;
        this.mail = mail;
    }
     
    public void run(){
        escritor(txt);
    }
    
    public synchronized void escritor(String mai){
        
        while(mail!=null){
            
            try {
                System.out.println("    *   Non se pode escribir. Buzón cheo.");
                wait();
                
            } catch (InterruptedException ex) {
                System.out.println("b");
            }
        }
        
        this.mail = mai;
        
        System.out.println("Escribindo: "+mail);
        
        notify();
    }
}
