package br.com.unipar.primeiroenum;

/**
 *
 * @author andersonbosing
 */
public enum StatusAlunoENUM {
    
    MATRICULADO("Matriculado"),
    PENDENTE("Matricula Pendente"),
    CANCELADO("Matricula Cancelada"),
    PENDENCIA_FINANCEIRA("Aluno possui pendencia financeira. "
            + "Verificar com a Tesouraria");

    private StatusAlunoENUM(String dsEnum) {
        this.dsEnum = dsEnum;
    }
    
    private String dsEnum;

    public String getDsEnum() {
        return dsEnum;
    }
    
}
