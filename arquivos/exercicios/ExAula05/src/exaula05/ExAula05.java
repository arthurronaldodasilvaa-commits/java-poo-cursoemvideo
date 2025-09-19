/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaula05;

/**
 *
 * @author thurg
 */
public class ExAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        contaBanco c1 = new contaBanco("CC", "Arthur");
        c1.depositar(150.50f);
        //System.out.println(c1.getSaldo());
        c1.depositar(50);
        c1.getSaldo();
    }
    
}
