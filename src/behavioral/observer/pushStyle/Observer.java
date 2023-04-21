package behavioral.observer.pushStyle;

@FunctionalInterface
public interface Observer<T> {
    void update(T value);
}
