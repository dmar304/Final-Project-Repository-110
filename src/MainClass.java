//Damien Maricich
//Project 3. Final Project
//Tic Tac Toe Game

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;

	

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
	private String letter = "";
	private int count = 0;
	private boolean win = false;
	
	

		
	  public MainClass() {	
		//Creates JFrame window
		window.setSize(300, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridLayout (3, 3));
		
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
		
		//Make window visible
		window.setVisible(true);
		
	}


	
	public void actionPerformed(ActionEvent ttt) {
		// TODO Auto-generated method stub
		
		//Rotates turns
		count++;
		
		//Who's turn it is
		if (count == 1 || count == 3 || count == 5 || count == 7 || count == 9) {
			letter = "X";
		} else if (count == 2 || count == 4 || count  == 6 || count == 8 || count == 10) {
			letter = "O";
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
		}else if (count == 9 && win == false) {
			JOptionPane.showMessageDialog(null,  "Tie Game!");
		}
		
	}
	
/*	public String playAgain() {
		
		JFrame question = new JFrame();
		
		String answer = JOptionPane.showInputDialog(question, "Play again?");
		System.out.printf("Okay!");
		//Scanner question = new Scanner(System.in);
		//String answer = ;
		return(answer);
	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
		Play();
	}



public static void Play() {
	
System.out.println("Would you like to play again?");
	
	Scanner input = new Scanner (System.in);
	String answer = input.nextLine();
	
	if (answer == "Yes") {
	 new MainClass();
	}
	else if (answer == "No") {
		System.out.println("Thank you for playing!");
		System.exit(0);
	}
	else if (answer != "Yes" || answer != "No") {
		System.out.println("That is not an applicable answer. Please Answer 'Yes' or 'No' ");
		Play();	
	}
}

}


	






