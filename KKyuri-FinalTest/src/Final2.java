//
// ±è±Ô¸® 60185077
//
import javax.swing.*;
import java.awt.*;

public class Final2 extends JFrame {
	Final2(){
		setTitle("Ten Color Buttons Frame"); 
		setSize(700, 600); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 

		Container c=getContentPane(); 
		c.setLayout(new GridLayout(5,2)); 

		for(int i=0; i<10; i++) { 
		Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, 
		Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, 
		Color.GRAY, Color.PINK, Color.LIGHT_GRAY}; 

		JLabel label=new JLabel(i+""); 
		label.setBackground(col[i]); 
		label.setOpaque(true); 
		c.add(label); 
		} 
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Final2();
	}

}
