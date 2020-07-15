
public class Ejercicio_5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Programa java que declare cuatro variables enteras A, B, C y D y
		asígnale un valor a cada una. A continuación realiza las instrucciones
		necesarias para que: */		
		int a = 2, b = 15, c = 97, d = 23;
		System.out.println("El valor de A es igual a: " + a);
		System.out.println("El valor de B es igual a: " + b);
		System.out.println("El valor de C es igual a: " + c);
		System.out.println("El valor de D es igual a: " + d);
		
		//B tome el valor de C
		b = c;
		System.out.println("El valor de B es igual a: " + b);
		
		//C tome el valor de A
		c = a;
		System.out.println("El valor de C es igual a: " + c);
		
		//A tome el valor de D
		a = d;
		System.out.println("El valor de A es igual a: " + a);
		
		//D tome el valor de B
		d = b;
		System.out.println("El valor de D es igual a: " + d);

	}

}
