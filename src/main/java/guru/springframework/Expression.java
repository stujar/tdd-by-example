package guru.springframework;

/*
    Author: jalnor
    Date: 7/5/2021 10:21 AM
    Project: guru.springframework
*/
public interface Expression {
    Money reduce(Bank bank, String to);
}
