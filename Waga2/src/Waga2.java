import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Astro
 *
 */
public class Waga2 extends JFrame implements ActionListener
{
	JButton bpodajwzrost, bpodajwage, boblicz;
	JLabel lpodajwzrost, lpodajwage, lobliczone;
	JTextField tpodajwzrost, tpodajwage;
	double zmiennawzrost, zmiennawaga, zmiennawynik;
	
	public Waga2()
	{
	setSize(600,800);
	setTitle("Wagownik");
	setLayout(null);
	
	Font font1 = new Font("SansSerif", Font.BOLD, 50);
	
	bpodajwzrost = new JButton("Podaj Twój wzrost");
	bpodajwzrost.setBounds(100, 100, 150, 50);
	add(bpodajwzrost);
	bpodajwzrost.addActionListener(this);
	
	bpodajwage = new JButton("Podaj Twoją wagę");
	bpodajwage.setBounds(100, 200, 150, 50);
	add(bpodajwage);
	bpodajwage.addActionListener(this);
	
	boblicz = new JButton("OBLICZ");
	boblicz.setBounds(100, 300, 150, 50);
	add(boblicz);
	boblicz.addActionListener(this);
	
	tpodajwzrost = new JTextField ("");
	tpodajwzrost.setBounds(300, 100, 150, 50);
	tpodajwzrost.setFont(font1);
	add(tpodajwzrost);
	tpodajwzrost.addActionListener(this);
	
	tpodajwage = new JTextField("");
	tpodajwage.setBounds(300, 200, 150, 50);
	tpodajwage.setFont(font1);
	add(tpodajwage);
	tpodajwage.addActionListener(this);
	//
	//*
	lobliczone = new JLabel("Wynik = ");
	lobliczone.setBounds(300,300,150,50);
	add(lobliczone);
	
	
	}
	
	
	public static void main(String[] args) 
	{
		Waga2 GlowneOkno = new Waga2();
		GlowneOkno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GlowneOkno.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		//double = zmiennawzrost;
		zmiennawzrost = Double.parseDouble(tpodajwzrost.getText());
		
		zmiennawaga = Double.parseDouble(tpodajwage.getText());
		zmiennawynik = (zmiennawaga / Math.pow(zmiennawzrost, 2)) ; // BMI = masa ciała (kg) / wzrost (m)²
		// zmiennawaga = zmiennawzrost /(zmiennawaga * zmiennawaga)

		lobliczone.setText(String.valueOf("Wynik = " + zmiennawynik));
		
		
		
		
	}


	private double pow(double zmiennawzrost2, double zmiennawzrost3) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
