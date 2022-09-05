package br.com.unipar.ex.heranca.model;
    
public class CamaroteInferior extends Vip {
    
    private String dsLocalizacao;

    public String getDsLocalizacao() {
        return dsLocalizacao;
    }

    public void setDsLocalizacao(String dsLocalizacao) {
        this.dsLocalizacao = dsLocalizacao;
    }
    
    public void imprimeLocalizacao(){
        System.out.println("Localização = " + dsLocalizacao);
    }
    
}
