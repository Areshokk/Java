package Lab2.task3;

public class Mark {
    private int mark;

    public double getMark() {
        return mark;
    }

    public void setMark(final int mark) {
        this.mark = mark;
    }

    public Mark(final int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "" + mark;
    }
}
