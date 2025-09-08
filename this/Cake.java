class Cake{
public Cake(){
	this(1000);
}
public Cake(int price){
	this(1000, "Chocolate");
}
public Cake(int price,String name){
	this(1000, "Chocolate",34545655l);

}public Cake(int price, String name, long number){
	this(1000, "Chocolate",34545655l, 10f);
}
public Cake(int price, String name, long number, float temperature){
	this(1000, "Chocolate",34545655l, 10f,500.55);
}
public Cake(int price, String name, long number, float temperature, double weight){
	this(1000, "Chocolate", 34545655l, 10f,500.55, 'A');
	
}
public Cake(int price, String name, long number, float temperature, double weight, char type){
	this(1000, "Chocolate", 34545655l, 10f,500.55,'A', true);
}
public Cake(int price, String name, long number, float temperature, double weight, char type,boolean IsTesty){
System.out.println("price is ="+price);
System.out.println("name  is ="+name);
System.out.println("number is ="+number);
System.out.println("temperature is="+temperature+"C");
System.out.println("weight is ="+weight+"grams");
System.out.println("type is ="+type);
System.out.println("IsTesty ="+IsTesty);


}
}
