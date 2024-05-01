package collections.generics.EqualityTester;

public class    EqualityTester<T,T1> {T value1;
    T value2;
    public EqualityTester(){

    }
    public EqualityTester(T value1, T value2) {
        this.value1=value1;
        this.value2=value2;
    }
    public boolean checkEquals(T[] array1 , T1[] array2){
        return array1.equals(array2);
    }
    public boolean checkEquals() {
        return value1.equals(value2);
    }

    public String arrayLengthTest(T[] array1, T1[] array2){
        return(array1.length == array2.length ? "Equal":"Not Equal");
    }
}
