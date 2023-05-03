import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "COP a Euros", "COP a Dólares", "COP a Libras Esterlinas", "COP a Yen",
                    "COP a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en Pesos Colombianos: ");
            double cop;
            try {
                cop = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("COP a Dólares")) {
                double dollars =cop / 3.58;
                JOptionPane.showMessageDialog(null,
                        cop + " Pesos Colombianos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("COP a Euros")) {
                double euros = cop / 4.21;
                JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son " + euros + " euros.");
            } else if (choice.equals("COP a Libras Esterlinas")) {
                double pounds = cop / 4.92;
                JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son " + pounds + " libras esterlinas.");
            } else if (choice.equals("COP a Yen")) {
                double yen = cop / 0.03;
                JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son " + yen + " yenes japoneses.");
            } else if (choice.equals("COP a Won")) {
                double won = cop / 0.0027;
                JOptionPane.showMessageDialog(null, cop + " Pesos Colombianos son " + won + " wones surcoreanos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}