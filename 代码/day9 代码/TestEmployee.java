package day9;

public class TestEmployee {
	public static void main(String[] args) {

	}
}

class Employee{
	private String name;
	private int birthMonth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}

	public Employee(String name, int birthMonth) {
		this.name = name;
		this.birthMonth = birthMonth;
	}

	public double getSalary(int month) {
		if (this.birthMonth == month) return 100;
		else return 0;
	}
}
class SalariedEmployee extends Employee{
	private double salary;
	public SalariedEmployee(String name, int birthMonth , double salary) {
		super(name , birthMonth);
		this.salary = salary;
	}
	public double getSalary(int month) {
		return this.salary + super.getSalary(month);
	}
}
class HourlyEmployee extends Employee{
	private double salaryPerHour ;
	private int hours;
	public HourlyEmployee(String name, int birthMonth, double salaryPerHour, int hours) {
		super(name, birthMonth);
		this.salaryPerHour = salaryPerHour;
		this.hours = hours;
	}
	public double getSalary(int month) {
		double result = 0;
		if (this.hours < 160) result = this.salaryPerHour * this.hours;
		else result = this.salaryPerHour*160 + this.salaryPerHour*1.5*(this.hours-160);
		return result + super.getSalary(month);
	}
}
class SalesEmployee extends Employee{
	private int sales;
	private int rate;
	public SalesEmployee(String name, int birthMonth, int sales, int rate) {
		super(name, birthMonth);
		this.sales = sales;
		this.rate = rate;
	}
	public double getSalary(int month) {
		return this.sales * this.rate + super.getSalary(month);
	}
}
class BasedPlusSalesEmployee extends SalesEmployee{
	private double basedSalary;
	public BasedPlusSalesEmployee(String name, int birthMonth, int sales, int rate, double basedSalary) {
		super(name, birthMonth, sales, rate);
		this.basedSalary = basedSalary;
	}
	
	public double getSalary(int month) {
		return this.basedSalary + super.getSalary(month);
	}
}






