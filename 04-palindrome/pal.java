/*
Code Jam!!
5/20/2020
pal.java

Write an efficient function that checks whether any permutation ↴ of an input string is a palindrome. ↴

You can assume the input string only contains lowercase letters.

Examples:

"civic" should return true
"ivicc" should return true
"civil" should return false
"livci" should return false

https://www.interviewcake.com/question/javascript/permutation-palindrome

What are qualities of a palindrome string? It has even number counts of characters or at most just one character with an odd count. 
This means the string is either of even length or an odd length with just exactly one character with an odd count.
*/

import java.util.*;

class pal {

  public static boolean hasPalindromePermutation(String theString) {
    // check if any permutation of the input is a palindrome
    HashMap<Character, Integer> myMap = new HashMap<>(); // char is the letter from string, int is the count

    for(int i = 0; i < theString.length(); ++i){
      char key = theString.charAt(i);
      if(myMap.containsKey(key)){
        myMap.replace(key, myMap.get(key)+1); // if it contains the letter, replace current value + 1
        }
        else{
        myMap.put(key, 1); // if the letter is not in the hash, add it and set to 1
        }
    }
    // count the number of odd occurances
    int odd = 0;
    // iterate through map
    for(Map.Entry<Character, Integer> entry : myMap.entrySet()){
      if (entry.getValue() % 2 != 0){ // if that entry is odd
        ++odd; // counting the number of odd letters
      }
    }
    if(odd > 1){
      return false;
    }
    else{
      return true;
    }

  }
// tests
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //Test 1 True
    boolean result = hasPalindromePermutation("aabcbcd");
    if (result == true)
      System.out.println("True is palindrome");
    else
      System.out.println("False is not palindrome");

    // Test 2 True
    result = hasPalindromePermutation("aabccbdd");
    if (result == true)
      System.out.println("True is palindrome");
    else
      System.out.println("False is not palindrome");

    // Test 3 False
    result = hasPalindromePermutation("aabcd");
    if (result == true)
      System.out.println("True is palindrome");
    else
      System.out.println("False is not palindrome");
      
    //Test 4 False
    result = hasPalindromePermutation("aabbcd");
    if (result == true)
      System.out.println("True is palindrome");
    else
      System.out.println("False is not palindrome");

    // Test 5 True
    result = hasPalindromePermutation("");
    if (result == true)
      System.out.println("True is palindrome");
    else
      System.out.println("False is not palindrome");

    // Test 6 True
    result = hasPalindromePermutation("a");
    if (result == true)
    System.out.println("True is palindrome");
    else
    System.out.println("False is not palindrome"); 

    // Test 7 True
    result = hasPalindromePermutation("civic");
    if (result == true)
        System.out.println("True is palindrome");
    else
        System.out.println("False is not palindrome");

    // Test 8 False
    result = hasPalindromePermutation("livci");
    if (result == true)
    System.out.println("True is palindrome");
    else
    System.out.println("False is not palindrome"); 
  }
}
