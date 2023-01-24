public class book {
    String bname;
    author Author;
    double price;
    int qty;
    public book(String bname, author Author, double price, int qty){
        this.bname = bname;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }

    public String getBname() {
        return bname;
    }

    public author getAuthor() {
        return Author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString(){
        return"";
    }
}

