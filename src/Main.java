import javax.swing.*;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        int cantApellidos ;
        String input = JOptionPane.showInputDialog("Ingrese el nombre y apellidos de la persona (en caso de tenerlos)");
        String[] persona = input.split("\\s+");
        if (persona.length == 1) {
            JOptionPane.showMessageDialog(null, "El nombre de la persona es " + persona[0]);
        } else if (persona.length == 2) {
            JOptionPane.showMessageDialog(null, "El nombre de la persona es " + persona[0] + " y su apellido es " + persona[1]);
        } else if (persona.length == 3) {
            JOptionPane.showMessageDialog(null, "El nombre de la persona es " + persona[0] + " y sus apellidos son " + persona[1] + " " + persona[2]);
        } else {
            JOptionPane.showMessageDialog(null, "Ya es mucho");
        }
        boolean whileApellidos = false;
        while (!whileApellidos) {
            JOptionPane.showMessageDialog(null, "Vamos con otro modo. \n" +
                    "Se le pediran los datos de una nueva persona");
            try {
                String nombre = JOptionPane.showInputDialog("Ingrese nombre de la persona");
                cantApellidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de apellidos de la persona"));
                if (cantApellidos == 0) {
                    JOptionPane.showMessageDialog(null, "El nombre de la persona es " + nombre+ " y no tiene apellidos");
                    whileApellidos = true;
                } else if (cantApellidos == 1) {
                    String apellido = JOptionPane.showInputDialog("Ingrese apellido de la persona");
                    JOptionPane.showMessageDialog(null, "El nombre de la persona es " + nombre + " " + apellido);
                    whileApellidos = true;
                } else if (cantApellidos == 2) {
                    String apellido1 = JOptionPane.showInputDialog("Ingrese el primer apellido de la persona");
                    String apellido2 = JOptionPane.showInputDialog("Ingrese el segundo apellido de la persona");
                    JOptionPane.showMessageDialog(null, "El nombre de la persona es " + nombre + " " + apellido1 + " " + apellido2);
                    whileApellidos = true;

                } else {
                    JOptionPane.showMessageDialog(null, "La cantidad de apellidos deber ser de 1, o 2");
                }
            } catch (NumberFormatException | InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero de apellidos valido (0, 1, o 2)");
            }
        }
    }
}
