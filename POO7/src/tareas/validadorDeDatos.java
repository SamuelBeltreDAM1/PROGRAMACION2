package tareas;

import javax.swing.JOptionPane;

public class validadorDeDatos {
	private static int edad;

	public static int getEdad() {
		return edad;
	}

	public static void setEdad(int edad) {
		validadorDeDatos.edad = edad;
	}
	public static void main(String[] args) {
		inicio();
	}

	public static void inicio() {
		boolean  comprobador = false;
          while (comprobador==false) {
			try {
				validadorDeDatos.edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad: "));
				comprobadorEdad(validadorDeDatos.edad);
				comprobador=true;

			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "ERROR: Introduce una edad numerica");
			}
			}
		}

	public static void comprobadorEdad(int edad) {

			if (edad < 0) {
				JOptionPane.showMessageDialog(null, "no existen edades negativas, introduce tu edad otra vez");
				inicio();
			} else if (edad > 120) {
				JOptionPane.showMessageDialog(null, "dudo que hayas vivido tanto, introduce tu edad otra vez");
				inicio();
			} else {
				JOptionPane.showMessageDialog(null, "finalizado");
		}
	}
}
