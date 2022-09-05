/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.ex01herancapolimorfismo;

/**
 *
 * @author andersonbosing
 */
public class ContaCorrente extends ContaBancaria {
    
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public boolean sacar(double valor){
        
        double saldoComLimite = this.getSaldo() + limite;
        
        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);
            return true;
        }
        
        return false;
    }
    
    
}
