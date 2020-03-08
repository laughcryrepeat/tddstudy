package study.tdd.demo;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }
}
