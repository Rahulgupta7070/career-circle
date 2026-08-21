package Inheritance;

public class Vehicle {
		String company;
		int hp;
		Vehicle(){
			
		}
		Vehicle(String company,int hp){
			this.company=company;
			this.hp=hp;
		}
		//@Override
		public void start() {
			System.out.println("Start Vehicle");
		 }
        public String getDetails() {
        	return "Company is "+company+"\nHP is "+hp;
        }
	}


