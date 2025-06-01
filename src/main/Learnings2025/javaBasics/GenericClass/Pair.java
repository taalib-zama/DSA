package javaBasics.GenericClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pair <K,V>{
    private K key;
    private V value;

    

    public void put(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
