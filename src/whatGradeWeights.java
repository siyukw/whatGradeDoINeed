// create whatGrade objects to store information about a class
public class whatGradeWeights {
    private String name;
    private double quizPercentage;
    private double hwPercentage;
    private double participationPercentage;
    private double otherPercentage;

    public whatGradeWeights(String name, double quizPercentage, double hwPercentage,
                            double participationPercentage, double otherPercentage) {
        this.name = name;
        this.quizPercentage = quizPercentage;
        this.hwPercentage = hwPercentage;
        this.participationPercentage = participationPercentage;
        this.otherPercentage = otherPercentage;
    }
}
