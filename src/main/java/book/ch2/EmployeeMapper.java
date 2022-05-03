package book.ch2;

public interface EmployeeMapper {
    //根据id查询员工信息、新增员工信息、根据id修改员工信息、根据id删除员工信息
    Employee findByID(Integer id);
    boolean insertID(Employee employee);
    boolean updateByID(Integer id);
    boolean deleteByID(Integer id);
}
