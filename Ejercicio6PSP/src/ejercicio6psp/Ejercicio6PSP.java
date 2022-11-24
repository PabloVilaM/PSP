/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6psp;

/**
 *
 * @author Pablo
 */
public class Ejercicio6PSP extends Thread {

    synchronized int dinero = 100;
    public Ejercicio6PSP(String str, int dinerito){
        super(str);
        dinero = dinerito;
    }
    
    public void run(){
        for(int i = 0; i < 10; i++){
          if (getName() == "CajeroSuma"){
            dinero= dinero+10;
            System.out.println("Dinerosuma" + dinero);
          }
        }
        for(int i = 0; i < 10; i++){
         if (getName() == "CajeroResta"){
            dinero= dinero-10;
            System.out.println("Dineroresta" + dinero);
         }
        }
    }

    public static void main(String[] args) {
        Ejercicio6PSP a = new Ejercicio6PSP("CajeroSuma",100);
        Ejercicio6PSP b = new Ejercicio6PSP("CajeroResta", 100);
        a.start();
        b.start();
    }
    
    
}
