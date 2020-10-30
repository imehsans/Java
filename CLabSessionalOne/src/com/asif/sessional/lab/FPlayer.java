package com.asif.sessional.lab;



public class FPlayer {
	
	private final PaymentStrategy paystra;
    String Teams[] = new String[16];
    int TeamSalary[] = new int[16];
    public FPlayer(PaymentStrategy ob){
        paystra = ob;
    }
    
    public void AddToTeam(String Name,int Age,int Height,int Weight,float GoalAvg){
    
    	paystra.AddMember(Name,Age,Height,Weight,GoalAvg);
    
    }
	
}