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
        T s;
        if (first.compareTo(second) < 0) {
            s = first;
            first = second;
            second = s;
        }
        if (first.compareTo(third) < 0) {
            s = first;
            first = third;
            third = s;
        }
        if (second.compareTo(third) < 0) {
            s = second;
            second = third;
            third = s;
        }
    }
}
