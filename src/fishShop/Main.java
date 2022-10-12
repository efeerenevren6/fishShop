package fishShop;

public class Main {

	public static void main(String[] args) {
		Fish balýk=new Fish();
		balýk.setName("Hamsi");
		balýk.setAge(3);
		balýk.setSize(18);
		balýk.printFishCard();	
		
		Rod olta=new Rod();
		olta.setName("Pandora x Flex 2.40M 14-52 gr Light Spin Olta Kamýþý");
		olta.setSize(2.40);
		olta.setVeight(265);
		olta.printRodCard();
		
		Bait yem=new Bait();
		yem.setName("Hunter Eyes 250 gr Palet Yem 6mm Çupra-Levrek-Sazan- Avý Için");
		yem.setVeight(250);
		yem.printBaitCard();
		yem.printBaitCard();
		
		//gg
		
		Aquarium akvaryum=new Aquarium();
		akvaryum.setName("Oval Kesim Ýthal Cama Cam Akvaryum 35x20x23Cm 4m");
		akvaryum.setDimensions("35x20x23cm");
		akvaryum.printAquariumCard(); 
	}	
}

