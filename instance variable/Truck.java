class Truck{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 77000000;
	System.out.println("Truck price="+price);
	name = "EICHER";
	System.out.println("Truck name="+name);
	isAvailable = true;
	System.out.println("Truck is Available="+isAvailable);
	type = 'A';
	System.out.println("Truck type="+type);
	rating = 7.5f;
	System.out.println("Truck ratings="+rating);
	weight = 25.5555;
	System.out.println("Truck weight="+weight+"tun");
	number = 2649689l;
	System.out.println("Truck number="+number);
}

}
