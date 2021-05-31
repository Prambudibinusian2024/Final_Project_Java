package Forms;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import Forms.Menuboba;

public class Insert extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton save = new JButton("save");
	JButton cancel = new JButton("back");
	JTextField textKode = new JTextField();
	JTextField textNama = new JTextField();
	JTextField textHarga = new JTextField();
	JTextField textStok = new JTextField();
	
	JMenuItem exit = new JMenuItem("Exit");
	
	public Insert() 
	{
		MenuBar();
		Frame();
	}
	
	public void MenuBar() 
	{
		JMenuBar menuBar = new JMenuBar();
		JMenu menu1 = new JMenu("Menu");
		menu1.setForeground(Color.blue);
		
		exit.addActionListener(this);
		menu1.add(exit);
		
		menuBar.add(menu1);
		
		setJMenuBar(menuBar);
	}
	
	public void Frame() 
	{
		setTitle("Insert Barang Baru");
		setSize(400, 500);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocation(400, 200);
		setLayout(new GridLayout(0,2));
		setResizable(false);
		setVisible(true);
		
		initComponent();
	}
	
	public void initComponent() {
		JLabel Kode = new JLabel("Kode :");
		add(Kode);
		add(textKode);
		
		JLabel Nama = new JLabel("Nama :");
		add(Nama);
		add(textNama);
		
		JLabel Harga = new JLabel("Harga :");
		add(Harga);
		add(textHarga);
		
		JLabel Stok = new JLabel("Stok :");
		add(Stok);
		add(textStok);
		
		save.addActionListener(this);
		cancel.addActionListener(this);
		add(save);
		add(cancel);
		
		arrlist.add(new arrlist(Kode,Nama,Harga,Stok));
	}

	public boolean validate() 
	{
		if(textKode.getText().isEmpty() || textNama.getText().isEmpty() || textHarga.getText().isEmpty() || textStok.getText().isEmpty())
		{
			return false;
		}
		else 
		{
			return true;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource().equals(save)) {
			if(validate() == false) {
				JOptionPane.showMessageDialog(null, "must be fill all");
			}else {
				Menuboba Menuboba = new Menuboba();
				Menuboba.Insert(textKode.getText(),textNama.getText(), textHarga.getText(),textStok.getText());
				JOptionPane.showMessageDialog(null, "sucess input item");
			}
		}else if(e.getSource().equals(cancel))
		{
			new Menuboba();
			setVisible(false);
		}else if(e.getSource().equals(exit)) 
		{
			System.exit(0);
		}
	}


}
