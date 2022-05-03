package Test_th.Mapper.Service;

import Test_th.Mapper.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
@Autowired
    private UserMapper userMapper;

    @Override
    public void insert() {
        userMapper.insert();
    }

    @Override
    public void delete() {
        userMapper.delete();
    }

    @Override
    public void update() {
        userMapper.update();
    }

    @Override
    public void select() {
        userMapper.select();
    }
}
