class Atc{
public String weather;
public int flightsInAir;
public Runway runway;

public Atc(String weather,int flightsInAir,Runway runway){
this.weather=weather;
this.flightsInAir=flightsInAir;
this.runway=runway;
}
public void atcDisplayDetails(){
System.out.println(weather+flightsInAir+runway.lane+runway.noOfRunway);
}
}