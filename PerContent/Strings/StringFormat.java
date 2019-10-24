public class StringFormat{
	public static void main(String[] args) {

		String name = "John";
		int age = 4;
		String my_format = "My name is %s and I am %d.";
		System.out.printf(my_format,  name, age);
	}
}