class Bread{
public Bread(){
	this(50);
}
public Bread(int price){
	this(50, "Plane");
}
public Bread(int price,String name){
	this(50, "Plane",34545655l);

}public Bread(int price, String name, long number){
	this(50, "Plane",34545655l, 10f);
}
public Bread(int price, String name, long number, float temperature){
	this(50, "Plane",34545655l, 10f,500.55);
}
public Bread(int price, String name, long number, float temperature, double Weight){
	this(50, "Plane", 34545655l, 10f,500.55, 'A');
	
}
public Bread(int price, String name, long number, float temperature, double Weight, char type){
	this(50, "Plane", 34545655l, 10f,500.55,'A', true);
}
public Bread(int price, String name, long number, float temperature, double Weight, char type,boolean IsTesty){
System.out.println("price is ="+price);
System.out.println("name  is ="+name);
System.out.println("number is ="+number);
System.out.println("temperature is="+temperature+"C");
System.out.println("Weight is ="+Weight+"grams");
System.out.println("type is ="+type);
System.out.println("IsTesty ="+IsTesty);


}
}
