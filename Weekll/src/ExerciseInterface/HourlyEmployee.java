package ExerciseInterface;

public class HourlyEmployee extends Employee{

	private double wage;
	private double hours;
	
	/**
	 * @param wage
	 * @param hours
	 */
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber);
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	
	
	
	@Override
	public String toString() {
		return "HourlyEmployee [wage = " + wage + ", hours = " + hours + ", getWage() = " + getWage() + ", getHours() = "
				+ getHours() + ", getPaymentAmount() = " + getPaymentAmount() + "]";
	}
	@Override
	public double getPaymentAmount() {
		
		return wage + hours;
	}
	
}
