package ejercicio3;

public class perro extends animal{
private String frase2;
public perro() {
	super();
	frase2 = "El perro ladra";
}

public String emitirSonido() {
	return frase2;
}
}
