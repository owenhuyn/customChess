import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class UserInterface extends JPanel implements MouseListener, MouseMotionListener {
	public void paintComponent(Graphics graphicalInter) {
		graphicalInter.setColor(Color.GRAY);
		graphicalInter.fillRect(200, 200, 50, 50);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	@Override
	public void mouseMoved(MouseEvent e){
		
	}
	@Override
	public void mousePressed(MouseEvent e){
		
	}
	@Override
	public void mouseReleased(MouseEvent e){
		
	}
	public void mouseClicked(MouseEvent e){
		
	}
	public void mouseDragged(MouseEvent e){
		
	}
	public void mouseEntered(MouseEvent e){
		
	}
	public void mouseExited(MouseEvent e){
		
	}
}
