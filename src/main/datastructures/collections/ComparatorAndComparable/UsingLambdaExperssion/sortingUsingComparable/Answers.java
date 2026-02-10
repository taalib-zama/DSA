package officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComparable;

import lombok.Getter;
import officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComaparator.AbstractEntity;

import java.time.LocalDateTime;

public class Answers extends AbstractEntity implements Comparable<Answers> {
    @Getter
    private String answerText;

    private String answerRank;

    public Answers(String answerText, String answerRank ,LocalDateTime updatedDate) {
        super(updatedDate);
        this.answerText = answerText;
    }


    @Override
    public int compareTo(Answers other) {
        // First compare by updatedDate in descending order
        int dateComparison = other.getUpdatedDate().compareTo(this.getUpdatedDate());
        if (dateComparison != 0) {
            return dateComparison;
        }

        // If updatedDate is equal, compare by answerText in ascending order
        return this.answerText.compareTo(other.answerText);
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answerText='" + answerText + '\'' +
                ", updatedDate=" + getUpdatedDate() +
                '}';
    }
}