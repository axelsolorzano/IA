package hansd_on_10;

public class Main {
	static double x[]= {};
	static double y[]= {};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polynomial_Linear_Regression test1 = new Polynomial_Linear_Regression(x,y);
		Polynomial_quadratic_Regression test2 = new Polynomial_quadratic_Regression(x,y);
		Polynomial_cubic_Regression test3 = new Polynomial_cubic_Regression(x,y);
	}

}
