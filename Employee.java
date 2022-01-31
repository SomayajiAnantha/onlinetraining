
public class Employee {
	
	String emptype;
	
	int salary(int basic, int hra) {
		int empsal= basic + hra;
		return empsal;
	}
	
	int salary(int basic, int hra, int med, int fuel) {
		int empsal = basic + hra + med + fuel;
		return empsal;
	}
	
	int salary(int basic, int hra, int med, int fuel, int salesbonus) {
		int empsal = basic + hra + med + fuel + salesbonus;
		return empsal;
	}
	
	public static void main(String[] args) {
		
		Employee Sham= new Employee();
		Employee Ram = new Employee();
		Employee Abhiram= new Employee();
		
		int salary;
		
		Sham.emptype= "Engineer";
		Ram.emptype= "Manager";
		Abhiram.emptype="Director";
		
		salary= Sham.salary(20000, 8000);
		
		int basic = 25000; int hra = 10000; int med =1500; int fuel = 10000; int salbonus= 50000;
		
		//salary = Sham.salary(basic, hra);
		System.out.println(" Sham as an " + Sham.emptype +", his salary is: "+ Sham.salary(basic, hra));
		
		salary = Ram.salary(basic, hra,med,fuel);
		System.out.println(" Ram as a " + Ram.emptype +", his salary is: "+ salary);
		
		salary = Abhiram.salary(basic, hra, med, fuel, salbonus);
		System.out.println(" Abhiram as a " + Abhiram.emptype +", his salary is: "+ salary);
		
	}

}
