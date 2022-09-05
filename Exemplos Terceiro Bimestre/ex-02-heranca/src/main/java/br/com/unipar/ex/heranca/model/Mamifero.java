package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Mamifero extends Animal {
    
    private String alimento;

    public Mamifero() {
        
        super();
        super.setAmbiente("terra");
        
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "alimento=" + alimento + '}' + super.toString();
    }
    
}
