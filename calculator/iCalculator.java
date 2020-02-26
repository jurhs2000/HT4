public interface iCalculator {
	
	//pre: requires 2 numbers
	//post: addition number b to number a
	int suma(int a, int b);
	
	//pre: requires 2 numbers
	//post: subtract number b to number a
	int resta(int a, int b);
	
	//pre: requires 2 numbers
	//post: multiply number a, b times
	int multiplicacion(int a, int b);
	
	//pre: requires 2 numbers, number b can't be 0
	//post: split number a in b parts, return the quotient
	int division(int a, int b);

}