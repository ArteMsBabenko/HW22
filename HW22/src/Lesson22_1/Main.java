package Lesson22_1;

public class Main {
	
	public static void main(String[] args) {
		
		Pet cow = () -> "Myyy... I'm a cow";
		Pet cat = () -> "Meow... I am a cat";
		Pet dog = () -> "Woof-woof... I am a dog";

		voice(cow.voice(), "Milca");
		voice(cat.voice(), "Poof");
		voice(dog.voice(), "black");
	}

	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}

}
