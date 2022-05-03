package book.ch8.jdbcTemplateTx;
import book.ch8.jdbcTemplateTx.TransMoney;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.AbstractPlatformTransactionManager;
public class TransMoneyAnnotation implements TransMoney {
	private JdbcTemplate jdbcTemplate;	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Transactional()
	public boolean trans(String sourceAccount, String desAccount, double money) {
		jdbcTemplate.update("UPDATE account SET balance=balance-? WHERE username=?",
				money,sourceAccount);

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
		ApplicationContext ac=new ClassPathXmlApplicationContext("book/ch8/jdbcTemplateTx/template.xml");
		TransMoney dao=ac.getBean("transMoney",TransMoney.class);
		dao.trans("bbb", "aaa", 100);
	}
}
