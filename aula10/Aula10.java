package aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");

        p1.setIdade(19);
        p2.setIdade(16);
        p3.setIdade(34);
        p4.setIdade(40);

        p1.setSexo('M');
        p2.setSexo('F');
        p3.setSexo('M');
        p4.setSexo('F');

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        //p1.receberAumento(550.20f);
        //p2.mudaTrabalhando();
        //p4.cancelarMatr();

        p1.status();
        p2.status();
        p3.status();
        p4.status();
    }
}
