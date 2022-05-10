package aula14;

import javax.swing.JOptionPane;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;

    protected void ganharExp() {
        this.setExperiencia(this.getExperiencia() + 1);
    }

    public void status() {
        JOptionPane.showMessageDialog(null, "--- STATUS PESSOA ---\n\nNOME: " + this.getNome() + "\nIDADE: " + this.getIdade() + " anos\nSEXO: " + this.getSexo() + "\nEXPERIÊNCIA: " + this.getExperiencia());
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    
}
