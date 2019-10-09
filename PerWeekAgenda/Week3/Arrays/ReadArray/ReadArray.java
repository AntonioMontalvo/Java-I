class ReadArray{
	//given an array of data
	
	public static void main(String[] args) {
		int ages[] = {20,43, 24, };
		//extract the particular index of the array
		System.out.println("The value of the first index in the ages array is "+ ages[0]);
		//with a forloop
		int i;
		for (i = 0; i < ages.length; i++){
			System.out.println("The value at index "+ i + " is " + ages[i]);
		}
	}
}