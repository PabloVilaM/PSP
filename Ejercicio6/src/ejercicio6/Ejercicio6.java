package ejercicio6;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio6 extends Thread{


    int cantidadtotal = 50;
    boolean dentro = false;
    public Ejercicio6(String str){
        super(str);
    }
    
    public void run(){

        if (Ejercicio6.super.getName().equals("cajaUno")){
            restar();
        }
        
        if (Ejercicio6.super.getName().equals("cajaDos")){
                sumar();          
        }

    }
    
    public static void main(String[] args) throws InterruptedException {
       Ejercicio6 hilo1 = new Ejercicio6("cajaUno");
       Ejercicio6 hilo11 = new Ejercicio6("cajaUno");
       Ejercicio6 hilo111 = new Ejercicio6("cajaUno");
       Ejercicio6 hilo2 = new Ejercicio6("cajaDos");
       Ejercicio6 hilo22 = new Ejercicio6("cajaDos");
       Ejercicio6 hilo222 = new Ejercicio6("cajaDos");
       
       hilo1.start();
      
       hilo11.start();
       hilo111.start();
       hilo2.start();
       hilo22.start();
       hilo222.start();
       
    }
    
    public synchronized void sumar(){
        while (dentro == true){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dentro = true;
        this.cantidadtotal = cantidadtotal + 10;
            notify();
           System.out.println(cantidadtotal);
            
    }
    
    
    public synchronized void restar(){
        while (dentro == true){
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejercicio6.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dentro = true;
            this.cantidadtotal = this.cantidadtotal - 10;
             dentro = false;
            notify();
           System.out.println(this.cantidadtotal);
            
    }
}
