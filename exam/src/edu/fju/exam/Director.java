package edu.fju.exam;

public class Director extends Manager{
	String name;
	int money;
	int add =5000;
	int bonus;
	public Director(String name,int money,int bonus){
		super(name,money);
		this.bonus =bonus;
		this.money =money;
		this.name=name;
	}
	@Override
	public void print(){
		System.out.println(name+"\t"+(money+add)+"("+bonus+")");
	}
}
