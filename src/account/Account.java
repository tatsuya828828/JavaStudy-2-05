package account;

public class Account {
	private String accountNo;
	private int balance;
	// 列挙型をフィールドとして使う
	private AccountType accountType;

	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
		this.balance = 0;
	}

	public String toString() {
		return "口座種別:"+ this.accountType +"/口座番号:"+ this.accountNo +"/残高:"+ this.balance +"円";
	}
}
