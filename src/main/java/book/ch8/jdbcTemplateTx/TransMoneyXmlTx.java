package book.ch8.jdbcTemplateTx;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
public class TransMoneyXmlTx implements TransMoney{	
	private JdbcTemplate jdbcTemplate;	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public boolean trans(String sourceAccount, String desAccount, double money) {
		jdbcTemplate.update("UPDATE account SET balance=balance-? WHERE username=?", 
				money,sourceAccount);
		//System.out.println(1/0);
		jdbcTemplate.update("UPDATE account SET balance=balance+? WHERE username=?", 
				money,desAccount);		
		return true;
	}

	@Override
	public boolean trans(String sourceAccount, String[] desAccounts, double money) {
		// TODO Auto-generated method stub
		return false;
	}
	@Test
	public void t1(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("book/ch8/jdbcTemplateTx/xmltx.xml");
		TransMoney dao=ac.getBean("transMoney",TransMoney.class);
		dao.trans("aaa", "bbb", 100);
		PlatformTransactionManager pl;
		AbstractPlatformTransactionManager abm;
	}
}
