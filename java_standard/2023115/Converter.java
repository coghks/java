package model2;

public interface Converter<F,T> {
    T convert(F from);
}
