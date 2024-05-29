public class Money {

    Long dollars;
    Long cents;

    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = (long) ((amount - dollars) * 100);
    }

    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long totalDollars = this.dollars + otherAmount.dollars + totalCents / 100;
        return new Money(totalDollars + totalCents % 100 / 100.0);
    }

    public Money subtract(Money otherAmount) {
        long totalCents = (this.dollars * 100 + this.cents) - (otherAmount.dollars * 100 + otherAmount.cents);
        return new Money(totalCents / 100.0);
    }

    public int compareTo(Money otherObject) {
        if (this.dollars > otherObject.dollars || (this.dollars == otherObject.dollars && this.cents > otherObject.cents)) {
            return 1;
        } else if (this.dollars == otherObject.dollars && this.cents == otherObject.cents) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean equals(Money otherObject) {
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" + cents : cents);
    }

}
