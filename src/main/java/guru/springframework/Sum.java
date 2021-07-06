package guru.springframework;
/*
    Author: jalnor
    Date: 7/5/2021 11:18 PM
    Project: guru.springframework
*/
public class Sum implements Expression {

    Money augend;
    Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augend.amount + addend.amount;
        return new Money(amount, to);
    }
}
