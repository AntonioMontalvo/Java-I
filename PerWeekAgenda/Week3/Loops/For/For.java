// for repeating a statement a predetermined amount of times.

class For {
	public static void main(String[] args) {
		int i, j, k, l, m, n;

		System.out.println("");
		System.out.println("Starting at 10 and ending on 1");
		for (i=1; i < 10 ; i++) {
			System.out.println("I'm number " + i);
		}

		
		//a twist would be to start  at the end that is from 10 to 1
		System.out.println("");
		System.out.println("Starting at 10 and ending on 1");	for (j=10; i > 0 ; i--) {
			System.out.println("I'm number " + i);
		}	

		//another twist would be to have a two loop control variables.
		System.out.println("");
		System.out.println("Starting at 10 and ending on 1");
		for (i=0, j=10; i < j ; i++, j--) {
			System.out.println("while i = " + i + " j = " + j);
		}

		//another twist would be to have a three loop control variables.
		System.out.println("");
		System.out.println("Starting at 10 and ending on 1");
		for (l=0, m=10, n= 15; l <  15; l++, m--, n --) {
			System.out.println("while l = " + l + " m = " + m + " n = " + n);
		}	
	}
}