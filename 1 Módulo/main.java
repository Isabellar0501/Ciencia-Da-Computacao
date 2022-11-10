import javax.swing.*;

public class main {

    public static void main(String entrada[]){

        int n1, n2;
        double resultado1, resultado2;
        String msg = "";
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um número inteiro"));

        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite um número inteiro"));

        resultado1 = Double.valueOf(n1)/Double.valueOf(n2);
        resultado2 = Math.pow(n1,n2);

        msg = msg + "resultado da divisão" + resultado1 + "\n";
        msg = msg + "resultado da potência" + resultado2 + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}