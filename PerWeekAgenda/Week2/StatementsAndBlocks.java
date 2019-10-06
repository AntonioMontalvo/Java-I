class StatementsAndBlocks  {
	public String blockOfCode(){
		String statement = "This is a statement";
		String statement2 = "To run this file you have to give it to the Compiler with 'javac StatementsAndBlocks.java', then run 'StatementsAndBlocks.java'";
		String funFact = "In Java everything ending on ; is a statement";
		String funFact2 = "A block of code is always contained in {...}";
		return statement;

	}
	public static void main(String[] args) {
		StatementsAndBlocks code = new StatementsAndBlocks();

		String text = code.blockOfCode();
		System.out.println(text);
	}
}