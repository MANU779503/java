class Auto{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 500000;
	System.out.println("Auto price="+price);
	name = "Ape";
	System.out.println("Auto name="+name);
	isAvailable = true;
	System.out.println("Auto is Available="+isAvailable);
	type = 'A';
	System.out.println("Auto type="+type);
	rating = 8.5f;
	System.out.println("Auto ratings="+rating);
	weight = 200.5555;
	System.out.println("Auto weight="+weight+"KG");
	number = 26494787689l;
	System.out.println("Auto number="+number);
}

}
