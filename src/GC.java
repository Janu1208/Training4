
public class GC {
	public static void main(String[] args) {

        Product p1 = new Product("Lenova ");
        Product p2 = new Product("Samsung");
        
        Product p3 = p1;
        
        Product p4 = p1;
        
        p2 = null; // P2 object is eligible for GC
        
        p1 =  null; // here p1 object is not eligible for GC because other objects are using it
        
        p4 = p1;
        p4 = null;
        
        p3 = null;
        System.gc();
        
    }
    
}
