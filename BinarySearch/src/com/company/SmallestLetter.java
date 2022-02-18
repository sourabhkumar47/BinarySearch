package com.company;

public class SmallestLetter {


    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            //Find middle element

            //int mid=(start + end)/2; //Here is an error
            //Might be ( start+end ) > int range , so it give error to fix
            int mid = start + (end - start) / 2; //to get solve equation, it is same as above

            if (target < letters[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        //Return when element not found
        return letters[start % letters.length]; //When the while loop break it return start
    }
}