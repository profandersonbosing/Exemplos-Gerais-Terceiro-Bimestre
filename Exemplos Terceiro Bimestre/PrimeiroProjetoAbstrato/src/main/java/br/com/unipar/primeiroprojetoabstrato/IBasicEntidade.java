
package br.com.unipar.primeiroprojetoabstrato;

/**
 *
 * @author andersonbosing
 */
public interface IBasicEntidade {
    
    int inserir(Object objeto);
    void alterar(Object objeto);
    void consultar(Object objeto);
    void deletar(Object objeto); 
    
}
