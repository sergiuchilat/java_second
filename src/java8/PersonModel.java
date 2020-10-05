package java8;

public class PersonModel {
    public static Integer counter = 1;
    private Integer id;
    private String name;
    private Integer age = 18;
    private Float salary = 1000.0F;

    PersonModel(String name) {
        this.id = counter++;
        this.name = name;
    }
    PersonModel(String name, Integer age) {
        this(name);
        this.age = age;
    }

    PersonModel(String name, Integer age, Float salary) {
        this(name, age);
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
