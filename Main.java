
public class Main {

  public static void main(String[] args) {
  System.out.println(suma(3,2,1));

  Coche coche = new Coche();
  coche.IncrementarPuertas();
  System.out.print("el coche ahora tiene : ");
  System.out.println(coche.puertas);
  System.out.print("puertas!" );
  }

  public static int suma(int a, int b, int c){
    return a + b + c;
  }
}

class Coche {
  public int puertas = 4;

  public void IncrementarPuertas() {
    this.puertas++;
  }

}