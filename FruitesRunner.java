class FruitesRunner{

public static void main(String args[]){


int number = Fruites.numberOfFruites(80);
char Category = Fruites.FruitesCategory('B');
boolean FruitesareThere = Fruites.areThere(true);
long Price = Fruites.FruitesPrice(245678954l);
double Coast = Fruites.FruitesCoast(2.8);
float Rating =Fruites.FruitesRatings(9.6f);
String name= Fruites.nameOfFruites("Apple");

System.out.println("number of Fruites"+ " "+number);
System.out.println("category of Fruites"+" "+Category);
System.out.println("Fruites are there"+" "+FruitesareThere);
System.out.println("price "+" "+Price);
System.out.println("ratings "+" "+Rating);
System.out.println("cost in laks"+" "+Coast);
System.out.println("Fruites name"+ " "+name);

}
}