package fishShop;

public class Aquarium {
 private String name;
 private String dimensions;
public Aquarium() {
	super();
}
public Aquarium(String name, String dimensions) {
	super();
	this.name = name;
	this.dimensions = dimensions;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDimensions() {
	return dimensions;
}
public void setDimensions(String dimensions) {
	this.dimensions = dimensions;
}
public void printAquariumCard() {
	System.out.println("----------");
	System.out.println("Balýk Akvaryum Kartý");
	System.out.println("Balýk Akvaryum Adý :"+this.getName());
	System.out.println("Balýk Akvaryum Ebatý :"+this.getDimensions());
}
}
