package tareas;

import javax.swing.JOptionPane;

public class conversor {
	
private static double kilometros;
private static double millas;
private static double cels;
private static double kel;

public static double getKilometros() {
	return kilometros;
}
public static void setKilometros(double kilometros) {
	conversor.kilometros = kilometros;
}
public static double getMillas() {
	return millas;
}
public static void setMillas(double millas) {
	conversor.millas = millas;
}
public static double getCels() {
	return cels;
}
public static void setCels(double cels) {
	conversor.cels = cels;
}
public static double getKel() {
	return kel;
}
public static void setKel(double kel) {
	conversor.kel = kel;
}

public static void main(String[] args) {
conversor.kilometros= Double.parseDouble(JOptionPane.showInputDialog("Introduce los kilometros:"));
	conversor.millas=convertirD(conversor.kilometros);
conversor.cels= Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatur en Celsius:"));
    conversor.kel=convertirT(conversor.cels);
JOptionPane.showMessageDialog(null, "kilometros en Millas: "+conversor.millas+"\n"+"Celsius en Kelvins: "+conversor.kel);
}
public static double convertirD(double kilometros) {
	return kilometros * 0.62;
}
public static double convertirT(double cels) {
	return cels+273;
}

}
