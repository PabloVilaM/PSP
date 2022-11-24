/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1.psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Ejercicio1PSP extends Thread {
    public Ejercicio1PSP(String str) {
        super(str);
     }
    public void run() {
        for (int i = 0; i < 10 ; i++)
        System.out.println(i + " " + getName()); 
        System.out.println("Termina thread " + getName());
     }
    public static void main (String [] args) {
        new Ejercicio1PSP("Pepe").start();
        new Ejercicio1PSP("Juan").start();
        System.out.println("Termina thread main");
     }
}
