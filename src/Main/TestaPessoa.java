/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import exercicio6.Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        
        Pessoa P = new Pessoa("Rafael", "Rua Sta Catarina, 267, Sto Antonio Pirapora-MG", "(38) 3740-1304");
        
        System.out.println("Nome: " + P.getNome());
        System.out.println("Endereço: " + P.getEndereço());
        System.out.println("Telefone: " + P.getTelefone());
    }
    
}    
