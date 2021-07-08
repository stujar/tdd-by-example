package guru.springframework;

import java.util.Objects;

/*
    Author: jalnor
    Date: 7/6/2021 8:08 AM
    Project: guru.springframework
*/
public class Pair {

    private final String from;
    private final String to;

    Pair(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        boolean result;
        if (this == o) {
            result = true;
        } else if (o == null || getClass() != o.getClass()) {
            result = false;
        } else {
            Pair pair = (Pair) o;
            result = from.equals(pair.from) && to.equals(pair.to);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
