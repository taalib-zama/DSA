package officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComaparator;

import java.time.LocalDateTime;

public class Answers extends AbstractEntity {
    private String answerText;

    public Answers(String answerText, LocalDateTime updatedDate) {
        super(updatedDate);
        this.answerText = answerText;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answerText='" + answerText + '\'' +
                ", updatedDate=" + getUpdatedDate() +
                '}';
    }
}