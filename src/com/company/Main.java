package com.company;

public class Main {

	public static void main(String[] args){
		// flow control	поток
		// branching if/else , switch/case, ? :
		// looping while , do while, for
		int money = 1000000;
		int amount = 10000;
		while(money != 0){
			money -= amount;
			System.err.println(money);
		}


	}
}