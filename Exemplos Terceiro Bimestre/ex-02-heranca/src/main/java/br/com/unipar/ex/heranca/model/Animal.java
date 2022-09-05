package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Animal {
    
    private String nome;
    private double comprimento;
    private int nrPatas; 
    private String cor;
    private String ambiente; 
    private double velocidade;

    public Animal() {
        this.nrPatas = 4;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNrPatas() {
        return nrPatas;
    }

    public void setNrPatas(int nrPatas) {
        this.nrPatas = nrPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", comprimento=" + comprimento + ", nrPatas=" + nrPatas + ", cor=" + cor + ", ambiente=" + ambiente + ", velocidade=" + velocidade + '}';
    }
    
}
