class Indigo{
public String name;
public int ticketPrice;
public Runway runway;

public Indigo(String name,int ticketPrice,Runway runway){
this.name=name;
this.ticketPrice=ticketPrice;
this.runway=runway;

}
public void displayDetails(){
System.out.println( name+ ticketPrice+ runway.lane+runway.noOfRunway);

}



}