package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetFavoriteColor(){
        Person person = new Person();
        String expected = "Blue";
        person.setFavoriteColor(expected);
        String actual = person.getFavoriteColor();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetBirthDay(){
        Person person = new Person();
        String expected = "08/13/2002";
        person.setBirthDay(expected);
        String actual = person.getBirthDay();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetNickName(){
        Person person = new Person();
        String expected = "Yev";
        person.setNickName(expected);
        String actual = person.getNickName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetLuckyNumber(){
        Person person = new Person();
        Integer expected = 3;
        person.setLuckyNumber(expected);
        Integer actual = person.getLuckyNumber();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetSalary(){
        Person person = new Person();
        Integer expected = 70000;
        person.setSalary(expected);
        Integer actual = person.getSalary();
        Assert.assertEquals(expected, actual);
    }
}
