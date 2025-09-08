class IceCream{
public IceCream(){
	this(200);
}
public IceCream(int price){
	this(200, "straberry");
}
public IceCream(int price,String name){
	this(200, "straberry",233455l);

}public IceCream(int price, String name, long series){
	this(200, "straberry",233455l, 1.4f);
}
public IceCream(int price, String name, long series, float temperature){
	this(200, "straberry",233455l, 1.4f,500.55);
}
public IceCream(int price, String name, long series, float temperature, double weight){
	this(200, "straberry", 233455l, 1.4f,500.55, 'A');
	
}
public IceCream(int price, String name, long series, float temperature, double weight, char type){
	this(200, "straberry", 233455l, 1.4f,500.55,'A', true);
}
public IceCream(int price, String name, long series, float temperature, double weight, char type,boolean AreTesty){
System.out.println("price is ="+price);
System.out.println("name  is ="+name);
System.out.println("series is ="+series);
System.out.println("temperature is="+temperature+"C");
System.out.println("weight is ="+weight+"grams");
System.out.println("type is ="+type);
System.out.println("AreTesty ="+AreTesty);


}
}
