public class ScopeVariables {
	//this variables is public and available for the entire class.
	public int outsideVariable = 100;

	//now lets create a method and a variable inside that method
	public int Percentage(int percent, int num){
		int insideVariable = 0;
		int result = (num * percent)/ outsideVariable;
		return result; 
	}

	public static void main(String[] args){
		ScopeVariables customPercent = new ScopeVariables();
		System.out.println(customPercent.Percentage(13, 100));
		
	}
}