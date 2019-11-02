/*
The exponent of a number says how many times to use that number in a multiplication.
Other names for exponent are index or power.

The exponent, index or power of a BASE number is written on the upper right corner as a small number.

So:
In words:  
	-> "8 to the power 2" or "8 to the second power", or simply "8 squared" is simply = 8 × 8 = 64
	-> "5 to the power 3" is = 5 × 5 × 5 = 125

In java we ca use the Math class method pow​(double a, double b); 


*/

import java.lang.Math;

class Exponential {
	double res;
	int result;
	long resultado;

	public double getExponential(double base,double exponent){	
		res = Math.pow(base, exponent);
		return res;
	}

	public int getExponentialInt(double base,double exponent){	
		//When you cast with (int), you discard any fraction number after the floating point.
		result = (int) Math.pow(base, exponent); //casting int
		return result;
	}

	public long getExponentialLong(double base,double exponent){	
		//When you cast with (long), you discard any fraction number after the floating point.
		resultado = (long) Math.pow(base, exponent); //casting long
		return resultado;
	}

	public static void main(String[] args) {
		double one = 1.0;
		double two = 2.0;
		double three = 3.0;
		double four = 4.0;
		double five = 5.0;
		double six = 6.0;

		//create object
	Exponential exponentWithDecimals = new Exponential();

		//use class methods
	System.out.println(exponentWithDecimals.getExponential(two, four));

	System.out.println(exponentWithDecimals.getExponentialInt(six, two));

	System.out.println(exponentWithDecimals.getExponentialLong(four, three));	




	}
}