
package br.com.unipar.ex.heranca.model;

/**
 *
 * @author andersonbosing
 */
public class CamaroteSuperior extends Vip {
    
    private double vlAdicionalCamarote;

    public double getVlAdicionalCamarote() {
        return vlAdicionalCamarote;
    }

    public void setVlAdicionalCamarote(double vlAdicionalCamarote) {
        this.vlAdicionalCamarote = vlAdicionalCamarote;
    }
    
    @Override
    public void imprimeValor(){
        super.setValor(super.getValor() + vlAdicionalCamarote);
        super.imprimeValor();
    }
    
    
}
