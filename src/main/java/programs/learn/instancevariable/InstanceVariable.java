package programs.learn.instancevariable;

public class InstanceVariable {
	public String name;
	public double salary;

	public InstanceVariable(String empName) {
		name = empName;
	}

	public void printEmp() {
		System.out.println(name);
		System.out.println(salary);
	}

	public void setSal(double empSalary) {
		salary = empSalary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable obj = new InstanceVariable("sailesh");
		obj.setSal(200000);
		obj.printEmp();

	}

}
