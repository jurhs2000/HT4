/**
 * Calculadora basica implementando operaciones basicas y
 * definiendo sus metodos y excepciones
 * 
 * 
 * IMPORTANTE: Esta clase implementa a si misma el patron de diseño
 * SINGLETON
 * 
 * 
 * @author Julio Herrera
 * @author Jose Hurtarte
 */
public class Calculator implements BasicOperations {

	/**
	 * SINGLETON
	 * A static Calculator to be the unic instance
	 */
	private static Calculator calculator;

	/**
	 * SINGLETON
	 * for singleton implementation a private constructor is implemented
	*/
	private Calculator() {}

	/**
	 * SINGLETON
	 * A static method to instance the unic calculator or get it
	 * pre: --
	 * @post: it can return null
	 */
	public static Calculator getCalculator() {
		if (calculator==null) {
			calculator = new Calculator();
		}
		return calculator;
	}

	/**
	 * SUMA
	 * @pre requires 2 numbres
	 * @post addition numbre b to number a
	 */
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	/**
	 * RESTA
	 * @pre: requires 2 numbers
	 * @post: substract number b to number a
	 */
	@Override
	public int subtract(int a, int b) {
		
		return a-b;
	}

	/**
	 * MULTIPLICACION
	 * @pre: requires 2 numbers
	 * @post: multiply number a, b times
	 */
	@Override
	public int multiply(int a, int b) {
		
		return a*b;
	}

	/**
	 * DIVISION
	 * @param b This param can't be 0
	 * @pre: requires 2 numbers, number b can't be 0
	 * @post: split number a in b parts, return the quotient
	 */
	@Override
	public int divide(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			System.out.println("Division /0 no valida");
			return 0;
		}
	}


}