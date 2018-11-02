
public class TestException {

	public static void main(String[] args) {
		System.out.println("Hello......");
		int n1=10,n2=0;
		try {
			System.out.println("Welcome...");
			float ans = Integer.parseInt(args[0])/Integer.parseInt(args[1]);
			System.out.println("Ans is " + ans);
		}
		catch(ArithmeticException ex){
			System.out.println(ex);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Any other exception : " +e);
		}
		finally {
			System.out.println("Done with Exception");
		}
		System.out.println("Thank You!");
	}

}
