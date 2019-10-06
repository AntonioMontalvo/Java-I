class IfAndIfElse {

	int numOfLaptops = 10;
	String text = "";
	public String getInventory(int request){
		
		if (numOfLaptops == request){
			
			 text = "Our warehouse shows we are at full capacity for laptops.";
			 
			 
		} else {
			text = "It's time to order more laptops";
			
		}
		return text;
		

	}

	public static void main (String[] args){
		IfAndIfElse laptopInventory =  new IfAndIfElse();
		
		System.out.println("***If Statement***");
		System.out.println(laptopInventory.getInventory(10));
		
	}
}