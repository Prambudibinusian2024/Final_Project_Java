package Forms;

import javax.swing.JLabel;

public class arrlist 
{
	private String Kode;
	JLabel Harga;
	JLabel Nama;
	private JLabel Stock;

	public arrlist(  JLabel Kode ,JLabel Nama, JLabel Harga, JLabel Stok) 
	{
		this.Nama = Nama;
		this.Harga = Harga;
		this.Stock = Stok;
	}

	public String getkode() 
	{
		return Kode;
	}
	
	public JLabel getNama() {
		return Nama;
	}

	public JLabel getHarga() {
		return Harga;
	}

	public JLabel getStock() {
		return Stock;
	}

	public void SetKode(String kode) 
	{
		this.Kode = kode;
	}

	public static void add(arrlist arrlist) {
		// TODO Auto-generated method stub
		
	}
}
