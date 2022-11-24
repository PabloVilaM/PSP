/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Ejercicio5PSP extends Thread {

    public Ejercicio5PSP(String str){
        super(str);
    }
    public void run(){
        if (getName() == "Waka"){
            System.out.println("Ola son o fio numero 1");
        }
        if (getName() == "Combo"){
            System.out.println("Ola son o fio numero 2");
        }
    }
    public static void main(String[] args) {
        Ejercicio5PSP A = new Ejercicio5PSP("Waka");
        Ejercicio5PSP B = new Ejercicio5PSP("Combo");
        B.start();
        try {
            B.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ejercicio5PSP.class.getName()).log(Level.SEVERE, null, ex);
        }
        A.start();
        
    }
    
}
