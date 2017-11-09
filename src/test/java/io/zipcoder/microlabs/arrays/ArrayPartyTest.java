package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    ArrayParty arrayParty = new ArrayParty();

    @Test
    public void printArrayTest() {
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" + "Sausage\n" + "Eggs\n" + "Beans\n" + "Bacon\n" + "Tomatoes\n" + "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

        String actual = arrayParty.lastElement(breakfast);
        String expected = "*** Output ***\n" + "Mushrooms";
        Assert.assertEquals(actual, expected);
    }

    //TODO Define the method lastButOneTest

    @Test
    public void lastButOneTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String actual = arrayParty.lastButOneTest(breakfast);
        String expected = "*** Output ***\n" + "Tomatoes";
        Assert.assertEquals(actual, expected);

    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest() {
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String actual = arrayParty.reverse(breakfast);
        String expected = "*** Output ***\n" + "Mushrooms\n" + "Tomatoes\n" + "Bacon\n" + "Beans\n" + "Eggs\n" + "Sausage";
        Assert.assertEquals(actual, expected);
    }
    //TODO Define the method isPalindromeTest

    @Test
    public void isPalindromeTest() {

        String[] breakfast = {"Mushrooms", "Tomatoes", "Bacon", "Beans", "Eggs", "Sausage"};
        String actual = arrayParty.isPalindrome(breakfast);
        String expected = "Sausage\n" + "Eggs\n" + "Beans\n" + "Bacon\n" + "Tomatoes\n" + "Mushrooms";
        Assert.assertEquals(actual, expected);

    }


    //TODO Define the method compressTest

    @Test
    public void compressTest(){

        int [] nums = {1,1,2,2,2,3,3,3,1,1,1,1,4,4,4,4};

        String expected = "*** Output ***\n" + "1\n" + "2\n"+"3\n" + "4";
        String actual = arrayParty.compress(nums);
        Assert.assertEquals(expected,actual);
    }

    //TODO Define the method packTest

    @Test
    public void duplicatesTest(){
        char [] letters = {'a','a','a','b','c', 'c','a','a','d','e','e','e','e'};
        String expected = "***OutPut***" + " aaa,b,cc,aa,d,eeee";
        String actual = arrayParty.pack(letters);

        Assert.assertEquals(expected, actual);

        }

}
