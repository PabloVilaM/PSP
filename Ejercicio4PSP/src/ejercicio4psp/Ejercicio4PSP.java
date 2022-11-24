/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4psp;

/**
 *
 * @author Pablo
 */
public class Ejercicio4PSP extends Thread {

    public Ejercicio4PSP(String str){
        super(str);
    }
    
    public void run(){
        if (getName() == "Pares"){
            for (int i = 0; i<1001;i = i+2){
                System.out.println(i + "Pares");
            }
        }
        if (getName() == "Impares"){
            for (int i = 1; i<1001;i = i+2){
                System.out.println(i + "Impares");
            }
        }
        if (getName() == "Dous"){
            for (int i = 2; i<1001;i = i+10){
                System.out.println(i + "Doses");
            }
            for (int i = 3; i<1001;i = i+10){
                System.out.println(i + "Tres");
            }
        }
    }

    public static void main(String[] args) {
        new Ejercicio4PSP("Pares").start();
        new Ejercicio4PSP("Impares").start();
        new Ejercicio4PSP("Dous").start();
        
        
    }
    
}
