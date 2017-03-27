// the file that is being executed

// this project will be put on hold due to lack of interest,
// I will restart it around half way Spring 2017
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class whatGradeMain {
    public static final String QUESTION_FILE = "storage.txt";

    public static void main(String[] args) throws FileNotFoundException {
        intro();
        Scanner console = new Scanner(System.in);
        whatGradeWeights temp = new whatGradeWeights();
        // temp is the object for grade percentage
        PrintStream output = new PrintStream(new File(QUESTION_FILE));
        if (prompt("Would you like to start a new grade calculation?", console)) {
            temp = getData(temp, console);
            temp.print(output);
        } else {
            temp = getGrades(console);
        }
        whatGradeWeights num = new whatGradeWeights();
        if (!prompt("Would you like to enter new grades", console)) {
            num = getNums(num, console);
            num.print(output);
        } else {
            num = enterScore(num, console);
        }

        // enter your own score
        // enter your expectation
        // enter category you wanna change
        // output


    }

    public static whatGradeWeights getNums(whatGradeWeights num, Scanner console) {

    }

    public static whatGradeWeights enterScore(whatGradeWeights num, Scanner console) {

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
        System.out.println("What is the percentage of your other score out of your total grade? (x%)");
        temp.setOPc(console.nextDouble());
        System.out.println("What is the percentage of your exam score out of your total grade? (x%)");
        temp.setExPc(console.nextDouble());

        return temp;
    }

    public static whatGradeWeights getGrades(Scanner console) throws FileNotFoundException {
        System.out.println("What class would you like to see?");
        String inputName = console.next();
        Scanner input = new Scanner(new File(QUESTION_FILE));
        String line = "";
        while(input.hasNextLine()) {
            line = input.nextLine();
            Scanner lineS = new Scanner(line);
            if (lineS.next().equals(inputName)) {
                break;
            }
        }
        whatGradeWeights curr = new whatGradeWeights();
        Scanner lineS = new Scanner(line);
        while (lineS.hasNext()){
            String name = lineS.next();
            double hw = lineS.nextDouble();
            double quiz = lineS.nextDouble();
            double other = lineS.nextDouble();
            double exam = lineS.nextDouble();
            curr.setName(name);
            curr.setHwPc(hw);
            curr.setQzPc(quiz);
            curr.setExPc(exam);
            curr.setOPc(other);
        }
        return curr;
    }

}
