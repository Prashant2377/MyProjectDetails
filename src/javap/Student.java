package javap;

public class Student {
	int id;
	String name;
	Student(int i,String name){
		this.id=i;
		this.name=name;
	}
	void display()
	{
		System.out.println(id +" " +name);
	}

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Prashant");
		s1.display();
		
	}

}
