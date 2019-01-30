public class Fibonacci{



	public int fibonacci(int n, String type){
		if (type == "recursion")
			return fibonacci_iteration(n);
		return fibonacci_recursion(n);
		}



	public static int fibonacci_recursion(int n){
			if(n == 0 || n ==1)
				return n;
			return fibonacci_recursion(n-1) + fibonacci_recursion(n-2);
		}


	public static int fibonacci_iteration(int n) {
		int a = 0, b = 1, c = 1; //first three terms of fibonacci

		for (int i = 0; i < n; i++){
			a = b; // set a new " n - 2" term
			b = c; //set a new "n - 1" term 
			c = a + b; //set the n term 
		}
		return a;
	}
}





