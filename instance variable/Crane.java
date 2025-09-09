class Crane{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 156600000;
	System.out.println("Crane price="+price);
	name = "Sany";
	System.out.println("Crane name="+name);
	isAvailable = true;
	System.out.println("Crane is Available="+isAvailable);
	type = 'A';
	System.out.println("Crane type="+type);
	rating = 8.5f;
	System.out.println("Crane ratings="+rating);
	weight = 2500.5555;
	System.out.println("Crane weight="+weight+"tun");
	number = 2649688889l;
	System.out.println("Crane number="+number);
}

}
