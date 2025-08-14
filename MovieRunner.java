class MovieRunner{

public static void main(String args[]){


int number = Movie.numberOfTheatres(22000);
char Category = Movie.typeofcertificate('A');
boolean isThere = Movie.isThere(true);
long collection = Movie.collectionofMovie(545678954l);
double budgect = Movie.budgect(150.84563637);
float Rating =Movie.movieRatings(9.5f);
String name= Movie.titleOfMovie("Leo");

System.out.println("number of theatres"+ " "+number);
System.out.println("type of certificate"+" "+Category);
System.out.println("movie is isthere"+" "+isThere);
System.out.println("total collection "+" "+collection);
System.out.println("ratings "+" "+Rating);
System.out.println("movie budgect"+" "+budgect);
System.out.println("movie title"+ " "+name);

}
}