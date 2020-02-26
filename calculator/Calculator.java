//Jose Hurtarte
//Julio Herrera
public class Calculator implements iCalculator{

	/*
	 * for singleton implementation a private constructor is implemented
	*/
	private Calculator() {}

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