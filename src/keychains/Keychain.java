package keychains;

public class Keychain {
	public int id;
	public String name;
	public int price;

	public Keychain(int id, String name, int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void sePrice(int price) {
		this.price = price;
	}
}
