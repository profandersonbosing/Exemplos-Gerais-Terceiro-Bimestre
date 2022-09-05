package br.com.unipar.ex.heranca;

import br.com.unipar.ex.heranca.model.Mamifero;
import br.com.unipar.ex.heranca.model.Peixe;

/**
 *
 * @author andersonbosing
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mamifero camelo = new Mamifero();
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setNome("Camelo");
        camelo.setVelocidade(2.0);
        System.out.println(camelo.toString());
        
        Peixe tubarao = new Peixe();
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);
        tubarao.setNome("Tubarao");
        System.out.println(tubarao.toString());
        
        Mamifero ursoDoCanada = new Mamifero();
        ursoDoCanada.setComprimento(180);
        ursoDoCanada.setCor("Amarelo");
        ursoDoCanada.setNome("Urso do Canada");
        ursoDoCanada.setVelocidade(0.5);
        ursoDoCanada.setAlimento("mel");
        System.out.println(ursoDoCanada.toString());  
        
    }
    
}
