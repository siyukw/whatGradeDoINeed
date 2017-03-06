import java.io.*;
import java.util.*;

// create whatGrade objects to store information about a class
// name, hwpc, quizpc, otherpc, exampc
public class whatGradeWeights {
    private String name;
    private double quizPercentage;
    private double hwPercentage;
    private double otherPercentage;
    private double examPercentage;
    private Scanner console;

    public whatGradeWeights() {
        this(null, 0, 0, 0, 0);
    }

    public whatGradeWeights(String name, double quizPercentage, double hwPercentage,
                            double otherPercentage, double examPercentage) {
        this.name = name;
        this.quizPercentage = quizPercentage;
        this.hwPercentage = hwPercentage;
        this.examPercentage = examPercentage;
        this.otherPercentage = otherPercentage;
    }

    public void print(PrintStream output) {
        // print whatGradeWeights in right format
        output.print(name + " " + hwPercentage + " " + quizPercentage
                + " " + otherPercentage + " " + examPercentage);
        output.println();

    }

    public void setInput(File storage) throws FileNotFoundException{
        console = new Scanner(storage);
    }

    public void setName(String input) {
        name = input;
    }
    public void setQzPc(Double input) {
        quizPercentage = input;
    }
    public void setHwPc(Double input) {
        hwPercentage = input;
    }
    public void setOPc(Double input) {
        otherPercentage = input;
    }
    public void setExPc(Double input) {
        examPercentage = input;
    }


}
