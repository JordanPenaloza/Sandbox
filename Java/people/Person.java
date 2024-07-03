package Java.people;

public class Person {

    protected int age = 0;
    protected String name = "";

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getDesc() {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }

}
