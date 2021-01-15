package ru.ssau.tk.BeatsBoyXZP.SandboxXPaC.TasksDataTypes;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonTest {
    Person person1 = new Person();
    Person person2 = new Person("Key", "Black", 123456, Gender.MALE);
    Person person3 = new Person(Gender.FEMALE);

    @Test
    public void testGetAndSet() {
        person1.setFirstName("Key");
        person1.setLastName("Black");
        person1.setPassportId(15163);
        person1.setGender(Gender.MALE);
        assertEquals(person1.getFirstName(), "Key");
        assertEquals(person1.getLastName(), "Black");
        assertEquals(person1.getPassportId(), 15163, 0.000000001);
        assertEquals(person1.getGender(), Gender.MALE);
    }

    @Test
    public void testFirstName() {
        person1.setFirstName("Key");
        assertEquals(person1.getFirstName(), "Key");
    }

    @Test
    public void testLastName() {
        person1.setLastName("Black");
        assertEquals(person1.getLastName(), "Black");
    }

    @Test
    public void testPassportId() {
        person1.setPassportId(12345);
        assertEquals(person1.getPassportId(), 12345, 0.000001);
    }

    @Test
    public void testGender() {
        assertEquals(person3.getGender(), Gender.FEMALE);
    }

    @Test
    public void testErrorGet() {
        assertEquals(person1.getFirstName(), "Key");
    }

    @Test
    public void testTestToString() {
        Person person = new Person("Alexander", "Petrov");
        assertEquals(person2.toString(), "Key Black");
        assertEquals(person.toString(), "Alexander Petrov");
    }

    @Test
    public void testPersonConstruct() {
        assertEquals(person2.getFirstName(), "Key");
        assertEquals(person2.getLastName(), "Black");
        assertEquals(person2.getPassportId(), 123456);
        assertEquals(person2.getGender(), Gender.MALE);
    }
    @Test
    public void testToString() {
        Person person = new Person("Key", "Black");
        assertEquals(person2.toString(), "Key Black");
        assertEquals(person.toString(), "Key Black");
    }
    /*@Test
    public void testErrorNull(){
        person1.setLastName(Null);
        assertEquals(person1.getLastName(),"Black");
    }*/

}