package javatask3;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int id,String firstName,String lastName,int salary) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public int getSalary() {
		return salary;
		
	}
	public void setsalary(int salary)
	{
		this.salary=salary;
	}
	public int getAnnualSalary() {
		return salary*12;
		
	}
	public int raiseSalary(int percent) {
		 salary+=(salary*percent)/100;
		return salary;
		
	}
	public String toString()
	{
		 return "[Employee id=" + id + ",name=" + getfirstName() + ",salary=" + salary + "]";
		
	}
    public static void main(String[] args) {
    	Employee e=new Employee(1001,"Jeyashree","Renganathan",50000);

        System.out.println(e);
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getfirstName());
        System.out.println("Monthly Salary: " + e.getSalary());
        System.out.println("Annual Salary: " + e.getAnnualSalary());

        e.raiseSalary(10); 
        System.out.println("After 10% raise: " + e.getSalary());
        System.out.println(e);
		// TODO Auto-generated method stub

	}

}
