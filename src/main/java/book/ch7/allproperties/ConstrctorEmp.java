package book.ch7.allproperties;
//前面完成的所有例 子是基于空构造方法+set方法实现对象的创建+属性的注入
 //现在直接用构造方法完成对象创建和属性注入
public class ConstrctorEmp {
    private  int id;
    private String name;
    private double salary;
    public ConstrctorEmp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("1");
    }
    public ConstrctorEmp(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("2");
    }
    public ConstrctorEmp(int id, double salary) {
        this.id = id;
        this.salary = salary;
        System.out.println("3");
    }
    @Override
    public String toString() {
        return "ConstrctorEmp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
