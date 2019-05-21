/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import exercicio6.Disciplina;

public class TesteDisciplina {
    public static void main(String[] args) {
     Disciplina D = new Disciplina("Rafael", 18, "4º Periodo");
        
        System.out.println("Nome: " + D.getNome());
        System.out.println("Código: " + D.getCodigo());
        System.out.println("Período: " + D.getPeriodo());
    }   
}
 