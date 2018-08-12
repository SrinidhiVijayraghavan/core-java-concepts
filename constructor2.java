package addition;

public class constructor2 {
	int f;
	int s;
constructor2(int f1,int s1)
	{
		f=f1;
		s=s1;
	}
	void calculate()
	{
		System.out.println(f+s);
	}
	public static void main(String[] args) {
		
		constructor2 r1=new constructor2(10,25);
		constructor2 r2=new constructor2(26,35);
		r1.calculate();
		r2.calculate();
	}

}

