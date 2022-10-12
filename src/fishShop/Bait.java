package fishShop;

public class Bait {
	private String name;
	private int veight;
	public Bait() {
		super();
	}
	public Bait(String name, int veight) {
		super();
		this.name = name;
		this.veight = veight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVeight() {
		return veight;
	}
	public void setVeight(int veight) {
		this.veight = veight;
	}
	public void printBaitCard() {
		System.out.println("----------");
		System.out.println("Balýk Yemi Kartý");
		System.out.println("Balýk Yemi Adý :"+this.getName());
		System.out.println("Balýk Yemi Aðýrlýðý :"+this.getVeight()+"gr");
	}

}
