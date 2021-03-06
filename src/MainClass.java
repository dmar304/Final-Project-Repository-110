//Damien Maricich
//Project 3. Final Project
//Tic Tac Toe Game

/*
 * Work cited:
 * Youtube videos for game logic and help with music file
 * stack overflow and other google for syntax help
 * Delaney Chapman for help with a few problems
 */

//Game and Frame imports 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.*;
import javax.sound.sampled.*;

//log file imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.security.*;


	

public class MainClass extends JFrame implements ActionListener {
	
	
	
	private JFrame window = new JFrame ("Tic Tac Toe");
	
	private JButton button1 = new JButton("");
	private JButton button2 = new JButton("");
	private JButton button3 = new JButton("");
	private JButton button4 = new JButton("");
	private JButton button5 = new JButton("");
	private JButton button6 = new JButton("");
	private JButton button7 = new JButton("");
	private JButton button8 = new JButton("");
	private JButton button9 = new JButton("");
	private JButton button10 = new JButton("Start Over/Play Again?");
	private JButton button11 = new JButton("Exit Game");
/*	private JButton button12 = new JButton("");
	private JButton button13 = new JButton("");
	private JButton button14 = new JButton("");
	private JButton button15 = new JButton("");
	private JButton button16 = new JButton("");
	private JButton button17 = new JButton("");
	private JButton button18 = new JButton("");
	*/
	
	private String letter = "";
	private int count = 0;
	private boolean win = false;
	
	

	  //constructor for main class
	  public MainClass() {	
		//Creates JFrame window
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridLayout (4, 4));
		
		//Make window visible
		window.setVisible(true);
		
		
		//Add buttons to JFrame
		window.add(button1);
		window.add(button2);
		window.add(button3);
		window.add(button4);
		window.add(button5);
		window.add(button6);
		window.add(button7);
		window.add(button8);
		window.add(button9);
		window.add(button10);
		window.add(button11);
	/*	window.add(button12);
		window.add(button13);
		window.add(button14);
		window.add(button15);
		window.add(button16);
		window.add(button17);
		window.add(button18);
		*/
		
		
		//Add action listener to buttons
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button10.addActionListener(new PlayAgain());
		button11.addActionListener(new CloseListener());
	
		
		//Make window visible
		window.setVisible(true);
		
	}


	
	public void actionPerformed(ActionEvent ttt) {
		// TODO Auto-generated method stub
		
		//Rotates turns
		count++;
		//int count[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		//Who's turn it is
		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
			letter = "Carroll";
		} else if (count == 2 || count == 4 || count  == 6 || count == 8 || count == 10) {
			letter = "Tech";
		}
		
		
		//Display X's and O's
		if (ttt.getSource () == button1) {
			button1.setText(letter);
			button1.setEnabled(false);
		} else if (ttt.getSource() == button2) {
			button2.setText(letter);
			button2.setEnabled(false);
		}else if (ttt.getSource() == button3) {
			button3.setText(letter);
			button3.setEnabled(false);
		}else if (ttt.getSource() == button4) {
			button4.setText(letter);
			button4.setEnabled(false);
		}else if (ttt.getSource() == button5) {
			button5.setText(letter);
			button5.setEnabled(false);
		}else if (ttt.getSource() == button6) {
			button6.setText(letter);
			button6.setEnabled(false);
		}else if (ttt.getSource() == button7) {
			button7.setText(letter);
			button7.setEnabled(false);
		}else if (ttt.getSource() == button8) {
			button8.setText(letter);
			button8.setEnabled(false);
		}else if (ttt.getSource() == button9) {
			button9.setText(letter);
			button9.setEnabled(false);
		}
	
		
			//Determining winner
			//horizontal wins
			if (button1.getText() == button2.getText() 
					&& button2.getText() == button3.getText() 
					&& button1.getText() != "") {
				win = true;
			} else if (button4.getText() == button5.getText() 
					&& button5.getText() == button6.getText() 
					&& button4.getText() != "") {
				win = true;
			} else if (button7.getText() == button8.getText() 
					&& button8.getText() == button9.getText() 
					&& button7.getText() != "") {
				win = true;
			} 
			
			//Vertical wins
			else if (button1.getText() == button4.getText() 
					&& button4.getText() == button7.getText() 
					&& button1.getText() != "") {
				win = true;
			} else if (button2.getText() == button5.getText() 
					&& button5.getText() == button8.getText() 
					&& button2.getText() != "") {
				win = true;
			} else if (button3.getText() == button6.getText() 
					&& button6.getText() == button9.getText() 
					&& button3.getText() != "") {
				win = true;
			} 
			
			//Diagonal wins
			else if (button1.getText() == button5.getText() 
					&& button5.getText () == button9.getText() 
					&& button1.getText () != "") {
				win = true;
			} else if (button3.getText() == button5.getText() 
					&& button5.getText () == button7.getText() 
					&& button3.getText () != "") {
				win = true;
			} else {
				win = false;
			}

		
		//Win/loss dialog 
		if (win == true) {
			JOptionPane.showMessageDialog(null, letter + " Wins!");
			
			//insert audio celebration here
			music();
			
			
		}else if (count == 9 && win == false) {
			JOptionPane.showMessageDialog(null,  "Tie Game!");
			
		}
									
	}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new MainClass();
		
	}
*/

/*
public static void Play() {
	
System.out.println("Would you like to play again?");
	
	Scanner input = new Scanner (System.in);
	String answer = input.nextLine();
	
	if (answer == "Yes") {
	 new MainClass();
	}
	if (answer == "No") {
		System.out.println("Thank you for playing!");
		System.exit(0);
	}
	if (answer != "Yes" || answer != "No") {
		System.out.println("That is not an applicable answer. Please Answer 'Yes' or 'No' ");
		Play();	
	}
}
*/

//attempted jingle meant to play when the game has been won
public void music() {
	try {
		File jingle = new File(getName() + "jingle.wav");
		Clip song = AudioSystem.getClip();
		song.open(AudioSystem.getAudioInputStream(jingle));
		song.start();
		Thread.sleep(song.getMicrosecondLength());
	} catch(Exception e) {
		System.err.println(e.getMessage());
	}
} 


public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Scanner scan = new Scanner(System.in);
	
	File outFile = new File("survey.txt");
	FileOutputStream outFileStream;
	
	SecureRandom ran = new SecureRandom();
	
	int num = ran.nextInt(599);
	
	try 
	{
		
		outFileStream = new FileOutputStream(outFile);
		PrintWriter outStream = new PrintWriter(outFileStream);
		
		forLoop();
		
		System.out.println
		(" Greetings, Gamer!\n We would like to conduct a short survey before we begin.\n What is your name?");
		String name = scan.next();
		outStream.println("The name is " +name+ ".");
		
		System.out.println("Hello "+name+"! ");
		System.out.println("How old are you?");
		String age = scan.next();		
		outStream.println("The age is " +age+ ".");
		
		System.out.println(name+", In one word, how would you describe games?");
		String add = scan.next();
		outStream.println("Games are " +add+ ".");
							
		
		System.out.println("Thank You! Please, enjoy the game!");
		
		outStream.close();
		scan.close();
		
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	
	try {Thread.sleep(2000);}
	catch (Exception e){}
	
	
	//Game method
	new MainClass();
	
}

public static void forLoop() {
	
	
	String firstArray[] = {"Hello!","welcome","to","Tic-Tac-Toe!"};
	for (int a = 0; a<firstArray.length; a++) {
		System.out.println(firstArray[a]);
		
		try {Thread.sleep(0700);}
		catch (Exception e){}
		
	}

}
}


