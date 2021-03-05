public class Seller implements ForTask2 {
    private String Name;
    private int Age;

    public Seller() {
    }

    public Seller( String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    @Override
    public void degrade() {
    }


    @Override
    public String toString() {
        return  Name + ' ' + Age;
    }
}
