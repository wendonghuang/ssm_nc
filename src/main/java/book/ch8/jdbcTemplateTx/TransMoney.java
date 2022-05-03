package book.ch8.jdbcTemplateTx;

public interface TransMoney {
	boolean trans(String sourceAccount, String desAccount, double money);
	boolean trans(String sourceAccount, String[] desAccounts, double money);
}
