
package br.com.unipar.bonusfunc.model;

/**
 *
 * @author andersonbosing
 */
public class Desenvolvedor extends Funcionario {
    
    @Override
    public double getBonificacao(){
        
        System.out.println("getBonificacao Desenvolvedor");
        return super.getBonificacao() + 500;
    }
    
}
