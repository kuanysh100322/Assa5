import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;



public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchFieldException {

        final Seller seller = Seller.class.getConstructor(String.class,int.class ).newInstance("Aruzhan",21);
        Field sellerName = Seller.class.getDeclaredField("Name");
        Field sellerAge = Seller.class.getDeclaredField("Age");
        System.out.println(sellerName + " " + sellerAge );
        System.out.println(seller);

        final Product product = Product.class.getConstructor(String.class, double.class).newInstance("Banana", 10.5);
        Field productPname = Product.class.getDeclaredField("Pname");
        Field productHeight = Product.class.getDeclaredField("Height");
        System.out.println(productHeight + " " + productPname );
        System.out.println(product);

    }

}

