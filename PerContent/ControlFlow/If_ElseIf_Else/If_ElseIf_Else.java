class If_ElseIf_Else {

	int numOfLaptops = 10;
	String text = "";
	public String getInventory(int request){
		if (request > 10){
			text = "Our warehouse's maximum capacity is 10 laptops. Offer our customer to purchase 10 laptops and purchase another 10.";
		}
		else if (numOfLaptops == request){
			
			 text = "Our warehouse shows we are at full capacity for laptops.";
		} else if (request < 10){
			text = "It's time to order more laptops";
			
		} else {
			text = "Order more now";
		}
		return text;
	}

	public static void main (String[] args){
		If_ElseIf_Else laptopInventory =  new If_ElseIf_Else();
		
		System.out.println("***If Statement***");
		System.out.println(laptopInventory.getInventory(13));
		System.out.println(laptopInventory.getInventory(10));
		System.out.println(laptopInventory.getInventory(2));	
	}
}