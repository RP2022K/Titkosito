
package jelszo;

public class Jelszo {

    public static void main(String[] args) {
        CreatePassword jelszo = new CreatePassword(11, 3, 1);
        
        System.out.println("Jelszavad: "+jelszo.getPassword());
    }
    
}
