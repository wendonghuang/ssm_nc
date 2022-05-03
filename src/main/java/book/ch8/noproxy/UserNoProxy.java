package book.ch8.noproxy;
public class UserNoProxy implements  UserService{
    private Logging logging=new Logging();
    private Transaction transaction=new Transaction();
    private UserService userService=new UserServiceImp();
    @Override
    public void login() {
        logging.startLogging();
        transaction.startTrans();
        userService.login();
        transaction.commitTrans();
        transaction.closeTrans();
        logging.closeLogging();
    }
    @Override
    public void insert() {
        logging.startLogging();
        transaction.startTrans();
        userService.insert();
        transaction.commitTrans();
        transaction.closeTrans();
        logging.closeLogging();
    }
}
