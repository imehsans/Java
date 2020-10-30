package com.asif.sessional.lab;

public class StrategyTwo implements PaymentStrategy {
	public void AddMember(String Name,int Age,int Height,int Weight,float GoalAvg){
        System.out.println(Name+" with Goal Average "+GoalAvg+" is Added to Team");
    }

	@Override
	public String toString() {
		return "StrategyTwo [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
	
