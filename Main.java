package app;

public class Main {

	public static void main(String args[]) {
		Account GokulAccount=new Account("12345",0.0,"Gokul","abc@gmail.com","6383014166");
		GokulAccount.DepositMoney(100);
		GokulAccount.DepositMoney(150);
		GokulAccount.WithDraw(200);
		
	}
}
