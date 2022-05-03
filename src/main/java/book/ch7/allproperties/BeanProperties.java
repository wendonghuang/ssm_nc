package book.ch7.allproperties;
import java.util.*;
public class BeanProperties {
    private int id;
    private String name;
    private Date date;
    private String[] nameArr;
    private Student stu;
    private Student[] stuArray;
    private List<Student> lists;
    private Set<Student> sets;
    private Map<String,Student> maps;

    @Override
    public String toString() {
        return "BeanProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", nameArr=" + Arrays.toString(nameArr) +
                ", stu=" + stu +
                ", stuArray=" + Arrays.toString(stuArray) +
                ", lists=" + lists +
                ", sets=" + sets +
                ", maps=" + maps +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNameArr(String[] nameArr) {
        this.nameArr = nameArr;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void setStuArray(Student[] stuArray) {
        this.stuArray = stuArray;
    }

    public void setLists(List<Student> lists) {
        this.lists = lists;
    }

    public void setSets(Set<Student> sets) {
        this.sets = sets;
    }

    public void setMaps(Map<String, Student> maps) {
        this.maps = maps;
    }

    public BeanProperties() {
    }

    public BeanProperties(int id, String name, Date date, String[] nameArr, Student stu, Student[] stuArray, List<Student> lists, Set<Student> sets, Map<String, Student> maps) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.nameArr = nameArr;
        this.stu = stu;
        this.stuArray = stuArray;
        this.lists = lists;
        this.sets = sets;
        this.maps = maps;
    }
}
