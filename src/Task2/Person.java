package Task2;
public class Person {
   String name;
    String age;
    Gender gender;


    public Person(String age, String name, Gender gender) {
        this.age= age;
        this.name = name;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Член клуба читателей возрастом " +
                age + ' ' +
                ", по имени " + name + ' ' +
                ", пол члена " + gender + '\n';
    }

    enum Gender{
        MALE,
        FEMALE
    }
}
