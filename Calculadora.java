import java.util.ArrayList;
import java.util.Scanner;
public class Calculadora {
public static void main(String args[]) {
Scanner leerDatos = new Scanner(System.in);
ArrayList<Integer> numeros = new ArrayList<>();
int continuar = 0;
do {
numeros.clear(); 
System.out.println("Bienvenido a la calculadora!");
int valor;
do {
System.out.println("Ingresa un numero (-1 para terminar): ");

valor = leerDatos.nextInt();
if (valor != -1) {
numeros.add(valor);
}
} while (valor != -1);
if (numeros.isEmpty()) {
System.out.println("No ingresaste ningun número.");
} else {
int suma = 0;
int maximo = numeros.get(0);
int minimo = numeros.get(0);
for (int numero : numeros) {
suma += numero;
if (numero > maximo) {
maximo = numero;
}
if (numero < minimo) {
minimo = numero;
}
}
double promedio = suma / (double) numeros.size();

System.out.println("Total de elementos: " +

numeros.size());

System.out.println("Suma de los elementos: " + suma);
System.out.println("Promedio de los elementos: " +

promedio);

System.out.println("Numero más grande: " + maximo);
System.out.println("Numero más pequeño: " + minimo);
}
System.out.println("Quieres continuar (1.Si / 0. No)?");
continuar = leerDatos.nextInt();
} while (continuar == 1);
System.out.println("Saliendo....");
}
}