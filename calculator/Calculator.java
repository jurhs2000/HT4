//Jose Hurtarte
//Julio Herrera
public class Calculator implements iCalculator{

	/**
	 * A static Calculator to be the unic instance
	 */
	private static Calculator calculator;

	/*
	 * for singleton implementation a private constructor is implemented
	*/
	private Calculator() {}

	/**
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
	 * suma los parametros y los devuelve
	 */
	@Override
	public int suma(int a, int b) {
		
		return a+b;
	}

	/**
	 * resta los parametros y los devuelve
	 */
	@Override
	public int resta(int a, int b) {
		
		return a-b;
	}

	/**
	 * multiplica los parametros y los devuelve
	 */
	@Override
	public int multiplicacion(int a, int b) {
		
		return a*b;
	}

	/**
	 *divide los parametros y da el entero mas cercano si es decimal
	 */
	@Override
	public int division(int a, int b) {
		try {
			return a/b;
		} catch (Exception e) {
			System.out.println("Division /0 no valida");
			return 0;
		}
	}


}