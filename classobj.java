package addition;

public class classobj {
	int f;
	int s;
	void insert(int f1,int s1)
	{
		f=f1;
		s=s1;
	}
	void calculate()
	{
		System.out.println(f+s);
	}
	public static void main(String[] args) {
	
classobj r1=new classobj();
classobj r2=new classobj();
r1.insert(10,20);
r2.insert(20,30);
r1.calculate();
r2.calculate();
	}

}

}
