package officeLaptopBackUp.collections.ComparatorAndComparable.UsingLambdaExperssion.sortingUsingComaparator;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    private LocalDateTime updatedDate;

    public AbstractEntity(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }
}