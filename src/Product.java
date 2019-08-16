
public class Product {

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + "]";
    }

    private String name;

    public Product(String name) {
        //super();
        this.name = name;
    }
    
    @Override
    protected void finalize() throws Throwable { 
        System.out.println("Finalize method called before GC process");
    }

	}


