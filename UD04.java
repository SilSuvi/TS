
public class UD04 {

			public static void main(String[] args) {

				// Ejercicio 1
				int a = 6, b = 4;
				
				System.out.println("*** Ejercicio 1 ***");
				
				System.out.println("6 + 4 = " + (a+b));
				System.out.println("6 - 4 = " + (a-b));
				System.out.println("6 * 4 = " + (a*b));
				System.out.println("6 / 4 = " + (a/b));
				System.out.println("6 % 4 = " + (a%b));
				
				// Ejercicio 2
				int N = 5;
				double A = 3.1416;
				char C = 'A';
				
				System.out.println();
				System.out.println("*** Ejercicio 2 ***");
				
				System.out.println("N = " + N);
				System.out.println("A = " + A);
				System.out.println("C = " + C);
				
				System.out.println(N + " + " + A + " = " + (N+A));
				System.out.println(A + " - " + N + " = " + (A-N));
				System.out.println("Valor numérico de C = " + (int) C);
				
				// Ejercicio 3
				int x,y;
				double n,m;
				x = 3;
				y = 6;
				n = 2.567;
				m = 8.25;
				
				System.out.println();
				System.out.println("*** Ejercicio 3 ***");
				
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				System.out.println("n = " + n);
				System.out.println("m = " + m);
				
				System.out.println(x + " + " + y + " = " + (x+y));
				System.out.println(x + " - " + y + " = " + (x-y));
				System.out.println(x + " * " + y + " = " + (x*y));
				System.out.println(x + " / " + y + " = " + (x/y));
				System.out.println(x + " % " + y + " = " + (x%y));
				
				System.out.println(n + " + " + m + " = " + (n+m));
				System.out.println(n + " - " + m + " = " + (n-m));
				System.out.println(n + " * " + m + " = " + (n*m));
				System.out.println(n + " / " + m + " = " + (n/m));
				System.out.println(n + " % " + m + " = " + (n%m));
				
				System.out.println("Doble de x = " + (x*2));
				System.out.println("Doble de y = " + (y*2));
				System.out.println("Doble de n = " + (n*2));
				System.out.println("Doble de m = " + (m*2));
				
				System.out.println("Sumatoria de todas = " + (x+y+n+m));
				
				System.out.println("Producto de todas = " + (x*y*n*m));

				// Ejercicio 4
				int z = 7;
				
				System.out.println();
				System.out.println("*** Ejercicio 4 ***");
				
				System.out.println("La variable x vale " + z);
				System.out.println("x + 77 = " + (z + 77));
				System.out.println("x - 3 = " + (z - 3));
				System.out.println("x * 2 = " + (z * 2));
				
				// Ejercicio 5
				int AA,BB,CC,DD,auxiliar;
								
				AA = 2;
				BB = 4;
				CC = 6;
				DD = 8;
				
				System.out.println();
				System.out.println("*** Ejercicio 5 ***");
				System.out.println("AA, BB, CC, DD = " + AA + ", " + BB + ", "+ CC + ", " + DD);
				
				auxiliar = BB;
				BB = CC;
				CC = AA;
				AA = DD;
				DD = auxiliar;
				
				System.out.println("AA, BB, CC, DD = " + AA + ", " + BB + ", "+ CC + ", " + DD);
			}
	}


