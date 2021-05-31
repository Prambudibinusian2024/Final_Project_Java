package Forms;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class main extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1 = new JButton("Insert");
	JButton button2 = new JButton("View");
	JButton button3 = new JButton("Update");
	JButton button4 = new JButton("Delete");
	JButton exitButton = new JButton("Exit");
	
	public main() 
	{
		initFrame();
	}
	
	public void initFrame() 
	{
		setTitle("BOBACOOL");
		setSize(500, 500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocation(400, 200);
		setLayout(new BorderLayout());
		setResizable(false);
		setVisible(true);
		
		text();
		menu();
		button();
	}
	
	public void text() {
		JLabel text = new JLabel("BOBACOOL");
		text.setHorizontalAlignment(JLabel.CENTER);
		text.setFont(new Font(null, Font.BOLD, 20));
		
		add(text, BorderLayout.NORTH);
	}
	
	public void menu() 
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,2));
		
		button1.setBackground(Color.black);
		button1.setForeground(Color.white);
		button1.addActionListener(this);
		button2.setBackground(Color.white);
		button2.setForeground(Color.black);
		button2.addActionListener(this);
		button3.setBackground(Color.white);
		button3.setForeground(Color.black);
		button3.addActionListener(this);
		button4.setBackground(Color.black);
		button4.setForeground(Color.white);
		button4.addActionListener(this);
		
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
	
		add(panel);
	}
	
	public void button() 
	{
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
	
		exitButton.setBackground(Color.red);
		exitButton.setForeground(Color.white);
		exitButton.addActionListener(this);
		
		panel.add(exitButton);
		
		add(panel, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(exitButton)) 
		{
			System.exit(0);
		}else if(e.getSource().equals(button1)) 
		{
			new Insert();
			setVisible(false);
		}
//		else if(e.getSource().equals(button2)) 
//		{
//			new View();
//			setVisible(false);
//		}
//		else if(e.getSource().equals(button3)) 
//		{
//			new Update();
//			setVisible(false);
//		}
//		else if(e.getSource().equals(button4)) 
//		{
//			new Delete();
//			setVisible(false);
//		}
		
	}

}
