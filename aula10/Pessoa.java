package aula10;

import javax.swing.JOptionPane;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }

    public void status() {
        JOptionPane.showMessageDialog(null, "--- PESSOA ---\n\nNome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nSexo: " + this.getSexo());
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
    
}
