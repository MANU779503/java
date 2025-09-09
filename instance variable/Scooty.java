class Scooty{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 80000;
	System.out.println("Scooty price="+price);
	name = "ACTIVA";
	System.out.println("Scooty name="+name);
	isAvailable = true;
	System.out.println("Scooty is Available="+isAvailable);
	type = 'A';
	System.out.println("Scooty type="+type);
	rating = 8.5f;
	System.out.println("Scooty ratings="+rating);
	weight = 1.5555;
	System.out.println("Scooty weight="+weight+"quintal");
	number = 2649689l;
	System.out.println("Scooty number="+number);
}

}
