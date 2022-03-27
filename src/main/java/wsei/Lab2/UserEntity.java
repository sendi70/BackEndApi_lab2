package wsei.Lab2;

public class UserEntity {
    private String name;
    private Integer age;
    public UserEntity(String param1,Integer param2){
        name= param1;
        age= param2;
    }

    public java.lang.String getName() {
        return name;
    }
    public java.lang.String setName(String name) {
        this.name=name;
    }

    public java.lang.Integer getAge() {
        return age;
    }
    public java.lang.String setAge(Integer age) {
        this.age=age;
    }
}
