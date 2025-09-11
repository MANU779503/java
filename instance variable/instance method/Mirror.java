class Mirror{
public int mirrorNumber=3;
public String mirrorName="vehicle mirror";
public boolean mirrorIsClear=true;
public char type='B';
public long mirrorLength=57358287266l;
public float mirrorRating=4.32f;
public double height=4.264;

public int MirrorNum(){
	System.out.println("Number of mirror = "+mirrorNumber);
	return mirrorNumber;
}
public String NameOfMirror(){
	System.out.println("Name of mirror = "+mirrorName);
	return mirrorName;
}
public boolean ClearMirror(){
	System.out.println("Cleared mirror = "+mirrorIsClear);
	return mirrorIsClear;
}
public char TypeOfMirror(){
	System.out.println("MirrorType = "+type);
	return type;
}
public long LengthMirror(){
	System.out.println("Length of mirror = "+mirrorLength);
	return mirrorLength;
}
public float RatingMirror(){
	System.out.println("rating of mirror = "+mirrorRating);
	return mirrorRating;
}
public double Height(){
	System.out.println("Height of mirror = "+height);
	return height;
}

}