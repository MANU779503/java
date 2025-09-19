class IndigoRunner{
public static void main(String[]args){
Runway runway=new Runway("SA",2);
Indigo indigo=new Indigo("SD",3,runway);
Airport airport=new Airport("FD",33.2,runway);
Atc atc=new Atc("RD",32,runway);
indigo.displayDetails();
airport.airportDisplayDetails();
atc.atcDisplayDetails();
}
}