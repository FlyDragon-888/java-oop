package seminar6.hw1_restructurized.models;

public interface Persister<T>{
    void save(T t);
}
