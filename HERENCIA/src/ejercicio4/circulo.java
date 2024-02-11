package ejercicio4;

public class circulo extends figura{
private final double pi;
private double radio;
public circulo(double radio) {
	super();
	pi = Math.PI;
	this.radio=radio;
}
public double getPi() {
	return pi;
}
public double getRadio() {
	return radio;
}
public double calcularArea() {
	return pi*Math.pow(radio, 2);
}
}
