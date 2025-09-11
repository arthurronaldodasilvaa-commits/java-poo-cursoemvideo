/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exaula02;

/**
 *
 * @author thurg
 */
public class Porta {
    boolean aberta;
    int tamanho;
    boolean fechadura;
    
    void status(){
        System.out.println("A porta está aberta? " + this.aberta);
        System.out.println("A porta tem " + tamanho + " de tamanho!");
        System.out.println("A porta tem fechadura? " + this.fechadura);
    }
    
    void abrir(){
        this.aberta = true;
        System.out.println("A porta abriu!");
    }
    
    void fechar(){
        this.aberta = false;
        System.out.println("A porta fechou!");
    }
    
}
