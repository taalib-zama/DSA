package oops.encapsulation.usinglombok;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentLambok {
    private Integer rollNumber;
    private String firstName;
    private String lastName;
    private LocalDateTime admissionTime;
}
