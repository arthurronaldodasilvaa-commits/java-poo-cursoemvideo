/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaula04;

/**
 *
 * @author thurg
 */
public class ExAula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perfume p1 = new Perfume("Pocco Rabanne", "Phanton", 150, false);
        p1.status();
        
        p1.setOriginal(true);
        System.out.println("");
        if (p1.getOriginal() == false){
            System.out.println("O perfume é realmente falso na verdade!");
        } else {
            System.out.println("O perfume é verdadeiro na verdade!");
        }
    }
    
}
