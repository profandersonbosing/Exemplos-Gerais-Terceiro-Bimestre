
package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Peixe extends Animal {
    
    private String caracteristicas;

    public Peixe() {
        //tem 0 patas, seu ambiente é o mar (padrão), cor cinzenta (padrão).
        super();
        super.setNrPatas(0);
        super.setAmbiente("mar");
        super.setCor("cinza");
        setCaracteristicas("Barbatana e Cauda");
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Peixe{" + "caracteristicas=" + caracteristicas + " } " + 
            super.toString();
    }
    
    
    
}
