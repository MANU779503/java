class Jeep{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 78000000;
	System.out.println("Jeep price="+price);
	name = "MAHINDRA";
	System.out.println("Jeep name="+name);
	isAvailable = true;
	System.out.println("Jeep is Available="+isAvailable);
	type = 'A';
	System.out.println("Jeep type="+type);
	rating = 9.5f;
	System.out.println("Jeep ratings="+rating);
	weight = 15.5555;
	System.out.println("Jeep weight="+weight+"tun");
	number = 26496896789l;
	System.out.println("Jeep number="+number);
}

}
