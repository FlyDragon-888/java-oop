package seminar6.hw2_notebook.models;

public interface Fileable<T> {
    T read();

    void save(T t);
}
