package com.practice;
class Salman{
	int id;
	String name;

Salman(int id,String name){
	this.id=id;
	this.name=name;

}	
void show(){
	System.out.println("i am in super class: .........."+ id+" : "+name);
}
}
class Shabbu extends Salman{

	Shabbu(int id, String name) {
		super(id, name);
		 super.show(); 
	}

	void display() {
		System.out.println("i am in sub Class");
	}
}
public class SuperKeywordUsed {
public static void main(String[] args) {
	Shabbu shabbu = new Shabbu(1, "xyz");
	shabbu.show();
	shabbu.display();
	
	
	
}
}
