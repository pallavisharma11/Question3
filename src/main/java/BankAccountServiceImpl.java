
public class BankAccountServiceImpl implements BankAccountService {
	private bankAccount bankObj;
	

	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub
		double currentBal = getBalance(accountId);
		
		return currentBal-balance ;
	}

	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub
		double currentBal = getBalance(accountId);
		
		return currentBal+balance ;
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		if(bankObj.getAccountId() == accountId) {
			return bankObj.getAccoutBalance();
		}
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		// TODO Auto-generated method stub
		return true;
	}

}
