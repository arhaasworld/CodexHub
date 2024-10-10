package generics;

public class Employee {

    private Integer id;

    private String name;

    private String city;

    public Employee(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ']';
    }
}
