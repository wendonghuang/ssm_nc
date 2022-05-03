package book.ch7.injection3layer.mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository//@Component
public class UserMapperImp implements  UserMapper {
    public void insert() {
        System.out.println("插入成功...");
    }
    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }

    @Override
    public void select() {

    }
}
