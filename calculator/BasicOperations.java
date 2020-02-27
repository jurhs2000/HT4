/**
 * Esta interfaz propone las 4 operaciones basicas para una
 * calculadora
 * 
 * @author Julio Herrrera
 * @author Jose Javier
 */
public interface BasicOperations {

	/**
	 * SUMA
	 * @pre requires 2 numbres
	 * @post addition numbre b to number a
	 */
	int add(int a, int b);
	
	/**
	 * RESTA
	 * @pre: requires 2 numbers
	 * @post: substract number b to number a
	 */
	int subtract(int a, int b);

	/**
	 * MULTIPLICACION
	 * @pre: requires 2 numbers
	 * @post: multiply number a, b times
	 */
	int multiply(int a, int b);

	/**
	 * DIVISION
	 * @pre: requires 2 numbers, number b can't be 0
	 * @post: split number a in b parts, return the quotient
	 */
	int divide(int a, int b);

}