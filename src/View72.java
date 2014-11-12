import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


public class View72 extends JFrame {

	JPanel pan = new JPanel();

	JPanel tf1pan = new JPanel();
	JTextField tf1 = new JTextField("Create Rdm Num", 10);

	JPanel tf2pan = new JPanel();
	JTextField tf2 = new JTextField("Choose num 2", 10);

	JPanel l1pan = new JPanel();
	JLabel l1 = new JLabel(" l1 ");
	
	JPanel pb1pan = new JPanel();
	JProgressBar pb1 = new JProgressBar(0, 99);

	JPanel b1pan = new JPanel();
	JButton b1 = new JButton("Create Rdm Num");
	
	JPanel b2pan = new JPanel();
	JButton b2 = new JButton("Guess the Num ");
	
	JPanel b3pan = new JPanel();
	JButton b3 = new JButton("The Num was ?");

	String printV = "printf";
	Integer valuepb = 0;

	public View72() {
		super("72mvcsimple2");

		this.setSize(700, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pan.setLayout(new GridLayout(2, 4));

		tf1pan.setLayout(new FlowLayout());
		pan.add(tf1pan);
		tf1pan.add(tf1);

		tf2pan.setLayout(new FlowLayout());
		pan.add(tf2pan);
		tf2pan.add(tf2);		

		l1pan.setLayout(new FlowLayout());
		pan.add(l1pan);
		l1pan.add(l1);

		pb1.setValue(0);
		pb1.setString("Progression");
		pb1.setStringPainted(true);

		pb1pan.setLayout(new FlowLayout());
		pan.add(pb1pan);
		pb1pan.add(pb1);

		b1pan.setLayout(new FlowLayout());
		pan.add(b1pan);
		b1pan.add(b1);

		b2pan.setLayout(new FlowLayout());
		pan.add(b2pan);
		b2pan.add(b2);
		
		b3pan.setLayout(new FlowLayout());
		pan.add(b3pan);
		b3pan.add(b3);

		l1.setText(String.format("hello %s", printV));
		//System.out.printf("hello %s", printV);

		this.setContentPane(pan);
		this.setVisible(true);
		
	}
	
	public void setTf1(int num) {
		tf1.setText(Integer.toString(num));
	}
	public int gettf1() {
		return Integer.parseInt(tf1.getText());
	}
	public void generateNumListener(ActionListener NumListener) {
		b1.addActionListener(NumListener);
	}
	public int gettf2() {
		return Integer.parseInt(tf2.getText());
	}
	public void addCompareNumListener(ActionListener CNumListener) {
		b2.addActionListener(CNumListener);
	}
	public void messToUser(String text) {
		l1.setText(text);
	}
	public String getMessToUser() {
		return l1.getText();
	}
	public void showRandNumListener(ActionListener sRandNumListener) {
		b3.addActionListener(sRandNumListener);
	}
}
