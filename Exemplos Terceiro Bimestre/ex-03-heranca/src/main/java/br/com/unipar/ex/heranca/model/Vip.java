
package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class Vip extends Ingresso {
    
    private double vlAdicional;

    public double getVlAdicional() {
        return vlAdicional;
    }

    public void setVlAdicional(double vlAdicional) {
        this.vlAdicional = vlAdicional;
    }
    
    @Override
    public void imprimeValor(){
        setValor(getValor() + vlAdicional);
        super.imprimeValor();
    }
    
}
