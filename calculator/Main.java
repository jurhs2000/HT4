/**
 * 
 * Universidad del Valle de Guatemala
 * Algoritmos y estructuras de datos
 * Hoja de trabajo 4
 * 26/02/2020
 * 
 * Este programa utiliza los patrones de diseño Singleto y Factory.
 * Está basado en la hoja de trabajo 2 (Calculadora postfix), por lo tanto 
 * su uso es para calcular expresiones postfix leídas desde el archivo
 * datos.txt que se encuentra en la carpeta raíz de este mismo archivo.
 * 
 * La implementación de los patrones se dan:
 * Singleton en la instancia de la calculadora
 * Factory en la instancia de una lista Stack<E>, la cual ha sido sobrecreada
 * para este programa.
 * 
 * @author Julio Herrera 19402
 * @author Jose Hurtarte 19707
 * @version 1.0
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * Este método es utilizado para leer el archivo datos.txt.
	 * La lectura se realiza para todas las líneas del archivo y separa cada
	 * caracter que tenga el archivo para agregarlo a la lista de Strings
	 * que devolverá.
	 * 
	 * @return una lista de todos los elementos del archivo separados
	 * @throws Exception excepción general para la lectura del archivo
	 */
	public static String[] textReader() throws Exception{
		final String bar = File.separator;
		final String dir = System.getProperty("user.dir");
		/**
		 * AQUI SE LEE EL ARCHIVO TXT
		 * si no corre se debe de reemplazar en el parentesis (dir + barra +"NOMBRE DEL
		 * FOLDER EN DONDE ESTA EL PROYECTO" +barra+ "datos.txt")
		 * El error del archivo de texto puede pasar si se corre el programa en eclipse
		 * y no en consola
		 * o tambien sucede al trabajar con paquetes
		 */
		final File file = new File(dir + bar + "datos.txt");
		if (!file.exists()) {
			throw new FileNotFoundException("No se encontro el archivo, ver lineas comentadas");
		}
		FileReader fr;
		fr = new FileReader(file);
		final BufferedReader br = new BufferedReader(fr);
		String[] lineList = null;

		while (br.readLine() != null) {
			lineList = br.readLine().split(" ");
		}

		br.close();
		return lineList;
	}

	public static void main(final String[] args) throws Exception {
		/**
		 * Menú de elección de tipo de Stack a utilizar.
		 * A partir de esta elección, el factory elegirá que estructura de datos
		 * utilizar. Si se elige la opcion 3, listas, se le dará al uusuario
		 * la opción de elegir que tipo de lista utilzar, para implementar nuevamente
		 * el patrón de diseño Factory.
		 */
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
		scan.close();
		/**
		 * Se lee el archivo de texto
		 */
		final String[] list = textReader();
		/**
		 * Se implementa el patron Singleton, llamando al metodo estatico
		 * getCalculator, que crea o devuelve la unica instancia de la clase
		 * Calculadora, que ella misma maneja.
		 */
		Calculator calculator = Calculator.getCalculator();
		/**
		 * Se implementa el patron Factory, creando una instancia de la clase
		 * StackFactory y llamando al metodo que devuelve una lista cualquiera de 
		 * tipo Stack<E>, segun los parametros escogidos por el usuario.
		 */
		StackFactory<Integer> stackFactory = new StackFactory<Integer>();
		Stack<Integer> stack = stackFactory.getStack(stackType, listType);
		/**
		 * Comienza la lectura de los elementos del archivo en la lista, lista.
		 */
		int a = 0, b = 0;
		boolean verificator1 = false;
		/**
		 * Se verifica si existen los suficientes operadores para la cantidad
		 * de numeros escritos o viceversa
		 */
		int contOperator = 0;
		int contNum = 0;
		for (final String c : list) {
			if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
				contOperator++;
			} else {
				contNum++;
			}
		}
		if (contOperator + 1 != contNum) {
			verificator1 = true;
			System.out.println("NO HAY SUFICIENTES OPERADORES O NUMEROS PARA REALIZAR LA OPERACION");
		}
		/**
		 * Si existe la suficiente cantidad de operadores para los numeros, se sigue con
		 * operacion de los elementos. En caso de haya un error con la operacion de algun elemento
		 * se encierra el error mostrando un mensaje de correccion de expresion postfix
		 */
		try {
			if (!verificator1) {
				for (final String c : list) {
					if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {

						a = stack.pop();
						b = stack.pop();

						if (c.equals("+")) {
							stack.push(calculator.add(a, b));
						}

						if (c.equals("-")) {
							stack.push(calculator.subtract(a, b));
						}

						if (c.equals("*")) {
							stack.push(calculator.multiply(a, b));
						}

						if (c.equals("/")) {
							stack.push(calculator.divide(a, b));
						}

					} else {
						stack.push(Integer.parseInt(c));
					}
				}
				/**
				 * Se muestra el resultado de la operacion
				 */
				System.out.println("EL RESULTADO POSTFIX ES: " + stack.peek());
			}
		} catch (Exception e) {
			System.out.println("Expresión Postfix inválida, revise su expresión, debe estar separada por espacios");
		}
	}
}