package io.zipcoder.microlabs.arrays;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArrayParty {

    public String printArray(String[] inputArray) {


        String arrayPerLine = "*** Output ***\n";
        for (String i : inputArray) {
            arrayPerLine += i + "\n";
        }
        return arrayPerLine.trim();
    }

    public String lastElement(String[] inputArray) {

        String lastWord = "";
        String arrayPerLine = "*** Output ***\n";
        for (int i = 0; i < inputArray.length; i++) {
            lastWord = inputArray[inputArray.length - 1];
        }
        return arrayPerLine += lastWord;

    }

    //TODO Define the method lastButOne
    public String lastButOneTest(String[] inputArray) {

        String lastButOneWord = "";
        String arrayPerLine = "*** Output ***\n";
        for (int i = 0; i < inputArray.length; i++) {
            lastButOneWord = inputArray[inputArray.length - 2];
        }
        return arrayPerLine += lastButOneWord;
    }

//TODO Define the method reverse

    public String reverse(String[] inputArray) {

        String lastWord = "";

        List<String> food = Arrays.asList(inputArray);

        Collections.reverse(food);

        String arrayPerLine = "*** Output ***\n";

        for (int i = 0; i < food.size(); i++) {
            lastWord += food.get(i) + "\n";
        }
        return arrayPerLine += lastWord.trim();
    }


//TODO Define the method isPalindrome

    public String isPalindrome(String[] inputArray) {

        String result = "";

        for (int j = inputArray.length - 1; j >= 0; j--) {

            result += "\n" + inputArray[j];

        }
        return result.trim();
    }


//TODO Define the method compress

    public String compress(int[] array) {

        String result = "*** Output ***";

        HashSet<Integer> numbers = new HashSet<Integer>();

        for (Integer i : array) {
            numbers.add(i);
        }

        for(int i : numbers) {
            result += "\n"+  i;
        }
        return result;

    }


//TODO Define the method pack

    public String pack(char [] letters) {

        String converted = "***OutPut*** " + letters[0];

        for(int i = 1; i< letters.length;i++){

            if(letters[i] != letters[i-1]){

                converted += "," + letters[i];
            }else {
                converted +=  letters[i];
            }
        }
        return converted;
    }
}
