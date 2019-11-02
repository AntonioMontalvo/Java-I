class SquareRoot {

	public double getSquareRoot(double value){ //the Square root method uses a double.
		return Math.sqrt(value);
	}
	//When you cast with (int), you discard any fraction number after the floating point.
	public int getSquareRootInt(double value){//casting int
		return (int)Math.sqrt(value);
	}
	//When you cast with (long), you discard any fraction number after the floating point.
	public long getSquareRootLong(double value){//casting long
		return (long)Math.sqrt(value);
	}		






	public static void main(String[] args) {
	
		SquareRoot mySqrt = new SquareRoot();

		System.out.println(mySqrt.getSquareRoot(4.0));

		System.out.println(mySqrt.getSquareRootInt(64.0));

		System.out.println(mySqrt.getSquareRootLong(3264.0));		


		
	}
}