class Van{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 780000;
	System.out.println("Van price="+price);
	name = "OMINI";
	System.out.println("Van name="+name);
	isAvailable = true;
	System.out.println("Van is Available="+isAvailable);
	type = 'A';
	System.out.println("Van type="+type);
	rating = 8.5f;
	System.out.println("Van ratings="+rating);
	weight = 250.5555;
	System.out.println("Van weight="+weight+"quintal");
	number = 2649688889l;
	System.out.println("Van number="+number);
}

}
