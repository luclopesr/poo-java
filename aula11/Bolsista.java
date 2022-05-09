package aula11;

import javax.swing.JOptionPane;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa() {
        JOptionPane.showMessageDialog(null, "Renovando bolsa do aluno " + this.getNome() + "...");
    }

    @Override
    public void pagarMensalidade() {
        JOptionPane.showMessageDialog(null, this.getNome() + " é bolsista. Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
