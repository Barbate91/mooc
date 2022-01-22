public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int getQty() {
        return this.qty;
    }

    public int getPrice() {
        return this.unitPrice;
    }

    public int price() {
        return this.unitPrice*this.qty;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    public boolean take() {
        if (this.qty > 0) {
            this.qty--;
            return true;
        } else
            return false;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
