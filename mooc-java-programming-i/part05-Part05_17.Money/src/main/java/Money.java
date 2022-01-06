
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        if (cents < 0) {
            euros--;
            cents = (100+cents);
        }

        if (euros < 0) {
            euros = 0;
            cents = 0;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros+addition.euros, this.cents+addition.cents);
        return newMoney;
    }

    public Money minus(Money decreaser) {
        Money newMoney = new Money(this.euros-decreaser.euros, this.cents-decreaser.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros)
            return true;
        else if (this.euros == compared.euros && this.cents < compared.cents)
            return true;
        else
            return false;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
