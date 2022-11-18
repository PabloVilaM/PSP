package ejercicio4;



public class Ejercicio4 extends Thread {
 
    public Ejercicio4(String str){
        super(str);
    }
    
    public void run(){
        if(Ejercicio4.super.getName().equals("Pares")){
          for(int i = 0; i < 1001; i = i+2){
              System.out.println(i);
          }        
        }
        
        if(Ejercicio4.super.getName().equals("Impares")){
          for(int i = 1; i < 1001; i = i+2){
              System.out.println(i);
          }        
        }
        
        if(Ejercicio4.super.getName().equals("Dous")){
          for(int i = 2; i < 1001; i = i+10){
              System.out.println(i);
          }  
          for(int i = 3; i < 1001; i = i+10){
              System.out.println(i);
          }  
        }
    }
    
    public static void main(String[] args) {
        Ejercicio4 pares = new Ejercicio4("Pares");
        Ejercicio4 impares = new Ejercicio4("Impares");
        Ejercicio4 dousTres = new Ejercicio4("Dous");
        
        pares.start();
        impares.start();
        dousTres.start();
    }
    
}
