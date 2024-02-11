package ejercicio4;

public class rectangulo extends figura{
private double base;
private double altura;
public rectangulo(double base,double altura) {
	super();
	this.base=base;
	this.altura=altura;
}
public double getBase() {
	return base;
}
public double getAltura() {
	return altura;
}
public double calcularArea() {
	return base*altura;
}
}
