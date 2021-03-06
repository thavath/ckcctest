package ExerciseInterface;

public class SalaryEmployee extends Employee{
	
	private double weeklySalary;
	
	public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);
		this.weeklySalary = weeklySalary;
	}
	
	public double getPaymentAmount() {
		return weeklySalary * 4;
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}
	
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	public String toString() {
		return "SalaryEmployee [weeklySalary = " + weeklySalary + "]";
	}
	
}
