package javatask3;

public class Person {
	static String name;
	static int age;
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;	
	}
	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
		
	}
	public String getName(String name)
	{
		return name;
	}
	public int getAge(int age)
	{
		return age;
	}
	public void displayName()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		
	}
	public static void main(String[] args) {
		Person p=new Person("Jeyashree",28);
		p.displayName();
		p.setName("Iniyashree");
		p.setAge(4);
		p.displayName();
		
	}

}
