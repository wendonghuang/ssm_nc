package book.ch8.xmlaop;

public class UserDaoImp implements Userdao {

    @Override
    public void insert() {
        System.out.println("inside success");
    }

    @Override
    public void delete() {
        System.out.println("delete success");
    }

    @Override
    public void update() {
        System.out.println("update success");
    }

    @Override
    public void select() {
        System.out.println("select success");
    }
}
