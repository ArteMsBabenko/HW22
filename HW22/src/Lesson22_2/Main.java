package Lesson22_2;

public class Main {
	
	public static void main(String[] args) {
		
		Amphibia eat = () -> System.out.println("I want to eat!");
		Amphibia sleep = () -> System.out.println("I want to sleep!");
		Amphibia swim = () -> System.out.println("I want to swim!");
		Amphibia walk = () -> System.out.println("I want to walk!");
		
		eat.do_smt();
		sleep.do_smt();
		swim.do_smt();
		walk.do_smt();
		
	}

}
