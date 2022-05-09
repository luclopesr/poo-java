package aula07;

import javax.swing.JOptionPane;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // MÉTODOS
    public void apresentar() {
        JOptionPane.showMessageDialog(null, "____________________\nCHEGOU A HORA!\nApresentamos o lutador " + this.getNome() + "\nDiretamente de " + this.getNacionalidade() + " com " + this.getIdade() + " anos, " + this.getAltura() + " metros de altura e, atualmente, pesando " + this.getPeso() + "kg.\nJá conta com " +  this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " +  this.getEmpates() + " empates...\nÉEEE UM MONSTRO!!!");
    }

    public void status() {
        JOptionPane.showMessageDialog(null, "------ STATUS ------\nNome: " + this.getNome() + "\nNacionalidade: " + this.getNacionalidade() + "\nCategoria: " + this.getCategoria() + "\nIdade: " + this.getIdade() + " anos" + "\nPeso: " + this.getPeso() + "kg" + "\nAltura: " + this.getAltura() + "m" + "\nVITÓRIAS: " + this.getVitorias() + "\nEMPATES: " + this.getEmpates() + "\nDERROTAS: " + this.getDerrotas());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    // CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura,
            float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {

        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    
}
