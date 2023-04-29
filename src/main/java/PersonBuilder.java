

public class PersonBuilder {
    String name;
    String surname;
    int age = -1;
    String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("имя должно быть объязательно");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("фамилия должна быть объязательно");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("возраст не может быть отрецательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null) {
            throw new IllegalStateException("укажите имя");
        }
        if (surname == null) {
            throw new IllegalStateException("укажите фамилию");
        }

        return new Person(name, surname, age, address);
    }
}
