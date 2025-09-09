class Cycle{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 5000;
	System.out.println("cycle price="+price);
	name = "BUZZ";
	System.out.println("cycle name="+name);
	isAvailable = true;
	System.out.println("cycle is Available="+isAvailable);
	type = 'A';
	System.out.println("cycle type="+type);
	rating = 9.5f;
	System.out.println("cycle ratings="+rating);
	weight = 15.5555;
	System.out.println("cycle weight="+weight);
	number = 23466867689l;
	System.out.println("cycle number="+number);
}

}
