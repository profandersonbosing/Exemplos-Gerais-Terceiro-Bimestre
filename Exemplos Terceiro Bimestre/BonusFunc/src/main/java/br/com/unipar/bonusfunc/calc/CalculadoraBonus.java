package br.com.unipar.bonusfunc.calc;

import br.com.unipar.bonusfunc.model.Analista;
import br.com.unipar.bonusfunc.model.Desenvolvedor;
import br.com.unipar.bonusfunc.model.Funcionario;
import br.com.unipar.bonusfunc.model.Gerente;


public class CalculadoraBonus {
    
    private double vlTotalBonus;
    
    public void somar(Funcionario func) {
        vlTotalBonus = vlTotalBonus + func.getBonificacao();
    }
    
    public void retornaBonusTotal() {
        System.out.println("Valor Total de Bonus = " + vlTotalBonus);
    }
    
    
}
