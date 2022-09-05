/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.unipar.primeiroprojetoabstrato;

import java.util.Date;

/**
 *
 * @author andersonbosing
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aluno p = new Aluno();
        p.setNome("Anderson");
        p.setId(6);
        p.setRegistroAcademico("17221");
        p.setDtNasc(new Date());
        
        System.out.println(p.retornaDados2());
        
    }
    
}
