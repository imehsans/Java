package com.asif.sessional.lab;

import java.util.Scanner;

public class Team {
	
	public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			String Name;
			int Age,Height,weight;
			float GoalAvg;
			FPlayer ob;
			System.out.print("Enter your Name: ");
			Name = s.nextLine();
			System.out.print("Enter your Age: ");
			Age = s.nextInt();
			System.out.print("Enter your Height: ");
			Height = s.nextInt();
			System.out.print("Enter your Weight: ");
			weight = s.nextInt();
			System.out.print("Enter your Goal Average: ");
			GoalAvg = s.nextFloat();
			
			if(GoalAvg > 0.2 && GoalAvg < 0.3){
			    ob = new FPlayer(new StrategyOne());
			    ob.AddToTeam(Name, Age, Height, weight, GoalAvg);
			    System.out.println(ob.toString());
			}
			else if(GoalAvg > 0.3 && GoalAvg < 0.5){
			    ob = new FPlayer(new StrategyTwo());
			    ob.AddToTeam(Name, Age, Height, weight, GoalAvg);
			    System.out.println(ob.toString());
			}
			else if(GoalAvg > 0.5){
			    ob = new FPlayer(new StrategyThree());
			    ob.AddToTeam(Name, Age, Height, weight, GoalAvg);
			    ob.toString();
			}
		}
    }
    
}