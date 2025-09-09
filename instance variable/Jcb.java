class Jcb{
	public int price;
	public String name;
	public boolean isAvailable;
	public char type;
	public float rating;
	public double weight;
	public long number;
	
public void PrintAll(){
	price= 1500000;
	System.out.println("Jcb price="+price);
	name = "JCB";
	System.out.println("Jcb name="+name);
	isAvailable = true;
	System.out.println("Jcb is Available="+isAvailable);
	type = 'A';
	System.out.println("Jcb type="+type);
	rating = 8.5f;
	System.out.println("Jcb ratings="+rating);
	weight = 250.5555;
	System.out.println("Jcb weight="+weight+"tun");
	number = 2649688889l;
	System.out.println("Jcb number="+number);
}

}
