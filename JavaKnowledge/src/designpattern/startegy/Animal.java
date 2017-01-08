package designpattern.startegy;

public class Animal {

	// this is also decoupling
	// this is called composition
	public Flys flyType;
	
	
	public String tryToFly(){
		return flyType.flys();
	}
	
	//now i wana dynamically change the flying behviour
	public void setFlyingAbility(Flys newFlyType){
		flyType =newFlyType;
	}
}
