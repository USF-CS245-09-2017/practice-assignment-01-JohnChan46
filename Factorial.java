public class Factorial{




	public int factorial(int n, String type){
		if (type == "recursion")
			return factorial_iteration(n);
		return factorial_recursion(n);
		}




	public int factorial_recursion(int n) {
		if (n == 0)
			return 1;
		return n * factorial_recursion(n - 1);
	}


	public int factorial_iteration(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total *= i;
		}
		return total;
	}

}



