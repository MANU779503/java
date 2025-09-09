class Tractor{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 50000000;
	System.out.println("Tractor price="+price);
	name = "Mahedra";
	System.out.println("Tractor name="+name);
	isAvailable = true;
	System.out.println("Tractor is Available="+isAvailable);
	type = 'A';
	System.out.println("Tractor type="+type);
	rating = 9.5f;
	System.out.println("Tractor ratings="+rating);
	weight = 2.5555;
	System.out.println("Tractor weight="+weight+"tun");
	number = 26494787689l;
	System.out.println("Tractor number="+number);
}

}
