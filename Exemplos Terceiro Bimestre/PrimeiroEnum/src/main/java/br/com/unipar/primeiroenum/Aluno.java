package br.com.unipar.primeiroenum;

import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public class Aluno {
    
    private int id;
    private String nome;
    private Date dtMatricula;
    private String registroAcademico;
    private StatusAlunoENUM statusAluno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtMatricula() {
        return dtMatricula;
    }

    public void setDtMatricula(Date dtMatricula) {
        this.dtMatricula = dtMatricula;
    }

    public String getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(String registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public StatusAlunoENUM getStatusAluno() {
        return statusAluno;
    }

    public void setStatusAluno(StatusAlunoENUM statusAluno) {
        this.statusAluno = statusAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + 
                ", dtMatricula=" + dtMatricula + 
                ", registroAcademico=" + registroAcademico + 
                ", statusAluno=" + statusAluno.getDsEnum() + '}';
    }
    
    
}
