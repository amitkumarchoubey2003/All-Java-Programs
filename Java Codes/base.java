
abstract class one {
	abstract void printInfo();
}


class student extends one {
	void printInfo()
	{
		String name = "BCA";
		int sem = 5;
		

		System.out.println(name);
		System.out.println(sem);
		
	}
}


class base {
	public static void main(String args[])
	{
		one s = new student();
		s.printInfo();
	}
}
