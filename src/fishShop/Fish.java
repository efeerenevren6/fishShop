package fishShop;

public class Fish {
	private String name;
	private int size;
	private int age;
	public Fish() {
		super();
	}
	public Fish(String name, int size, int age) {
		super();
		this.name = name;
		this.size = size;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printFishCard() {
	System.out.println("----------");
	System.out.println("Balýk Kimlik Kartý");
	System.out.println("Balýk Adý :"+this.getName());
	System.out.println("Balýk Boyu :"+this.getSize()+"m");
	System.out.println("Balýk Yaþý :"+this.getAge());
	}

}
