
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonBuilderTest {
    PersonBuilder p = new PersonBuilder();

    @Test
    void setName(){
       p.setName("Vanya");
        Assertions.assertEquals("Vanya", p.name);
    }
    @Test
    void setSurname(){
        p.setSurname("Ivanov");
        Assertions.assertEquals("Ivanov", p.surname);
    }
    @Test
    void setAge(){
        p.setAge(23);
        Assertions.assertEquals(23, p.age);
    }
    @Test
    void setAddress(){
        p.setAddress("Shanghai");
        Assertions.assertEquals("Shanghai", p.address);
    }
}
