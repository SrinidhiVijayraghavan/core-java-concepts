package addition;
import java.util.*;
public class exp4cj {

	interface exp6 {
	void input();
	void add();
	}	
	class Test implements exp4cj
	{
	int x,y,z;
	Scanner sc= new Scanner(System.in);

		
		public void input() {
			
			System.out.println("enter two numbers");
			x=sc.nextInt();
			y=sc.nextInt();
			
		}

	
		public void add() {
			
			z=x+y;
		}
		void display()
		{
			System.out.println("\nthe sum is"+z);
		}
		public static void main(String int[])
		{
			Test t1= new Test();
			t1.input();
			t1.add();
			t1.display();
		}}}
