package ejercicio7;


public class Ejercicio7{
    
    private static String mail = null;
    
    public static void main(String[] args) {
        
       Escritura escrito1 = new Escritura("hola", mail);
       Escritura escrito2 = new Escritura("ola", mail);
       Escritura escrito3 = new Escritura("hello", mail);
       
       Lectura lectura1 = new Lectura(mail);
       Lectura lectura2 = new Lectura(mail);
       Lectura lectura3 = new Lectura(mail);
       
       escrito2.start();
       lectura2.start();
       escrito1.start();
       lectura3.start();
       escrito3.start();
       
       lectura1.start();

    }
    
}
