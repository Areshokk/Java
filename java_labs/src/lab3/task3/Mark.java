package lab3.task3;

import java.util.List;
import java.util.ArrayList;

public class Mark {
    public List<Integer> mark = new ArrayList<>();

    public Mark(final List<Integer> mark) {
        this.mark = mark;
    }

    public Mark() {
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(final List<Integer> mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return " " + mark;
    }
}
