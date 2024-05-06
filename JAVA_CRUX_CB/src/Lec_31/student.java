package Lec_31;
public class student {
	int age;
	String name;
	
	public void Intro_yourSelf() {
		
		System.out.println("My Name is "+ name +" and age is "+ age);
	}
    public void SayHey(String name) {
    	System.out.println(name + " Say Hey" + this.name);
    }
    public static void  fun(int x) {
    	System.out.println("I am in fun "+ x);
    }
    static {
    	System.out.println("Hey all welcome to coding blocks");
    }
    static {
    	System.out.println("Hey all welcome to coding blocks 2");
    }
  
}
		
		
