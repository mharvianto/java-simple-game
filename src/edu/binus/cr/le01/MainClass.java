package edu.binus.cr.le01;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	
	// access modifier 4
	// private 				-> class itu sendiri
	// package/no modifier	-> class itu sendiri dan sesama package
	// protected 			-> class itu sendiri, sesama package dan anaknya
	// public 				-> class itu sendiri, sesama package, anaknya dan other class
	
	// 3 konsep oop
	// encapsulation 	-> information hiding
	// setter/getter
	
	// inheritance 		-> pewarisan sifat
	
	// polymorphism		-> banyak bentuk
	//	-overloading
	//		nama sama tapi beda parameter(jumlah, tipe data, urutan)
	//	-overriding
	//		nama sama tapi beda class(parent and child)
	
	private Hero player;
	private Hero enemy;
	
	private int input;
	
	public MainClass() {
		//int input;
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("Hero\n" +
				"1. Archer\n" +
				"2. Swordman\n" +
				"Input : ");
		input = in.nextInt();
		switch (input) {
			case 1: player = new Archer(); break;
			case 2: player = new Swordman(); break;
		}
		if(rand.nextBoolean()){
			enemy = new Archer();
		}else{
			enemy = new Swordman();
		}
		do{
			System.out.println("Player: " + player + "\nEnemy: " + enemy);
			input = in.nextInt();
			if(input == 1){
				player.attack(enemy);
			}else if(input == 3){
				if(player instanceof Archer){
					Archer archer = (Archer)player;
					archer.ulti(enemy);
				}
			}else{
				player.skill(enemy);
			}
			if(rand.nextBoolean()){
				enemy.attack(player);
			}else{
				enemy.skill(player);
			}
		}while(player.isLife() && enemy.isLife());
	}

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
	}

}
