// the file that is being executed

import java.util.Scanner;

public class whatGradeMain {
    public static void main(String[] args) {
        intro();
        Scanner console = new Scanner(System.in);
        if (prompt("Would you like to start a new grade calculation?", console)) {
            whatGradeWeights temp = new whatGradeWeights();
            temp = getData(temp, console);
        }
    }

    public static void intro() {
        System.out.println("Hi, welcome to whatGradeDoINeed!");
        System.out.println("You can use this app to find out how much can you fuck up your next assignment/test");
    }

    public static boolean prompt(String prompt, Scanner console) {
        System.out.println();
        System.out.print(prompt + " (y/n)? ");
        String response = console.nextLine().trim().toLowerCase();
        return response.equals("y");
    }

    public static whatGradeWeights getData(whatGradeWeights temp, Scanner console) {
        System.out.println("What is the name of the class?");
        temp.setName(console.next());
        System.out.println("What is the percentage of your homework score out of your" +
                            " total grade? (x% or 0% for nothing)");
        temp.setHwPc(console.nextDouble());
        System.out.println("What is the percentage of your quiz score out of your total grade? (x%)");
        temp.setQzPc(console.nextDouble());
        return temp;
    }

}
