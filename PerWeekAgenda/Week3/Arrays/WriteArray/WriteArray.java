class WriteArray{
/*A few things about Arrays.
	-Once the have been declared, they cannot change in size
	-All elements must be of one data type
	-Created using the keyword new or initializer
*/

	public static void main(String[] args) {
		//declared it as a new object 
		double temperatures[] = new double[30];
		//lets check what we've got so far
		int i;
		for (i=0; i<temperatures.length ;i++) {
			System.out.print(temperatures[i]);
			//this is what we got 0.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0
		}
		System.out.println("");
		System.out.println("Let's add a few values");
		temperatures[0] = 20;
		temperatures[22] = 5;
		temperatures[4]= 35;
		for (i=0; i<temperatures.length ;i++) {
			System.out.print(temperatures[i]);
			//this is what we got 
		}
	}
}