package Homework_15;

public class Trinity<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Trinity(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
        sort();
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
        sort();
    }

    public void setSecond(T second) {
        this.second = second;
        sort();
    }

    public void setThird(T third) {
        this.third = third;
        sort();
    }

    private void sort() {
        T t;
        if (first.compareTo(second) < 0) {
            t = first;
            first = second;
            second = t;
        }
        if (first.compareTo(third) < 0) {
            t = first;
            first = third;
            third = t;
        }
        if (second.compareTo(third) < 0) {
            t = second;
            second = third;
            third = t;
        }
    }
}
