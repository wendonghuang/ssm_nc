package book.ch7.allproperties;
//1 创建类 2 配置文件 3 使用
public class Student {
    private int id;
    private String userName;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
    //pojo alt+insert alt+enter
    public void setId(int id) {
        this.id = id;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}

