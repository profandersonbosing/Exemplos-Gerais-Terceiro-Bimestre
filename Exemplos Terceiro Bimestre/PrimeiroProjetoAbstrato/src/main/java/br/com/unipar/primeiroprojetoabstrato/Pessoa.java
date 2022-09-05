package br.com.unipar.primeiroprojetoabstrato;

import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public abstract class Pessoa {
    
    private String nome;
    private Date dtNasc;
    private String email;
    private int id;
    private String nrTelefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNrTelefone() {
        return nrTelefone;
    }

    public void setNrTelefone(String nrTelefone) {
        this.nrTelefone = nrTelefone;
    }
    
    public abstract String retornaDados();
    
    public abstract String retornaDados2();
    
}
