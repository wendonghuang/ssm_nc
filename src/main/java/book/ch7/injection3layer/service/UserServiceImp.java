package book.ch7.injection3layer.service;
import book.ch7.injection3layer.mapper.UserMapper;
import book.ch7.injection3layer.mapper.UserMapperImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service//@Component
public class UserServiceImp implements  UserService{
    @Autowired //在容器中查找对象，按类型注入
    //@Resource(name="userMapperImp") //非常清晰指定从容器中取哪个对象注入
    private UserMapper userMapper;//=new UserMapperImp();
    @Override
    public void insert() {
        userMapper.insert();
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
