import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//Jose Hurtarte
//Julio Herrera
public class Main {
	public static String[] lectorDeTexto() throws Exception{
		final String barra = File.separator;
		final String dir = System.getProperty("user.dir");
		// AQUI SE LEE EL ARCHIVO TXT
		// si no corre se debe de reemplazar en el parentesis (dir + barra +"NOMBRE DEL
		// FOLDER EN DONDE ESTA EL PROYECTO"+barra+ "datos.txt")
		// El error del archivo de texto puede pasar si se corre el programa en eclipse
		// y no en consola
		// o tambien sucede al trabajar con paquetes
		final File archivo = new File(dir + barra + "datos.txt");
		FileReader fr;
		String linea = "";
		fr = new FileReader(archivo);
		final BufferedReader br = new BufferedReader(fr);
		String[] listaLinea = null;

		while ((linea = br.readLine()) != null) {
			listaLinea = linea.split("");
		}
		return listaLinea;

	}

	public static void main(final String[] args) {
        System.out.println("calculator POSTFIX\n");
        System.out.println("Eliga el tipo de pila que quiere utlizar:");
        System.out.println("1. ArrayList\n2. Vector\n3. Lista");
        Scanner scan = new Scanner(System.in);
        int stackType = scan.nextInt();
        int listType = 0;
        scan.nextLine();
        if (stackType == 3) {
            System.out.println("Eliga el tipo de lista que quiere utilizar:");
            System.out.println("1. Enlazada\n2. Doble enlazada\n3. Circular");
            listType = scan.nextInt();
            scan.nextLine();
        }
		try {
			final String[] lista = lectorDeTexto();
			//final iCalculator calculator = new Calculator(); // ESTA ES LA LINEA DONDE SE DECLARA NUESTRA CLASE calculator
			iCalculator calculator = Calculator.getCalculator(); //Singleton
			StackFactory<Integer> factory = new StackFactory<Integer>();
            Stack<Integer> stack = factory.getStack(stackType, listType);
            int a = 0, b = 0;

			boolean verificador1 = false;
			// Verificacion si hay suficientes operadores para los numeros escritos O
			// VISCEVERSA

			int contadorOperador = 0;
			int contadorNumero = 0;
			for (final String c : lista) {
				if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
					contadorOperador++;
				} else {
					contadorNumero++;
				}
			}
			if (contadorOperador + 1 != contadorNumero) {
				verificador1 = true;
				System.out.println("NO HAY SUFICIENTES OPERADORES O NUMEROS PARA REALIZAR LA OPERACION");
			}

			if (!verificador1) {
				for (final String c : lista) {
					if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
						if (c.equals("+")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculator.suma(a, b));
						}

						if (c.equals("-")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculator.resta(a, b));
						}

						if (c.equals("*")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculator.multiplicacion(a, b));
						}

						if (c.equals("/")) {
							a = stack.pop();
							b = stack.pop();
							stack.push(calculator.division(a, b));
						}
					} else {
						stack.push(Integer.parseInt(c));
					}
				}
				System.out.println("EL RESULTADO POSTFIX ES: " + stack.peek());
			}
		} catch (final Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error de archivo, ver instrucciones en lineas comentadas");
		}
	}
}