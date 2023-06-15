import java.util.ArrayList;

public class BankAccountreposioryImpl implements BankAccountRepository {
	private bankAccount bankObj;
	
	private ArrayList<bankAccount> bankAcc = new ArrayList<bankAccount>();


	public ArrayList<bankAccount> getBankAcc() {
		return bankAcc;
	}

	public void setBankAcc(ArrayList<bankAccount> bankAcc) {
		this.bankAcc = bankAcc;
	}
	
	
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		if(bankObj.getAccountId() == accountId) {
			return bankObj.getAccoutBalance();
		}
		
		
		return 0;
	}

	public double UpdateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		double currentBalance = getBalance(accountId);
		return currentBalance+newBalance;
	}


}
