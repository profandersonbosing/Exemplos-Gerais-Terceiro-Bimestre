package br.com.unipar.bonusfunc.model;

/**
 *
 * @author andersonbosing
 */
public class Gerente extends Funcionario {
    
    @Override
    public double getBonificacao(){
        
        System.out.println("getBonificacao Gerente");
        return super.getBonificacao() + 1000;
    }
    
}
