import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surname;
    private int age = -1;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public boolean hasAge() {
        return age >= 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        if (address == null) {
            return "адресс неизвестен!";
        }
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (this.hasAge()) age++;
    }

    @Override
    public String toString() {
        String name = getName();
        String surname = getSurname();
        String ageString;
        if (hasAge()) {
            ageString = String.valueOf(age);
        } else {
            ageString = "возраст не указан";
        }
        String address = getAddress();
        return name + " " + surname
                + "(возраст: " + ageString
                + ", адрес: " + address
                + ");";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }
}