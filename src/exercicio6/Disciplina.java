/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;


public class Disciplina {
    private int Codigo;
    private String Nome;
    private String Periodo;

    public String getNome() {
        return this.Nome;
    }

    public int getCodigo() {
        return this.Codigo;
    }

    public String getPeriodo() {
        return this.Periodo;
    }

    public void setNome(String n) {
        this.Nome = n;
    }

    public void setCodigo(int c) {
        this.Codigo = c;
    }

    public void setPeriodo(String p) {
        this.Periodo = p;
    }

    public Disciplina(String N, int C, String P) {
        setNome(N);
        setCodigo(C);
        setPeriodo(P);
    }

}
