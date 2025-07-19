package generic.test.ex2;

public class Pair<T1, T2> {
    private T1 item1;
    private T2 item2;

    public void setFirst(T1 data) {
        this.item1 = data;
    }

    public void setSecond(T2 data) {
        this.item2 = data;
    }

    public T1 getFirst() {
        return item1;
    }

    public T2 getSecond() {
        return item2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + item1 +
                ", second=" + item2 +
                '}';
    }
}
