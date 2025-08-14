class CricketRunner{

public static void main(String args[]){


int number = Cricket.numberOfPlayers(22);
char Category = Cricket.matchType('T');
boolean matchisThere = Cricket.isThere(true);
long attendance = Cricket.attendanceOfPeoples(245678954l);
double views = Cricket.views(58.8);
float Rating =Cricket.matchRatings(9.6f);
String name= Cricket.nameOfStadium("wankede, mumbai");

System.out.println("number of players"+ " "+number);
System.out.println("type of match"+" "+Category);
System.out.println("match is there"+" "+matchisThere);
System.out.println("total attendance "+" "+attendance);
System.out.println("ratings "+" "+Rating);
System.out.println("views in jio cinema"+" "+views);
System.out.println("statidum name"+ " "+name);

}
}