package Abstract;

public class MainClass {

	public static void main(String[] args) {
		
		StaffMember[] staff = new StaffMember[4];
		
		staff[0] = new Executive("12345", 40.0, "Thavath", "Phnom Penh", "+855938752", 50);
		staff[1] = new Hourly("55555", 30.0, "Daraka", "Phnom Penh", "+85596333358", 150);
		staff[2] = new Employee("55555", 30.0, "Daraka", "Phnom Penh", "+85596333358");
		staff[3] = new Voluntear("Dara", "Phnom Thom", "+855964534");
		((Executive)staff[0]).setBonus(500.00);
		((Hourly)staff[1]).addHours(40);
		
		for (int i = 0; i < staff.length; i++) {
			System.out.println("========================================");
			System.out.println(staff[i].toString());
			double payment = staff[i].pay();
			if (payment == 0) {
				System.out.println(" Thank for your help! \r See you next time.");
			}else {
				System.out.println(" Your total payment is: "+payment+"\r Thank for your hardwork...!");
			}
		}
	}

}
