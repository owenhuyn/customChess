
import javax.swing.*;
public class Game {
	
	static String Board[][] = {
		{"r","k","b","q","a","b","k","r"},
		{"p","p","p","p","p","p","p","p"},
		{" "," "," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},
		{" "," "," "," "," "," "," "," "},
		{"P","P","P","P","P","P","P","P"},
		{"R","K","B","Q","A","B","K","R"}
	};
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess Game");
		//when clicking the button, it will close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserInterface ui = new UserInterface();
		frame.add(ui);
		frame.setSize(800,800);
		frame.setVisible(true);
	}
	
	
	
}
