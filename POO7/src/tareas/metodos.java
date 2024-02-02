package tareas;

import javax.swing.JOptionPane;

public class metodos {
	private static int contador=1;

	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		metodos.contador = contador;
	}

	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "PRIMER METODO: "+metodo1()+"\nSEGUNDO METODO: "+metodo2()+"\nTERCER METODO: "+metodo3());
	}
	public static int metodo1() {
		return metodos.contador++;
	}
	public static int metodo2() {
		return metodos.contador++;
	}
	public static int metodo3() {
		return metodos.contador++;
	}
}
