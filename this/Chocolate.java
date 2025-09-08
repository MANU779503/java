class Chocolate{
public Chocolate(){
	this(300);
}
public Chocolate(int price){
	this(300, "dairy milk");
}
public Chocolate(int price,String name){
	this(300, "dairy milk",123456l);

}public Chocolate(int price, String name, long series){
	this(300, "dairy milk",123456l, 10f);
}
public Chocolate(int price, String name, long series, float temperature){
	this(300, "dairy milk",123456l, 10f,500.55);
}
public Chocolate(int price, String name, long series, float temperature, double weight){
	this(300, "dairy milk", 123456l, 10f,500.55, 'A');
	
}
public Chocolate(int price, String name, long series, float temperature, double weight, char type){
	this(300, "dairy milk", 123456l, 10f,500.55,'A', true);
}
public Chocolate(int price, String name, long series, float temperature, double weight, char type,boolean AreTesty){
System.out.println("price is ="+price);
System.out.println("name  is ="+name);
System.out.println("series is ="+series);
System.out.println("temperature is="+temperature+"C");
System.out.println("weight is ="+weight+"grams");
System.out.println("type is ="+type);
System.out.println("AreTesty ="+AreTesty);


}
}
