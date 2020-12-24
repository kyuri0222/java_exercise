//60185077 ±è±Ô¸®
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class hw10 extends JFrame {
	private JLabel la = new JLabel("Press & Drag Mouse!");
	JPanel contentPane = new JPanel();
	
	public hw10() {
		setTitle("µå·¡±ëµ¿¾È YELLO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setLayout(null);
		
		contentPane.addMouseMotionListener(new MyMouseListener());
        contentPane.setBackground(Color.green);
        
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		la.setLocation(50,50);
		la.setSize(200,20);

		c.add(la);
		
		setSize(300,200);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener,MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed ("+e.getX()+", "+e.getY ()+")");
			la.setLocation(e.getX(),e.getY ());
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("MouseReleased("+e.getX()+", "+e.getY()+")");
			la.setLocation(e.getX(),e.getY ());
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseDragged(MouseEvent e) {
			la.setText("MouseDragged ("+e.getX()+","+e.getY()+")");
			contentPane = (JPanel)e.getSource();
            contentPane.setBackground(Color.yellow);
			la.setLocation(e.getX(),e.getY ());
		}
		public void mouseMoved(MouseEvent e) {
            contentPane = (JPanel)e.getSource();
            contentPane.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args) { new hw10(); }
}