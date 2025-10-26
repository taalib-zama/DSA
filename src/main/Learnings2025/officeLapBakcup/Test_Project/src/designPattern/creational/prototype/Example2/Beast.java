package designPattern.creational.prototype.Example2;


import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Beast extends Prototype<Beast> {
    public Beast(Beast source) {}

    public Beast(String protecting, int i, int i1) {
        super();
    }
}
