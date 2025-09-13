/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exaula04;

/**
 *
 * @author thurg
 */
public class Perfume {
    String marca;
    String modelo;
    int ml;
    boolean original;

    public Perfume(String marca, String modelo, int ml, boolean original) {
        this.marca = marca;
        this.modelo = modelo;
        this.ml = ml;
        this.original = original;
    }
    
    public void status(){
        System.out.println("Meu Perfume: ");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tem " + ml + " MLs");
        System.out.println("É original? " + original);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMl() {
        return ml;
    }

    public boolean getOriginal() {
        return original;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public void setOriginal(boolean original) {
        this.original = original;
    }
}
