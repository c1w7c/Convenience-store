package StoreStock;

public class Articles {
	
	private String ID;
	private String name;
	private int stock;
	
	public Articles() {
		
	}
	
	public Articles(String ID,String name,int stock) {
		this.ID = ID;
		this.name = name;
		this.stock = stock;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
