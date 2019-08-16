
public class Book {
    public String Title;
    public int price;
    public String authorName;
    
    public Book(String Title,int price, String authorName)
    {
    	this.Title=Title;
    	this.price=price;
    	this.authorName=authorName;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Book bk1 = new Book("C", 200, "Balagurusamy");
       Book bk2 = new Book("C", 200, "Balagurusamy");
       Book bk3=bk1;
       
       System.out.println("Hash Code => book1:" +bk1.hashCode()+ " Hash Code => book2:" +bk2.hashCode()+ " Hash Code => book3:" +bk1.hashCode());
       System.out.println("Is book1 == book2" +(bk1 == bk2));
       System.out.println("Is book1.equals(book2) " + (bk1.equals(bk2)));
       System.out.println("Is book1 == book3" + (bk1 == bk3));
       System.out.println("Is book1.equals(book3) " + (bk1.equals(bk3)));
       
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Title == null) ? 0 : Title.hashCode());
		result = prime * result + ((authorName == null) ? 0 : authorName.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Title == null) {
			if (other.Title != null)
				return false;
		} else if (!Title.equals(other.Title))
			return false;
		if (authorName == null) {
			if (other.authorName != null)
				return false;
		} else if (!authorName.equals(other.authorName))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

}
