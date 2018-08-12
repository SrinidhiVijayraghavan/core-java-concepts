package addition;

public class constructor3 {
	int a;
	int b;
	constructor3(int f1, int f2 )
	{
		a=f1;
		b=f2;
	}
	constructor3(constructor3 s)
	{
		a=s.a;
		b=s.b;
		
	}
	void calculate()
	{
		System.out.println(a+b);
	}
public static void main(String args[])
{
	constructor3 s1 =new constructor3(10,20);
	constructor3 s2 =new constructor3(s1); 
	s1.calculate();
	s2.calculate();
}
}


