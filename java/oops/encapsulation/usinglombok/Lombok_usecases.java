package oops.encapsulation.usinglombok;

import java.time.LocalDateTime;

public class Lombok_usecases {
    public static void main(String[] args) {
        System.out.println("A");
        StudentLambok studentLambok = StudentLambok.builder()
                .firstName("Talib")
                .lastName("Zama")
                .rollNumber(23)
                .admissionTime(LocalDateTime.now())
                .build();
        StudentLambok newStudentLambok = new StudentLambok(21, "Aaquib", "Zama", LocalDateTime.now());

    }
}
