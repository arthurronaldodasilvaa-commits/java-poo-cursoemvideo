/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

/**
 *
 * @author thurg
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        //System.out.println("Tenho uma caneta " + c1.getModelo() + 
        //        " de ponta " + c1.getPonta());
        c1.status();
        
        System.out.println(" ");
        
        Caneta c2 = new Caneta("KKK", "Vermelha", 1.5f);
        c2.status();
        
    }
    
}
