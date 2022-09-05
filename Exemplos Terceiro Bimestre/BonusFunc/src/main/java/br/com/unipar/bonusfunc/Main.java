package br.com.unipar.bonusfunc;


import br.com.unipar.bonusfunc.calc.CalculadoraBonus;
import br.com.unipar.bonusfunc.model.Analista;
import br.com.unipar.bonusfunc.model.Desenvolvedor;
import br.com.unipar.bonusfunc.model.Funcionario;
import br.com.unipar.bonusfunc.model.Gerente;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static void main(String[] args) {
        Desenvolvedor dev = new Desenvolvedor();
        dev.setId(1);
        dev.setNome("Dev Anderson Bosing");
        dev.setSalario(1500);
        dev.setVlBonusPadrao(100);
        
        Gerente gerente = new Gerente();
        gerente.setId(2);
        gerente.setNome("Gerente Anderson Bosing");
        gerente.setSalario(1500);
        gerente.setVlBonusPadrao(100);
        
        
        Analista analista = new Analista();
        analista.setId(2);
        analista.setNome("Analista Anderson Bosing");
        analista.setSalario(1500);
        analista.setVlBonusPadrao(100);
        
        CalculadoraBonus calc = new CalculadoraBonus();
        calc.somar(dev);
        calc.somar(gerente);
        calc.somar(analista);
        calc.retornaBonusTotal();
        
        Date date = new Date();// Pega o dia de hoje
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);//Pega o dia do mes a partir da data
        
    }
    
}
