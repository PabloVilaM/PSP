package ejercicio5;


public class Ejercicio5 extends Thread {

    public Ejercicio5(String str){
        super(str);
    }
    
    public void run(){
        if (Ejercicio5.super.getName().equals("threadA")){
            System.out.println("Ola, son fio número 1");
        }
        if (Ejercicio5.super.getName().equals("threadB")){
            System.out.println("Ola, son fio número 2");   
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Ejercicio5 threadA = new Ejercicio5("threadA");
        Ejercicio5 threadB = new Ejercicio5("threadB");
        
        threadB.start();
        //threadB.join();
        //threadB.setPriority(10);
        //threadA.setPriority(1);
        threadA.start();
    }
    
}
