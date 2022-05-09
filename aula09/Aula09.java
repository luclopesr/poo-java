package aula09;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 19, 'M');
        p[1] = new Pessoa("Milena", 24, 'F');

        l[0] = new Livro("Aprendendo Java", "José da Silva", 7, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        l[0].abrir();
        l[0].folhear();
        l[0].detalhes();
    }
}
