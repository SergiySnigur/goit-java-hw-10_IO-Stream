package exercise_2;

public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
