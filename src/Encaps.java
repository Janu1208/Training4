import java.util.Scanner;

public class Encaps {

	public static void main(String[] args) {
      Animal an1=new Animal();
      an1.name="Dog1";
      an1.breed="Pug";
      an1.color="white";
      an1.setPrice(5000);
      
      //System.out.println("Name:"+an1.name+ ", breed:" +an1.breed + ", price:" +an1.getPrice());
      System.out.println(an1);
      Animal an2 = new Animal("Dog2", "pomerian", 6000, "black");
      System.out.println(an2);
      
      
	  
    
      
	}

}
