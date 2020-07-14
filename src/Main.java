import static account.AccountType.*;

import account.Account;

public class Main {
	public static void main(String[] args) {
		Pocket<String> p = new Pocket<>();
		p.put("1192");
		System.out.println(p.get());

		Account a = new Account("1732050", FUTSU);
		System.out.println(a.toString());
	}
}
