public class Animal {
	public String name;
	public String breed;
	private int p;
	public String color;
	
	public Animal()
	{
		System.out.println("Default constructor");
	}
	public Animal(String name,String breed,int p,String color)
	{
		System.out.println("4 argument constructor");
		this.name=name;
		this.breed=breed;
		this.p=p;
		this.color = color;
	}
	/*public String toString()
	{
		// return "[ Name" +this.name+ ", Breed" +this.breed + ", Price" +this.p+ " , Color" +this.color+ "]";
		
		StringBuffer content = new StringBuffer();
        content.append("[ ");
        content.append("Name:").append(this.name).append(",");
        content.append("Breed:").append(this.breed).append(",");
        content.append("price:").append(this.p);
        content.append("Color:").append(this.color);
        content.append("]");
        return content.toString();
	}*/
	
	public void setPrice(int price)
	{
		if(price<0)
		{
			throw new IllegalArgumentException("Invalid price");
		}
		this.p=price;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", breed=" + breed + ", p=" + p + ", color=" + color + ", getPrice()="
				+ getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getPrice()
	{
		return p;
	}
	

}

