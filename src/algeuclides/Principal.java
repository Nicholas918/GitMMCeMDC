package algeuclides;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Conversor obj = new Conversor();

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o 1° Número a ser convertido:",
                "Algoritmo de Euclides",
                JOptionPane.QUESTION_MESSAGE));
        obj.setNum1(num1);

        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Digite o 2° Número a ser convertido:",
                "Algoritmo de Euclides",
                JOptionPane.QUESTION_MESSAGE));
        obj.setNum2(num2);

        if (num1 == 0 && num2 == 0) {
            JOptionPane.showMessageDialog(null, "Não existe MMC e MDC de 0 e 0. Renicie a operação!");
        } else {
            JOptionPane.showMessageDialog(null,
                    obj.obterResultado(), "Algoritmo de Euclides", 1);
        }

    }
}
