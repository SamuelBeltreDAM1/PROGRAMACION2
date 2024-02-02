package tareas;

import javax.swing.JOptionPane;

public class calculadora {
  private static double operando1;
  private static double operando2;
  private static double suma;
  private static double resta;
  private static double mult;
  private static double div;

  public static double getOperando1() {
	return operando1;
}
public static void setOperando1(double operando1) {
	calculadora.operando1 = operando1;
}
public static double getOperando2() {
	return operando2;
}
public static void setOperando2(double operando2) {
	calculadora.operando2 = operando2;
}  
public static double getSuma() {
	return suma;
}
public static void setSuma(double suma) {
	calculadora.suma = suma;
}
public static double getResta() {
	return resta;
}
public static void setResta(double resta) {
	calculadora.resta = resta;
}
public static double getMult() {
	return mult;
}
public static void setMult(double mult) {
	calculadora.mult = mult;
}
public static double getDiv() {
	return div;
}
public static void setDiv(double div) {
	calculadora.div = div;
}
  
 public static void main(String[] args) {
	calculadora.operando1 =Double.parseDouble(JOptionPane.showInputDialog("Introduce el primer operando: "));
	calculadora.operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el segundo operando: "));
	
	calculadora.suma=suma(calculadora.operando1,calculadora.operando2);
	calculadora.resta=resta(calculadora.operando1,calculadora.operando2);
	calculadora.mult=multi(calculadora.operando1,calculadora.operando2);
	calculadora.div=div(calculadora.operando1,calculadora.operando2);
	
	JOptionPane.showMessageDialog(null, "SUMA: "+calculadora.suma+"\n"+"RESTA: "+calculadora.resta+"\n"
	+"MULTIPLICACION: "+calculadora.mult+"\n"+"DIVISION: "+calculadora.div);
	
}
 public static double suma(double op1, double op2) {
	 op1=calculadora.operando1 ;
	 op2=calculadora.operando2;
	 return op1+op2;
 }
 public static double resta(double op1, double op2) {
	 op1=calculadora.operando1 ;
	 op2=calculadora.operando2;
	 return op1-op2;
 }
 public static double multi(double op1, double op2) {
	 op1=calculadora.operando1 ;
	 op2=calculadora.operando2;
	 return op1*op2;
 }
 public static double div (double op1, double op2) {
	 op1=calculadora.operando1 ;
	 op2=calculadora.operando2;
	 return op1/op2;
 }
}
