package fishShop;

public class Rod {
	private String name;
	private double size;
	private int veight;
	public Rod() {
		super();
	}
	public Rod(String name, int size, int veight) {
		super();
		this.name = name;
		this.size = size;
		this.veight = veight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getVeight() {
		return veight;
	}
	public void setVeight(int veight) {
		this.veight = veight;
	}
	public void printRodCard() {
		System.out.println("----------");
		System.out.println("Bal�k Oltas� Kart�");
		System.out.println("Bal�k Oltas� Ad� :"+this.getName());
		System.out.println("Bal�k Oltas� Boyu :"+this.getSize()+"cm");
		System.out.println("Bal�k Oltas� A��rl��� :"+this.getVeight()+"gr");
	}

}
