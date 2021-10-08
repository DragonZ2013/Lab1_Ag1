package Main;

import java.util.Arrays;

public class Main {

    int[] grades = {10, 29, 30, 35, 38, 41, 42, 43, 45, 46, 36, 71, 77, 73, 81, 84};
    public int[] aufgabe_1()
    {
        int[] returnGrades={};
        for (int note: grades) {
            if(note>=38)
                returnGrades= Arrays.copyOf(returnGrades,returnGrades.length+1);
            returnGrades[returnGrades.length-1]=note;
        }
        return returnGrades;
    }
    public static void main(String[] args) {
	// write your code here

        int[] print_1 = new aufgabe_1();
        System.out.println(print_1);


    }

}
