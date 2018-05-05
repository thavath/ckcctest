package Exception;

public class UserDefinedException {

	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount(101);
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		try {
			System.out.println("\nWithdrawing $100...");
			c.withdraw(100.00);
			System.out.println("\nWithdrawing $600...");
			c.withdraw(600.00);
		} catch (InsufficientFundsException e) {
			// TODO: handle exception
			System.out.println("\nSorry, your balance doesn't have enough money. "
					+ "\nYour balance need $"+e.getAmount()+ " more...\nThanks for your understanding. ");
			e.printStackTrace();
		}
	}

}