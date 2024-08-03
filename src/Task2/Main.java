package Task2;
public class Main {
   public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("15", "Сергей", Person.Gender.MALE));
        persons.add(new Person("12", "Миша", Person.Gender.MALE));
        persons.add(new Person("23", "Павел", Person.Gender.MALE));
        persons.add(new Person("44", "Игнат", Person.Gender.MALE));
        persons.add(new Person("34", "Борис", Person.Gender.MALE));
        persons.add(new Person("18", "Мария", Person.Gender.FEMALE));
        persons.add(new Person("22", "Наташа", Person.Gender.FEMALE));
        persons.add(new Person("45", "Татьяна", Person.Gender.FEMALE));
        persons.add(new Person("24", "Маргарита", Person.Gender.FEMALE));
        persons.add(new Person("39", "Анастасия", Person.Gender.FEMALE));
        persons.add(new Person("3", "Глаша", Person.Gender.FEMALE));
        personsGender(persons, "MALE");
    }
    public static void personsGender (List<Person> listExample, String gender) {
        Person.Gender input1 = Person.Gender.valueOf(gender);
        for (int i = 0; i < listExample.size(); i++) {
            if (listExample.get(i).gender.equals(input1)) {
                System.out.println(listExample.get(i));
            }
        }
    }
}
