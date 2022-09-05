
package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Ingresso {
    
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void imprimeValor(){
        System.out.println("Valor Ingresso: "+valor);
    }
    
}
