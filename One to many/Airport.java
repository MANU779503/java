class Airport{
public String airportName;
public double airportDistance;
public Runway runway;

public Airport(String airportName,double airportDistance,Runway runway){
this.airportName=airportName;
this.airportDistance=airportDistance;
this.runway=runway;
}
public void airportDisplayDetails(){
System.out.println(airportName+airportDistance+runway.lane+runway.noOfRunway);
}
}