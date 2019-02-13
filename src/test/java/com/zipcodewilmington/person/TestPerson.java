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
        person.setAge(expectedAge);
        person.setName(expectedName);


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
    public void testgetHeight(){
        //given
        Person person = new Person();
        Integer expected = 6;
        //when
        person.setHeightInFeet(6);
        //then
        Integer actual = person.getHeightInFeet();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testsetHeight(){
        //given
        Person person = new Person();
        Integer expected = 6;
        //when
        person.setHeightInFeet(6);
        //then
        Integer actual = person.getHeightInFeet();
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void  test_setEyeColor(){

        //given
        Person person = new Person();
        String expected = "Green";
        //when
        person.setEyeColor(expected);
        //then
        String actual = person.getEyeColor();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void test_setHairColor(){
        //given
        Person person = new Person();
        String expected= "brown";
        //when
        person.setHairColor(expected);
        //then
        String actual = person.getHairColor();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test_setHasInny(){
        //given
        Person person = new Person();
        Boolean expected = false;
        //when
        person.setHasInny(expected);
        //then
        Boolean actual = person.getHasInny();
        Assert.assertFalse(actual);
    }

    @Test
    public void test_setWeightInLbs(){
        //give
        Person person = new Person();
        Double expected = 160.00;
        //when
        person.setWeightinLbs(expected);
        //then
        Double actual = person.getWeightinLbs();



        Assert.assertEquals(expected,actual,0.01);
    }
}
