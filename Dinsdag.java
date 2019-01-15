import java.util.Scanner;
public class Dinsdag{
	public static void main(String [] args)	{
		Scanner piet = new Scanner(System.in);
		int leeftijd = piet.nextInt();
		if(leeftijd < 16){
			System.out.println("Je mag geen alchohol");
		}
		else if(leeftijd < 18){
			System.out.println("Bier of wijn?");
		}
		else{
			System.out.println("Bestel maar wat je wil!");
		}
	}
}