class VegetableRunner2{

public static void main(String args[]){


int number = Vegetable.numberOfVegetables(8);
char vegetableCategory = Vegetable.vegetableCategory('A');
boolean areThere = Vegetable.areThere(true);
long vegetablePrice = Vegetable.vegetablePrice(245678954l);
double VegitableCoast = Vegetable.VegitableCoast(2.8);
float Rating = Vegetable.vegitableRatings(9.0f);
String name= Vegetable.nameOfVegetable("tomato");

System.out.println("number of vegitables"+ " "+number);
System.out.println("category of vegitables"+" "+vegetableCategory);
System.out.println("vegitables are there"+" "+areThere);
System.out.println("price "+" "+vegetablePrice);
System.out.println("ratings "+" "+Rating);
System.out.println("cost in laks"+" "+VegitableCoast);
System.out.println("vegitable name"+ " "+name);

}
}