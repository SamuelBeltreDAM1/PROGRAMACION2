package tareas;

public class instancias {
  private static int contador=0;
  public instancias() {
      // Incrementar el contador cada vez que se crea una nueva instancia
      contador++;
  }
  public static int obtenerNumeroInstancias() {
      // Método estático para obtener el número actual de instancias
      return contador;
  }

  public static void main(String[] args) {
      // Ejemplo de uso:
      instancias instancia1 = new instancias();
      System.out.println("Número de instancias: " + instancias.obtenerNumeroInstancias());

      instancias instancia2 = new instancias();
      System.out.println("Número de instancias: " + instancias.obtenerNumeroInstancias());

      instancias instancia3 = new instancias();
      System.out.println("Número de instancias: " + instancias.obtenerNumeroInstancias());
  }
}
