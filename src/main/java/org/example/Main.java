package org.example;

public class Main {
    public static void main(String[] args) {
        //given
        // takes an array containing the names of people
        String[] names = {"Alex", "Jacob", "Mark", "Max" };
        //when
        String result =whoLikesIt(names);
        System.out.println(result);
    }

    private static String whoLikesIt(String[] names) {
        if (names.length==0){
            return ("no one likes this");
        } else if (names.length == 1) {
            return names[0]  +" likes this";
        } else if (names.length == 2) {
            return names[0] +" and "+names[1] + " like this";
        } else if (names.length == 3) {
            return names[0] + ", "+names[1]+" and "+ names[2]+" like this";
        } else {
           return names[0]+", "+names[1]+ " and "+(names.length-2)+" others like this";
        }
    }
}


