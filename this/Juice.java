class Juice{
public Juice(){
	this(50);
}
public Juice(int price){
	this(50, "Mango");
}
public Juice(int price,String name){
	this(50, "Mango",34545655l);

}public Juice(int price, String name, long number){
	this(50, "Mango",34545655l, 10f);
}
public Juice(int price, String name, long number, float temperature){
	this(50, "Mango",34545655l, 10f,500.55);
}
public Juice(int price, String name, long number, float temperature, double volume){
	this(50, "Mango", 34545655l, 10f,500.55, 'A');
	
}
public Juice(int price, String name, long number, float temperature, double volume, char type){
	this(50, "Mango", 34545655l, 10f,500.55,'A', true);
}
public Juice(int price, String name, long number, float temperature, double volume, char type,boolean IsTesty){
System.out.println("price is ="+price);
System.out.println("name  is ="+name);
System.out.println("number is ="+number);
System.out.println("temperature is="+temperature+"C");
System.out.println("volume is ="+volume+"L");
System.out.println("type is ="+type);
System.out.println("IsTesty ="+IsTesty);


}
}
