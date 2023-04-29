

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    String name = "Ivan";
    String surname = "Petrov";
    int age = 23;
    String address = "Vancouver";

    Person p = new Person(name, surname, age, address);
    @Test
    void getName(){
        String expectedName = p.getName();
        Assertions.assertEquals(expectedName, p.getName());
    }
    @Test
    void getSurname(){
        String expectedSurname = p.getSurname();
        Assertions.assertEquals(expectedSurname, surname);
    }
    @Test
    void getAge(){
        int expectedAge = p.getAge().getAsInt();
        Assertions.assertEquals(expectedAge, age);
    }
    @Test
    void getAddress(){
        String expectedAddress = p.getAddress();
        Assertions.assertEquals(expectedAddress, address);
    }
    @Test
    void hasAge(){
        Assertions.assertTrue(p.hasAge());
    }
    @Test
    void happyBirthday(){
        int expectedAge = p.getAge().getAsInt() + 1;
        p.happyBirthday();
        Assertions.assertEquals(expectedAge, p.getAge().getAsInt());
    }
}
