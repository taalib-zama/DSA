package collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTypes {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"One");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(2, "two");
        map.put(2, "two");
        map.put(2, "two");
        map.put(21, "twenty one");
        //Elements will be printed in random order
        System.out.println("HashMap : " +map);

        Map<Integer,String> tmap = new TreeMap<Integer,String>();
        tmap.put(1,"One");
        tmap.put(5, "Five");
        tmap.put(7, "Seven");
        tmap.put(2, "two");
        tmap.put(21, "twenty one");
        tmap.put(2, "two");
        //Elements will be printed in sorted order of keys
        System.out.println("TreeMap: "+tmap);

        Map<Integer,String> lmap = new LinkedHashMap<Integer,String>();
        lmap.put(1,"One");
        lmap.put(5, "Five");
        lmap.put(7, "Seven");
        lmap.put(2, "two");
        lmap.put(21, "twenty one");
        lmap.put(2, "two");
        //Elements will be printed in insertion order
        System.out.println("LinkedHashMap : "+lmap);
    }
}
