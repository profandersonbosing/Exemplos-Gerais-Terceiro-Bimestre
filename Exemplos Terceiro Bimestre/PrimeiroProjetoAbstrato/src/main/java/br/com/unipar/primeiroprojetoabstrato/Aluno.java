package br.com.unipar.primeiroprojetoabstrato;

/**
 *
 * @author andersonbosing
 */
public class Aluno extends Pessoa {
    
    private String registroAcademico;

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }
    
   
    @Override
    public String retornaDados() {
        
        return "Nome: "+ getNome() + "Registro Academico: " +this.registroAcademico;
    
    }

    @Override
    public String retornaDados2() {
        throw new UnsupportedOperationException("Batatinha frita 123"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
