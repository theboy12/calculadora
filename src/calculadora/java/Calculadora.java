package calculadora.java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	int layers[] = {0,0,0};
	int campOne;
	int campTwo;
	int equal;
	int reserveCamp;
	int operationType = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel numberCamp = new JLabel("0");
		numberCamp.setFont(new Font("Tahoma", Font.PLAIN, 28));
		numberCamp.setBounds(20, 35, 273, 51);
		contentPane.add(numberCamp);
		
		JLabel reserveNumber = new JLabel("");
		reserveNumber.setForeground(Color.BLACK);
		reserveNumber.setFont(new Font("Simplified Arabic", Font.BOLD, 15));
		reserveNumber.setBounds(20, 11, 205, 28);
		contentPane.add(reserveNumber);
		
		

		JButton apagar = new JButton("C");
		apagar.addActionListener(ev ->{
			numberCamp.setText("0");
		});
		
		apagar.setBounds(20, 97, 137, 51);
		contentPane.add(apagar);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnOne.addActionListener(ev->{
			int numberOne = Integer.parseInt(numberCamp.getText() + 1);
			numberCamp.setText(""+ numberOne);		
		
		});
		
		btnOne.setBounds(20, 159, 39, 34);
		contentPane.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnTwo.setBounds(69, 159, 39, 34);
		contentPane.add(btnTwo);
		btnTwo.addActionListener(ev->{
			int numberTwo = Integer.parseInt(numberCamp.getText() + 2);
			numberCamp.setText(""+numberTwo);
		});
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnThree.setBounds(118, 159, 39, 34);
		contentPane.add(btnThree);
		btnThree.addActionListener(ev->{
			int numberThree = Integer.parseInt(numberCamp.getText() + 3);
			numberCamp.setText(""+numberThree);
		});
		
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnFour.setBounds(20, 204, 39, 34);
		contentPane.add(btnFour);
		btnFour.addActionListener(ev->{
			int numberFour = Integer.parseInt(numberCamp.getText() + 4);
			numberCamp.setText(""+numberFour);
		});
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnFive.setBounds(69, 204, 39, 34);
		contentPane.add(btnFive);
		btnFive.addActionListener(ev->{
			int numberFive = Integer.parseInt(numberCamp.getText() + 5);
			numberCamp.setText(""+numberFive);
		});
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSix.setBounds(118, 204, 39, 34);
		contentPane.add(btnSix);
		btnSix.addActionListener(ev->{
			int numberSix = Integer.parseInt(numberCamp.getText() + 6);
			numberCamp.setText(""+numberSix);
		});
		
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSeven.setBounds(20, 249, 39, 34);
		contentPane.add(btnSeven);
		btnSeven.addActionListener(ev->{
			int numberSeven = Integer.parseInt(numberCamp.getText() + 7);
			numberCamp.setText(""+numberSeven);
		});
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnEight.setBounds(69, 249, 39, 34);
		contentPane.add(btnEight);
		btnEight.addActionListener(ev->{
			int numberEight = Integer.parseInt(numberCamp.getText() + 8);
			numberCamp.setText(""+numberEight);
		});
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNine.setBounds(118, 249, 39, 34);
		contentPane.add(btnNine);
		btnNine.addActionListener(ev->{
			int numberNine = Integer.parseInt(numberCamp.getText() + 9);
			numberCamp.setText(""+numberNine);
		});
		
		JButton btnZero = new JButton("0");
		btnZero.setBounds(20, 294, 137, 34);
		contentPane.add(btnZero);
		btnZero.addActionListener(ev->{
			int numberZero = Integer.parseInt(numberCamp.getText() + 0);
			numberCamp.setText(""+numberZero);
		});
		
		JButton btnEqual = new JButton("=");
		btnEqual.setBounds(167, 294, 126, 34);
		contentPane.add(btnEqual);
		btnEqual.addActionListener(ev->{
			
      //-------------- Operacao de adicao --------------//
			if(operationType == 1) {
				
				if(layers[2] > 0) 
				{
					equal = Integer.parseInt(numberCamp.getText());
					layers[2] = equal;
					layers[2] = layers[1] + layers[2];
					numberCamp.setText(""+layers[2]);
				}
				
				else
				{
				campTwo = Integer.parseInt(numberCamp.getText());
				layers[1] = campTwo;
				layers[2] = layers[0] + layers[1];
				layers[0] = 0;
				reserveNumber.setText("");
				numberCamp.setText(""+layers[2]);
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				}	
					
			}
		//-------------- Operacao de subtracao --------------//
			else if (operationType == 2) {
				
				if(layers[2] > 0) 
				{
					equal = Integer.parseInt(numberCamp.getText());
					layers[2] = equal;
					layers[2] = layers[2] - layers[1];
					numberCamp.setText(""+layers[2]);
				}
				else if(layers[2] < 0) 
				{
					equal = Integer.parseInt(numberCamp.getText());
					layers[2] = equal;
					layers[2] = layers[1] - layers[2];
					numberCamp.setText("-"+layers[2]);
				}
				else
				{
					campTwo = Integer.parseInt(numberCamp.getText());
					layers[1] = campTwo;
					layers[2] = layers[0] - layers[1];
					layers[0] = 0;
					reserveNumber.setText("");
					numberCamp.setText(""+layers[2]);
					System.out.println("\n---------------------------------");
					System.out.println(layers[0]);
					System.out.println(layers[1]);
					System.out.println(layers[2]);
					System.out.println("\n"+operationType);
					System.out.println("---------------------------------\n");
				}
			}
			
		//--------------Operacao de multiplicacao---------------//
			else if (operationType == 3) {
				
				if(layers[2] > 0) 
				{
					equal = Integer.parseInt(numberCamp.getText());
					layers[2] = equal;
					layers[2] = layers[1] * layers[2];
					numberCamp.setText(""+layers[2]);
				}
				
				else
				{
					campTwo = Integer.parseInt(numberCamp.getText());
					layers[1] = campTwo;
					layers[2] = layers[0] * layers[1];
					layers[0] = 0;
					reserveNumber.setText("");
					numberCamp.setText(""+layers[2]);
					System.out.println("\n---------------------------------");
					System.out.println(layers[0]);
					System.out.println(layers[1]);
					System.out.println(layers[2]);
					System.out.println("\n"+operationType);
					System.out.println("---------------------------------\n");
				}
			}
			
		//---------------Operacao de divisao--------------------//
			else if (operationType == 4) {
				
				if(layers[2] > 0) 
				{
					equal = Integer.parseInt(numberCamp.getText());
					layers[2] = equal;
					layers[2] = layers[2] / layers[1];
					numberCamp.setText(""+layers[2]);
				}
				
				else
				{
					campTwo = Integer.parseInt(numberCamp.getText());
					layers[1] = campTwo;
					layers[2] = layers[0] / layers[1];
					layers[0] = 0;
					reserveNumber.setText("");
					numberCamp.setText(""+layers[2]);
					System.out.println("\n---------------------------------");
					System.out.println(layers[0]);
					System.out.println(layers[1]);
					System.out.println(layers[2]);
					System.out.println("\n"+operationType);
					System.out.println("---------------------------------\n");
				}
			}
		});
		
		
		
		
		
		
		//------------funcoes dos botoes de operacao--------------------//
		JButton btnPlus = new JButton("+");
		btnPlus.setBounds(235, 221, 58, 62);
		contentPane.add(btnPlus);
		btnPlus.addActionListener(ev->{
				
				layers[2] = 0;
				
				operationType = 1;
				
					if(layers[0] == 0) {
						campOne = Integer.parseInt(numberCamp.getText());
						layers[0] = campOne;
						System.out.println("\n---------------------------------");
						System.out.println(layers[0]);
						System.out.println(layers[1]);
						System.out.println(layers[2]);
						System.out.println("\n"+operationType);
						System.out.println("---------------------------------\n");
						reserveCamp = Integer.parseInt(reserveNumber.getText() + layers[0]);
						reserveNumber.setText(""+reserveCamp);
						numberCamp.setText("0");
						}
					
					else{
						
						campTwo = Integer.parseInt(numberCamp.getText());
						layers[1] = campTwo;
						System.out.println("\n---------------------------------");
						System.out.println(layers[0]);
						System.out.println(layers[1]);
						System.out.println(layers[2]);
						System.out.println("\n"+operationType);
						System.out.println("---------------------------------\n");
						layers[0] = layers[0] + layers[1];
						reserveNumber.setText(""+layers[0]);
						
					}
		});
		
		JButton btnMinus = new JButton("-");
		btnMinus.setBounds(235, 159, 58, 51);
		contentPane.add(btnMinus);
		btnMinus.addActionListener(ev ->{
			
			layers[2] = 0;
			
			operationType = 2;
			
			if(layers[0] == 0) {
				campOne = Integer.parseInt(numberCamp.getText());
				layers[0] = campOne;
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				reserveCamp = Integer.parseInt(reserveNumber.getText() + layers[0]);
				reserveNumber.setText(""+reserveCamp);
				numberCamp.setText("0");
				}
			
			else{
				
				campTwo = Integer.parseInt(numberCamp.getText());
				layers[1] = campTwo;
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				layers[0] = layers[0] - layers[1];
				reserveNumber.setText(""+layers[0]);
				
			}
			
		});
		
		JButton btnX = new JButton("X");
		btnX.setBounds(167, 159, 58, 51);
		contentPane.add(btnX);
		btnX.addActionListener(ev->{

			layers[2] = 0;
			
			operationType = 3;
			
			if(layers[0] == 0) {
				campOne = Integer.parseInt(numberCamp.getText());
				layers[0] = campOne;
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				reserveCamp = Integer.parseInt(reserveNumber.getText() + layers[0]);
				reserveNumber.setText(""+reserveCamp);
				numberCamp.setText("0");
				}
			
			else{
				
				campTwo = Integer.parseInt(numberCamp.getText());
				layers[1] = campTwo;
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				layers[0] = layers[0] * layers[1];
				reserveNumber.setText(""+layers[0]);
				
			}
			
		});
		
		JButton btnDivision = new JButton("/");
		btnDivision.setBounds(167, 221, 60, 62);
		contentPane.add(btnDivision);
		btnDivision.addActionListener(ev->{
			layers[2] = 0;
			
			operationType = 4;
			
			if(layers[0] == 0) {
				campOne = Integer.parseInt(numberCamp.getText());
				layers[0] = campOne;
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				reserveCamp = Integer.parseInt(reserveNumber.getText() + layers[0]);
				reserveNumber.setText(""+reserveCamp);
				numberCamp.setText("0");
				}
			
			else{
				
				campTwo = Integer.parseInt(numberCamp.getText());
				layers[1] = campTwo;
				System.out.println("\n---------------------------------");
				System.out.println(layers[0]);
				System.out.println(layers[1]);
				System.out.println(layers[2]);
				System.out.println("\n"+operationType);
				System.out.println("---------------------------------\n");
				layers[0] = layers[0] / layers[1];
				reserveNumber.setText(""+layers[0]);
				
			}
		});
		
		JButton apagarTudo = new JButton("CE");
		apagarTudo.setBounds(167, 97, 126, 51);
		contentPane.add(apagarTudo);
		apagarTudo.addActionListener(ev->{
			numberCamp.setText("0");
			reserveNumber.setText("");
			layers[0] = 0;
			layers[1] = 0;
			layers[2] = 0;
			operationType = 0;
		});


		
		
	}
}
