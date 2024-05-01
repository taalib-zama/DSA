package hackerearth.twelve;

import java.io.Serializable;

public class MyClass implements Serializable {
    String s;
    int i;
    double d;

    MyClass(String s, int i , double d){
        this.d = d;
        this.i = i;
        this.s = s;
    }
    @Override
    public String toString(){
        return "s="+s+",i="+i+", d=" +d;
    }

}
