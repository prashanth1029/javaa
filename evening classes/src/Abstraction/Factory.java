package Abstraction;

public class Factory {
static  Car getInstance(String s){
if(s.equalsIgnoreCase("audi")){
	return new Audi();
}
else if(s.equalsIgnoreCase("bgt")){
	return new Bgt();
}
else if(s.equalsIgnoreCase("volvo")){
	return new Volvo();
}
else
{
return null;
}
}
}
