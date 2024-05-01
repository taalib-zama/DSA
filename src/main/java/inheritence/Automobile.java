package inheritence;

import java.io.IOException;

public interface Automobile {
    public void drive();
    default public String status() { return "READY";}
}
