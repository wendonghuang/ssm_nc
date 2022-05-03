package Test_th.Mapper.Mapper;

import org.springframework.stereotype.Repository;

@Repository
public class UserMapperImp implements UserMapper {
    @Override
    public void insert() {
        System.out.println("插入成功");
    }

    @Override
    public void delete() {
        System.out.println("删除成功");
    }

    @Override
    public void update() {
        System.out.println("修改成功");
    }

    @Override
    public void select() {
        System.out.println("查询成功");
    }
}
