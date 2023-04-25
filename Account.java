package app;

public class Account {

	private String Number;
	private double Balance;
	private String Name;
	private String Email;
	private String PhoneNumber;
	
	public Account(String Number,double Balance,String Name,String Email,String PhoneNumber) {
		this.Number=Number;
		this.Balance=Balance;
		this.Name=Name;
		this.Email=Email;
		this.PhoneNumber=PhoneNumber;
	}
	
	public void DepositMoney(double DepositedMoney) {
		this.Balance+=DepositedMoney;
		System.out.println("Deposit is successfull,new Balance is "+this.Balance);
	}
	
	public void WithDraw(double WithdrawlMoney) {
		if(this.Balance-WithdrawlMoney<0) { 
			System.out.println("Withdraw Unsuccessfull only "+this.Balance+" is left");
		}
		else {
		this.Balance-=WithdrawlMoney;
		System.out.println("Withdraw successfull,current Balance is "+this.Balance);
		}
	}
	
	public String getNumber()
	{
		return Number;
	}
	 
	public void setNumber(String number) {
		Number=number;
	}
	
	public double getBalance()
	{
		return Balance;
	}
	 
	public void setBalance(double balance) {
		Balance=balance;
	}
	
	public String getName()
	{
		return Name;
	}
	 
	public void setName(String name) {
		Name=name;
	}
	
	public String getEmail()
	{
		return Email;
	}
	 
	public void setEmail(String email) {
		Email=email;
	}
	
	public String getPhoneNumber()
	{
		return PhoneNumber;
	}
	 
	public void setPhoneNumber(String phonenumber) {
		PhoneNumber=phonenumber;
	}
	
	
}
