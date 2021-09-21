package com.deadline;

public class Tools {
    public int countLetters(char[] letters, char letter) {
        int count = 0;
        for (char let:letters) {
            if(Character.toLowerCase(let) == Character.toLowerCase(letter)) count++;
        }
        return count;
    }
}
