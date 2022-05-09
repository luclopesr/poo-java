package aula05;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aula05 {
    public static void main(String[] args) {
        float valor;
        char opcao;
        ContaBanco p1 = new ContaBanco();
        do {// Menu Principal
            opcao = menuPrincipal();
            switch (opcao) {
                case 'A': {
                    Random gerador = new Random();
                    p1.setNumConta(gerador.nextInt(10000));
                    p1.setDono(JOptionPane.showInputDialog(null, "Informe o seu nome:"));
                    p1.abrirConta(JOptionPane.showInputDialog(null, "Informe o tipo da conta:\n\n'CC' para Conta Corrente\n'CP' para Conta Poupança"));
                    break;
                }

                case 'B': {
                    String strValor = JOptionPane.showInputDialog(null, "Informe o valor a ser depositado:");
                    valor = Float.parseFloat(strValor);
                    p1.depositar(valor);
                    break;
                }

                case 'C': { 
                    String strValor = JOptionPane.showInputDialog(null, "Informe o valor a ser sacado:");
                    valor = Float.parseFloat(strValor);
                    p1.sacar(valor);
                    break;
                }

                case 'D': {
                    p1.pagarMensal();
                    break;
                }

                case 'E': { 
                    p1.fecharConta();
                    break;
                }

                case 'F': { 
                    p1.estadoAtual();
                    break;
                }

                case 'G': { 
                    break;
                }

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    opcao = 'W';
            }
        } while (opcao != 'G');
    }

    public static char menuPrincipal() {
        char opcao = 'G';
        String strOpcao = JOptionPane.showInputDialog(null, "Menu Principal \n"
        + "A) Abrir conta\n"
        + "B) Depositar\n"
        + "C) Sacar\n"
        + "D) Pagar mensalidade\n"
        + "E) Fechar conta\n"
        + "F) Estado atual da conta\n"
        + "G) Sair do Programa");
        opcao = strOpcao.toUpperCase().charAt(0);
        return opcao;
    }
}
