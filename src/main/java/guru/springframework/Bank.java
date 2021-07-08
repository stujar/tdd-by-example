package guru.springframework;

import java.util.HashMap;

/*
    Author: jalnor
    Date: 7/5/2021 10:25 AM
    Project: guru.springframework
*/
public class Bank {

    private final HashMap<Pair, Integer> rateMap = new HashMap<>();

    Money reduce(Expression source) {
        return source.reduce(this, "USD");
    }

    int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        return rateMap.get(new Pair(from, to));
    }

    void addRate(String from, String to, int rate) {
        rateMap.put(new Pair(from, to), rate);
    }
}
