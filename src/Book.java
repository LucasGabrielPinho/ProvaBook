public class Book {
    private String name;
    private Author[] authors;
    private double prince;
    private int qty = 0;

    public Book(String name, Author[] authors, Double prince, int qty) {
        this.name = name;
        this.authors = authors;
        this.prince = prince;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthor(){
        String dbAuthor = "";
        for(Author author : this.authors){
            dbAuthor += author;
        }
        return dbAuthor;
    }

    public String toString(){
        String dbAuthor = "";
        for(Author author : this.authors){
            dbAuthor += author;
        }
        return this.name + ", " + this.prince + ", " + this.qty + ", " + dbAuthor;

    }

    public String getDbAuthor(){
        String dbAuthor = "";
        for(Author author : this.authors){
            dbAuthor += author;
        }
        return dbAuthor;
    }

}
