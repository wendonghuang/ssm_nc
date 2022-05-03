package book.ch8.jdbcTemplateTx;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

/*
 * 知识点：
 * 1 setAutoCommit(boolean autoCommit)
 * 	true 确定JDBC是单条语句作为一个事务， false是多条语句作为一个事务
 * 2 commit是执行上述多条sql
 *	 rollback回退（做错了，或者某一部分没做，可以退回原始状态，或前述保存点霜个保存点）
 * 3 Savepoint用以存放事务状态的一个对象
 */
import org.junit.Test;
public class TransMoneyImp implements TransMoney{
	private Connection conn= book.ch8.jdbcTemplateTx.DBHelper.getConnection();
	public boolean trans(String sourceAccount, String desAccount, double money) {
		Savepoint sp1 = null,sp2=null;
		String sql1="UPDATE account SET balance=balance-? WHERE username=?";
		String  sql2="UPDATE account SET balance=balance+? WHERE username=?";
		try {
			conn.setAutoCommit(false);//1
			PreparedStatement ps=conn.prepareStatement(sql1);
			ps.setDouble(1,money);
			ps.setString(2,sourceAccount);
			ps.executeUpdate();		
			//sp1=conn.setSavepoint("sp1");
			//System.out.println(1/0);
			ps=conn.prepareStatement(sql2);
			ps.setDouble(1,money);
			ps.setString(2,desAccount);
			ps.executeUpdate();		
			//sp2=conn.setSavepoint("sp1");
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			//conn.rollback();//发生异常自动回退
			e.printStackTrace();
		}
		return true;
	}
	@Test
	public void test1(){
		System.out.println(this.trans("aaa", "bbb", 100));
	}
	@Override
	public boolean trans(String sourceAccount, String[] desAccounts, double money) {

		
		return false;
	}
	public void find(){
		//...
	}
}
/*
setAutoCommit
void setAutoCommit(boolean autoCommit)
            throws SQLException

Sets this connection's auto-commit mode to the given state. If a connection is in auto-commit mode, 
then all its SQL statements will be executed and committed as individual transactions. Otherwise, 
its SQL statements are grouped into transactions that are terminated by a call to either the method commit or the method rollback. 
By default, new connections are in auto-commit mode. 
The commit occurs when the statement completes. The time when the statement completes depends on the type of SQL Statement: 
◦For DML statements, such as Insert, Update or Delete, and DDL statements, the statement is complete as soon as it has finished executing. 
◦For Select statements, the statement is complete when the associated result set is closed. 
◦For CallableStatement objects or for statements that return multiple results, the statement is complete when all of the associated result sets have been closed, and all update counts and output parameters have been retrieved. 

NOTE: If this method is called during a transaction and the auto-commit mode is changed, the transaction is committed. If setAutoCommit is called and the auto-commit mode is not changed, the call is a no-op.
Parameters:autoCommit - true to enable auto-commit mode; false to disable itThrows:SQLException - if a database access error occurs, setAutoCommit(true) is called while participating in a distributed transaction, or this method is called on a closed connectionSee Also:getAutoCommit()

*/