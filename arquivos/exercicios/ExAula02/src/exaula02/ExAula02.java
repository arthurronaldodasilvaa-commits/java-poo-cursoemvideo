/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaula02;

/**
 *
 * @author thurg
 */
public class ExAula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Porta p1 = new Porta();
        p1.abrir();
        p1.fechadura = true;
        p1.tamanho = 40;
        
        p1.status();
    }
    
}
