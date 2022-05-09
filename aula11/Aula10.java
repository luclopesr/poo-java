package aula11;

public class Aula10 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo('M');
        v1.status();

        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setSexo('M');
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.pagarMensalidade();
        a1.status();

        Bolsista b1 = new Bolsista();
        b1.setNome("Lucas");
        b1.setIdade(17);
        b1.setSexo('M');
        b1.setMatricula(2222);
        b1.setCurso("Engenharia");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        b1.status();
    }
}
