import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void personWithNameTest(){
        String expectedName = "Tanzir";

        Person testPerson = new Person(expectedName);

        assertEquals(expectedName, testPerson.getName());
    }

    @Test
    void personWithAgeTest(){
        int expectedAge = 27;

        Person testPerson = new Person(expectedAge);

        assertEquals(expectedAge, testPerson.getAge());
    }

    @Test
    void personWithNameAndAgeTest(){
        String expectedName = "Tanzir";
        int expectedAge = 27;

        Person testPerson = new Person(expectedName, expectedAge);

        assertEquals(expectedAge, testPerson.getAge());
        assertEquals(expectedName, testPerson.getName());
    }

    @Test
    void setName() {
        //Given
        Person person = new Person();
        //When
        String expectedName = "Tanzir";
        person.setName(expectedName);
        //Then
        assertEquals(expectedName, person.getName());

    }

    @Test
    void setAge() {
        Person peron = new Person();
        int expectedAge = 27;
        peron.setAge(expectedAge);

        assertEquals(expectedAge, peron.getAge());
    }

    @Test
    void getName() {
        Person person = new Person();
        String expectedName = "Tanzir";
        person.setName(expectedName);
        String actualName = person.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    void getAge() {
        Person person = new Person();
        int expectedAge = 27;
        person.setAge(expectedAge);
        int actualAge = person.getAge();

        assertEquals(expectedAge, actualAge);
    }

    @Test
    void addName() {
        Person person = new Person();
        String addThisName = "Tanzir";

        person.addName(addThisName);

        assertEquals(addThisName, person.getListOfNames().get(0));
    }

    @Test
    void removeName() {
        Person person = new Person();
        String removeThisName = "Tanzir";
        person.addName(removeThisName);
        person.removeName(removeThisName);

        assertFalse(person.getListOfNames().contains(removeThisName));
    }

    @Test
    void getSizeOfList() {
        Person person = new Person();
        String name1 = "Doodie-Lo";
        String name2 = "Pookie";
        String name3 = "Mikilla";

        person.addName(name1);
        person.addName(name2);
        person.addName(name3);

        int size = person.getSizeOfList();

        assertEquals(size, person.getSizeOfList());
    }
}