package com.company;

public class String_search {
    public static void main(String[] args) {
        String name= "Sourabh";
        char target = 'g';
        System.out.println(search(name,target));

    }

    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //For-each loop or say modified for loop
    static boolean search2(String str, char target){
        if (str.length()==0){
            return false;
        }
        for (char ch :str.toCharArray()){
            if (ch==target){
                return true;
            }
        }
        return false;
    }
}
