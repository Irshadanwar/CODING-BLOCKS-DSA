package Lec_31;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student();
		System.out.println(s.name);
		System.out.println(s.age);
		s.name="Kaju ";
		s.age =15;
		System.out.println(s.name);
		System.out.println(s.age);
		student s1 = new student ();
		s1.name="Raj ";
		s1.age =25;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s.Intro_yourSelf();
		s1.Intro_yourSelf();
		s.SayHey("kamlesh ");
		s1.SayHey("raju ");
		student.fun(20);
	}

}
