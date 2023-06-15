import java.util.ArrayList;

public class BankAccountController {
	private bankAccount bankObj;
	
	
	public bankAccount getBankObj() {
		return bankObj;
	}
	public void setBankObj(bankAccount bankObj) {
		this.bankObj = bankObj;
	}
	public double withdraw(long accountId, double balance) {
		double currentBal = getBalance(accountId);
		
		return currentBal-balance ;
	}
	public double deposit(long accountId, double balance) {
        double currentBal = getBalance(accountId);
		
		return currentBal+balance ;
	}
	public double getBalance(long accountId) {
		if(bankObj.getAccountId() == accountId) {
			return bankObj.getAccoutBalance();
		}
		return 0;
		
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		return true;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("WithDraw Amount:- "+withdraw(bankObj.getAccountId(),40000));
		System.out.println("Deposit Amount:- "+deposit(bankObj.getAccountId(),34000));
		System.out.println("Current Amount:- "+getBalance(bankObj.getAccountId()));
		
	}

}
