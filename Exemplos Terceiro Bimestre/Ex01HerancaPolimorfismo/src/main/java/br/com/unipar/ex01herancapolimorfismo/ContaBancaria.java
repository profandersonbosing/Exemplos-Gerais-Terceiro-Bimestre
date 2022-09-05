/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.unipar.ex01herancapolimorfismo;

/**
 *
 * @author andersonbosing
 */
public class ContaBancaria {
    
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" + "nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + '}';
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public boolean sacar(double valor){
        if ((saldo-valor) >=0){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    private void realizarSaque(double valor){
        if (sacar(valor)){
            System.out.println("Saque efetuado com sucesso, novo saldo = " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de = " + this.saldo);
        }
    }

}
