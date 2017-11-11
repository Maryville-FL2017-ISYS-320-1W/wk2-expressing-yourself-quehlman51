/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for variables a, b, and c
	a => 6 -> Correct
	b => 9 -> Correct
	c => 15 -> Incorrect
 
 	After testing the statements in the main method, indicate above if your predictions were correct.
*/

public class ReAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 10;
		int c = b;
		a = a + 1;
		b = b - 1;
		c = c + a;
		b = c % a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(b);

	}

}
