import models.Pants;
import models.Product;
import models.Shirt;

public class Main {
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Shirt shirt = new Shirt(Shirt.Size.SMALL, 5.99, "blue","JAVA VUITTON");
        Pants pants = new Pants(32, 5.99, "blue","JAVA KLEIN");
        Shirt shirt2 = new Shirt(shirt);
        Pants pants2 = new Pants(pants);

        // shirt.equals(shirt2);
        // System.out.println(shirt.hashCode());
        // System.out.println(shirt2.hashCode()); 

        System.out.println(shirt);



     }

  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */
}
