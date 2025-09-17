/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exaula05;

/**
 *
 * @author thurg
 */
public class contaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public contaBanco(String tipo, String dono) {
        this.tipo = tipo;
        this.dono = dono;
        this.status = false;
    }
    
    
    
    public void abrirConta(){
        
    }
    public void fecharConta(){
        
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
        System.out.println("Seu dinheiro foi depositado com sucesso!");
    }
    public void sacar(float valor){
        if (saldo > 0){
            this.saldo = this.saldo - valor;
            System.out.println("Seu dinheiro foi sacado com sucesso!");
        } else {
            System.out.println("Você não tem saldo para sacar!");
        }
    }
    
    public void pagarMensal(){
        
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
