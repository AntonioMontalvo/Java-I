class Strings{
	//Strings are characters in an array passed 
	public static void main(String[] args) {
		char data[] = {'I','A','M'};
		String fromData = new String(data);
		System.out.println(fromData);

		///////

		String backToArray = "Sliced";

		char[] ch = backToArray.toCharArray();  
			for(int i=0;i<ch.length;i++){  
				System.out.print(ch[i]+",");  
			}
		ch.getClass();	
	}
}