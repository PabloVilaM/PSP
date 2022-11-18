package ejercicio3;


public class Ejercicio3 extends Thread {

    public Ejercicio3 ThreadA;
    public int contador2;
    
    public Ejercicio3(int contador){
        contador2 = contador;
    }

    public void run(){
        if (contador2 < 20){
            ThreadA =  new Ejercicio3(contador2 + 1);
            System.out.println("Soy el hilo n = " + ThreadA.contador2);
            ThreadA.start();
        }
    }
    
    public static void main(String[] args) {
        Ejercicio3 ThreadA =  new Ejercicio3(0);      
        ThreadA.start();
    }
    
}
