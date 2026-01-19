package educativeCourse.PassByReference;

import java.util.HashSet;

public class ObjectsClass {
    public static void main(String[] args) {
        HashSet<Celebrity> set = new HashSet();
        Celebrity realKardashian = new Celebrity("Kim", 17);
        Celebrity kardashianClone = new Celebrity("Kim", 17);
        set.add(realKardashian);


        if (set.contains(kardashianClone)) {
            System.out.println("Kim is a celebrity");
        } else {
            System.out.println("Can't find Kim");
        }

        System.out.println(realKardashian.equals(kardashianClone));
        System.out.println(realKardashian.hashCode() + " " +kardashianClone.hashCode());
    }
}
