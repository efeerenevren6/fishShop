package fishShop;

public class Main {

	public static void main(String[] args) {
		Fish bal�k=new Fish();
		bal�k.setName("Hamsi");
		bal�k.setAge(3);
		bal�k.setSize(18);
		bal�k.printFishCard();	
		
		Rod olta=new Rod();
		olta.setName("Pandora x Flex 2.40M 14-52 gr Light Spin Olta Kam���");
		olta.setSize(2.40);
		olta.setVeight(265);
		olta.printRodCard();
		
		Bait yem=new Bait();
		yem.setName("Hunter Eyes 250 gr Palet Yem 6mm �upra-Levrek-Sazan- Av� I�in");
		yem.setVeight(250);
		yem.printBaitCard();
		yem.printBaitCard();
		
		//gg
		
		Aquarium akvaryum=new Aquarium();
		akvaryum.setName("Oval Kesim �thal Cama Cam Akvaryum 35x20x23Cm 4m");
		akvaryum.setDimensions("35x20x23cm");
		akvaryum.printAquariumCard(); 
	}	
}

