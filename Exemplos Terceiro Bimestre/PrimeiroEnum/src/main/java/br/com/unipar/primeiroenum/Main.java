package br.com.unipar.primeiroenum;

import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setDtMatricula(new Date());
        aluno.setId(10);
        aluno.setNome("Anderson");
        aluno.setRegistroAcademico("17221");
        aluno.setStatusAluno(StatusAlunoENUM.PENDENCIA_FINANCEIRA);
        
        if (aluno.getStatusAluno() == StatusAlunoENUM.PENDENCIA_FINANCEIRA) {
            System.out.println("pendencia financeira");
        } else {
            System.out.println(aluno.toString());
        }
        
        
    }
    
}
