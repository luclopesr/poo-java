package aula05;

import javax.swing.JOptionPane;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Método Construtor
    public ContaBanco() {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    // Métodos Personalizados
    public void estadoAtual() {
        JOptionPane.showMessageDialog(null, "Conta nº " + this.getNumConta() +
        "\nTipo: " + this.getTipo() +
        "\nDono: " + this.getDono() +
        "\nSaldo: R$" + this.getSaldo() +
        "\nStatus: " + this.getStatus());
    }

    public void abrirConta(String tipo) {
        this.setTipo(tipo);
        this.setStatus(true);
        JOptionPane.showMessageDialog(null, "Conta aberta com sucesso por " + this.getDono() + "!");
        
        if (this.tipo.equalsIgnoreCase("CC")) {
            this.setSaldo(50f);
        } else if (this.tipo.equalsIgnoreCase("CP")) {
            this.setSaldo(150f);
        }
    }

    public void fecharConta() {
        if(this.getSaldo() > 0) {
            JOptionPane.showMessageDialog(null, "Conta não pode ser fechada pois ainda tem dinheiro!");
        } else if(this.getSaldo() < 0) {
            JOptionPane.showMessageDialog(null, "Conta não pode ser fechada pois tem debito!");
        } else {
            this.setStatus(false);
            JOptionPane.showMessageDialog(null, "Conta fechada com sucesso por " + this.getDono() + "!");
        }
    }

    public void depositar(float valor) {
        if(this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso por " + this.getDono() + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float valor) {
        if(this.getStatus() == true) {
            if(this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                JOptionPane.showMessageDialog(null, "Saque realizado com sucesso por " + this.getDono() + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insufissiente para saque!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int valor = 0;

        if (this.tipo.equalsIgnoreCase("CC")) {
            valor = 12;
        } else if (this.tipo.equalsIgnoreCase("CP")) {
            valor = 20;
        }

        if(this.getStatus() == true) {
            if(this.getSaldo() > valor) {
                this.setSaldo(this.getSaldo() - valor);
                JOptionPane.showMessageDialog(null, "Mensalidade paga com sucesso por " + this.getDono() + "!");
            } else {
                JOptionPane.showMessageDialog(null, "Saldo insufissiente!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossivel pagar uma conta fechada!");
        }
    }

    // Métodos Especiais (Getters e Setters)
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
