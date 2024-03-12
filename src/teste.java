import javax.swing.*;

public class teste {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Bem vindo","Examples - JOptionPane", JOptionPane.QUESTION_MESSAGE);

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor: ",JOptionPane.INPUT_VALUE_PROPERTY));

        String operador = JOptionPane.showInputDialog(null,"Informe o tipo da operação que deseja: ","Examples = JOptionPane", JOptionPane.QUESTION_MESSAGE);

        int valor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo valor: ", "Examples - JOptionPane",JOptionPane.QUESTION_MESSAGE));

        int resultado =0;
        if(operador.trim().equals("+")){
            resultado = valor1 + valor2;
            JOptionPane.showMessageDialog(null,"O resultado da soma é: "+resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else if(operador.trim().equals("-")){
            resultado = valor1 - valor2;
            JOptionPane.showMessageDialog(null,"O resultado da subtração é: "+resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (operador.trim().equals("/")) {
            resultado = valor1/valor2;
            JOptionPane.showMessageDialog(null,"O resultado da divisão é: "+resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else if (operador.trim().equals("*")) {
            resultado = valor1*valor2;
            JOptionPane.showMessageDialog(null,"O resultado da multiplicação é: "+resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null,"Operador Inválido!!","Examples - JOptionPane",JOptionPane.ERROR_MESSAGE);
        }




    }
}
