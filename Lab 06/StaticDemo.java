class StaticDemo{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.rollno=85;
		s1.name="Hamid";
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(Student.University);
		Student s2=new Student () ;
		s2.rollno=145;
		s2.name="Azeem";
		System.out.println(s2.rollno);
		System.out.println(s2.name);
		System.out.println(Student.University);
	}
}