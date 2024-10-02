abstract class one {
	abstract void disp();
}


class student extends one
 {
	void disp()
	{
		String name = "BCA";
		int sem = 5;
		

		System.out.println(name);
		System.out.println(sem);
		
	}
}

class ab1 {
	public static void main(String args[])
	{
		student s = new student();
		s.disp();
	}
}
