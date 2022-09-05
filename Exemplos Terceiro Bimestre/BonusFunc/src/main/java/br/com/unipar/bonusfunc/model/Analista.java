
package br.com.unipar.bonusfunc.model;

/**
 *
 * @author andersonbosing
 */
public class Analista extends Funcionario {
    
    @Override
    public double getBonificacao(){
        
        System.out.println("getBonificacao Analista");
        return super.getBonificacao() + 300;
    }
    
}
