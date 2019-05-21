/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author rafae
 */
public class Pessoa {
    private String Nome;
    private String Endereço;
    private String Telefone;
    
    public String getNome(){
        return this.Nome;
    }
    
    public String getEndereço(){
        return this.Endereço;
    }
    
    public String getTelefone(){
        return this.Telefone;
    }
    
    public void setNome(String n){
        this.Nome = n;
    }
    
    public void setEndereço(String e){
        this.Endereço = e;
    }
    
    public void setTelefone(String t){
        this.Telefone = t;
    }
    
    public Pessoa(String N, String E, String T){
        setNome(N);
        setEndereço(E);
        setTelefone(T);
    }
    
}