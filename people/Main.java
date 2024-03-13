package people;

public class Main {
    public static void main(String[] args) {
        Doctor mike = new Doctor(4);
        mike.setAge(30);
        mike.setName("Mike");
        mike.getDesc();

        Person jordan = new Person();
        jordan.setName("Jordan");
        jordan.setAge(21);
        jordan.getDesc();

        DoctorAssistant jake = new DoctorAssistant(1);
        jake.setAge(19);
        jake.setName("Jake");
        jake.getDesc();

    }
}
