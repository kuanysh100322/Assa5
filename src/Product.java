public class Product implements ForTask2 {
    private double Height;
    private String Pname;

    public Product() {
    }

    public Product(String Pname, double Height) {
        this.Pname = Pname;
        this.Height = Height;

    }

    @Override
    public void degrade() {
    }

    @Override
    public String toString() {
        return Pname + ' ' + Height;
    }
}