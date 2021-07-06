package guru.springframework;

/*
    Author: jalnor
    Date: 7/5/2021 10:25 AM
    Project: guru.springframework
*/
public class Bank {
    Money reduce(Expression source, String toCurrency) {
        return source.reduce(this, toCurrency);
    }

    public int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }

    public void addRate(String from, String to, int rate) {
    }
}
