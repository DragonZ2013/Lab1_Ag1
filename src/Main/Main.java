package Main;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
        int[] grades = {10, 29, 30, 35, 38, 41, 42, 43, 45, 46, 36, 71, 77, 73, 81, 84};
        System.out.println(aufgabe_4(grades));
        int[] print_1 = aufgabe_1(grades);
        for(int i: print_1)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(aufgabe_2(grades));
        int[] print_3 = aufgabe_3(grades);
        for(int i: print_3)
            System.out.print(i+" ");
        System.out.println();
        System.out.println(aufgabe_4(grades));

    }

    public static int[] aufgabe_1(int [] grades)
    {//returns the array of insufficient grades
        int[] returnGrades={};
        for (int note: grades) {
            if(note<38) {
                returnGrades = Arrays.copyOf(returnGrades, returnGrades.length + 1);
                returnGrades[returnGrades.length - 1] = note;
            }
        }
        return returnGrades;
    }
    public static int round(int x)
    {//rounds the value if it's greater(or equal) than 38
        if(x<38)
            return x;
        if(x%5>=3)
            return x+5-x%5;
        return x-x%5;
    }

    public static double aufgabe_2(int [] grades)
    {//returns the average of the grades
        double sum=0;
        for (int note: grades) {
            sum+=note;
        }
        return sum/grades.length;

    }

    public static int[] aufgabe_3(int [] grades)
    {//returns an array with rounded grades
        int[] returnGrades=new int[grades.length];
        for (int i=0;i<grades.length;i++) {
            returnGrades[i]=round(grades[i]);

        }
        return returnGrades;
    }

    public static double aufgabe_4(int [] grades)
    {//returns the maximum value of grades
        double max_val=0;
        for (int note: grades) {
            if(note>max_val)
                max_val=note;
        }
        return max_val;

    }

}
