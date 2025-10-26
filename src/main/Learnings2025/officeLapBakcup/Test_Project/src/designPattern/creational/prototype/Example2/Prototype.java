package designPattern.creational.prototype.Example2;

import lombok.SneakyThrows;

public abstract class Prototype<T> implements Cloneable {
    public T clone() {
        try {
            return (T) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @SneakyThrows
    public T copy() {
        return (T) super.clone();
    }
}
