import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;


public class Interfaz {

    public static void main(String[] args) {
    	
    	//Comienza la calculadora

        JFrame frame = new JFrame("Calculadora");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\5TO 2DA\\LPOO\\07-08-2023 LOGO Calculadora\\346399.png"));
        frame.setBounds(600, 250, 270, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // deshabilita el boton de maximizar 
        frame.getContentPane().setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(panel, BorderLayout.PAGE_START);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(panel_1, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("Calculadora");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        panel.add(lblNewLabel);

        JButton Sistemas = new JButton("Sistemas");
        Sistemas.setForeground(new Color(255, 255, 255));
        Sistemas.setBackground(new Color(237,152,32));
        Sistemas.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));

        
        Sistemas.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.removeAll();
        		frame.setVisible(false);
        		
        		funcion_sistemas();
        		
        	}
        });
        Sistemas.setBounds(85, 125, 91, 23);
       
        JButton Matriz = new JButton("Matrices");
        Matriz.setForeground(new Color(255, 255, 255));
        Matriz.setBackground(new Color(237,152,32));
        Matriz.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        Matriz.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		funcion_matriz();
        	}
        });
        Matriz.setBounds(85, 60, 91, 23);

        JButton Vectores = new JButton("Vectores");
        Vectores.setForeground(new Color(255, 255, 255));
        Vectores.setBackground(new Color(237,152,32));
        Vectores.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        Vectores.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		funcion_vectores();
        	}
        });
        Vectores.setBounds(85, 91, 91, 23);

        JButton Enteros = new JButton("Enteros");
        Enteros.setForeground(new Color(255, 255, 255));
        Enteros.setBackground(new Color(237,152,32));
        Enteros.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        Enteros.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		funcion_enteros();
        	}
        });
        Enteros.setBounds(85, 28, 91, 23);
        
        
        panel_1.setLayout(null);
        panel_1.add(Enteros);
        panel_1.add(Sistemas);
        panel_1.add(Vectores);
        panel_1.add(Matriz);

        frame.setVisible(true);
    }
    
    
	
    	
    	private static double resultado1;
    	private static int num1;
    	private static JLabel resultadoLabel;
    	private static JLabel resultadoLabel2;
    	private static double num1d;
    	private static JTextField textField;
    	
    	private static void funcion_enteros() {
    		
    	JFrame frame = new JFrame("Calculadora");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\5TO 2DA\\LPOO\\07-08-2023 LOGO Calculadora\\346399.png"));
    	frame.setBounds(550, 250, 300, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

        JPanel panel = new JPanel();
        
        panel.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Calculadora");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(118, 11, 73, 14);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Numero");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setBounds(61, 52, 47, 14);
        panel.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setBounds(118, 49, 73, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        JOptionPane.showMessageDialog(frame, "Si quiere ingresar una Potencia o Raíz, escriba el numero y luego se habilitará el Exponente/Indice");
        
        JButton btnNewButton_back = new JButton("Back");
        btnNewButton_back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		frame.removeAll();
        		frame.setVisible(false);
        		Interfaz.main(null);;
        	}
        });
        btnNewButton_back.setBounds(10, 7, 70, 15);
        panel.add(btnNewButton_back);
        
        JButton btnNewButton = new JButton("+");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(237,152,32));
        btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Color blanco = new Color(255, 255, 255);
        		
        		num1 = Integer.parseInt(textField.getText());
        		
        		resultadoLabel2.setText("+"+num1);
        		resultadoLabel2.setForeground(blanco);
        		resultado1+=num1;
        		
        		resultadoLabel.setText("Resultado: " + resultado1);
        		resultadoLabel.setForeground(blanco);
        	} 
        });
        btnNewButton.setBounds(33, 106, 89, 23);
        panel.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("-");
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(237,152,32));
        btnNewButton_1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Color blanco = new Color(255, 255, 255);
        		
        		num1 = Integer.parseInt(textField.getText());
        		
        		resultadoLabel2.setText("-"+num1);
        		resultadoLabel2.setForeground(blanco);
        		resultado1-=num1;
        		
        		resultadoLabel.setText("Resultado: " + resultado1);
        		resultadoLabel.setForeground(blanco);
        	}
        });
        btnNewButton_1.setBounds(163, 106, 89, 23);
        panel.add(btnNewButton_1);
        
        JButton btnNewButton_2 = new JButton("x");
        btnNewButton_2.setForeground(new Color(255, 255, 255));
        btnNewButton_2.setBackground(new Color(237,152,32));
        btnNewButton_2.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Color blanco = new Color(255, 255, 255);
        		
        		num1 = Integer.parseInt(textField.getText());
        		
        		resultadoLabel2.setText("x"+num1);
        		resultadoLabel2.setForeground(blanco);
        		
        		resultado1=resultado1*num1;
        		
        		resultadoLabel.setText("Resultado: " + resultado1);
        		resultadoLabel.setForeground(blanco);
        	}
        });
        btnNewButton_2.setBounds(33, 152, 89, 23);
        panel.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("/");
        btnNewButton_3.setForeground(new Color(255, 255, 255));
        btnNewButton_3.setBackground(new Color(237,152,32));
        btnNewButton_3.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Color blanco = new Color(255, 255, 255);
        		
				num1 = Integer.parseInt(textField.getText());
				
				resultadoLabel2.setText("/"+num1);
				resultadoLabel2.setForeground(blanco);
				
				resultado1=resultado1/num1;
        		
        		resultadoLabel.setText("Resultado: " + resultado1);
        		resultadoLabel.setForeground(blanco);
        	}
        });
        btnNewButton_3.setBounds(163, 152, 89, 23);
        panel.add(btnNewButton_3);
        
        JButton btnNewButton_4 = new JButton("Potencia");
        btnNewButton_4.setForeground(new Color(255, 255, 255));
        btnNewButton_4.setBackground(new Color(237,152,32));
        btnNewButton_4.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Color blanco = new Color(255, 255, 255);
            	
                num1 = Integer.parseInt(textField.getText());
                
                String input1 = JOptionPane.showInputDialog(frame, "Ingrese el exponente");
        		int exponente = Integer.parseInt(input1);

                resultadoLabel2.setText(num1+"^" + exponente);
                resultadoLabel2.setForeground(blanco);
                
                resultado1 = (float) Math.pow(num1, exponente);

                resultadoLabel.setText("Resultado: " + resultado1);
                resultadoLabel.setForeground(blanco);
            }
        });

        btnNewButton_4.setBounds(33, 197, 89, 23);
        panel.add(btnNewButton_4);
        
        JButton btnNewButton_1_1 = new JButton("raiz");
        btnNewButton_1_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1_1.setBackground(new Color(237,152,32));
        btnNewButton_1_1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Color blanco = new Color(255, 255, 255);
        		
        		num1d = Integer.parseInt(textField.getText());
        		
        		String input1 = JOptionPane.showInputDialog(frame, "Ingrese el Indice");
        		int exponente = Integer.parseInt(input1);
        		
                resultadoLabel2.setText(exponente+"\u221A" + num1d);
                resultadoLabel2.setForeground(blanco);
                
                resultado1 =  Math.pow(num1d, 1.0/exponente);

                resultadoLabel.setText("Resultado: " + resultado1);
                resultadoLabel.setForeground(blanco);
        	}
        });
        
        btnNewButton_1_1.setBounds(163, 197, 89, 23);
        panel.add(btnNewButton_1_1);
        
        resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(33, 234, 219, 25);
        panel.add(resultadoLabel);
        
        resultadoLabel2 = new JLabel("");
        resultadoLabel2.setBounds(33, 254, 219, 25);
        panel.add(resultadoLabel2);
        
        JButton btnNewButton_5 = new JButton("Reset");
        btnNewButton_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		resultado1=0;
        		num1=0;
        		resultadoLabel2.setText("");
        		textField.setText(null);
        		
                resultadoLabel.setText("");
                
        	}
        });
        btnNewButton_5.setBounds(204, 8, 70, 20);
        panel.add(btnNewButton_5);
        
        frame.setVisible(true);
    	}
    	
    	private static JLabel label1;
    	private static JLabel label2;
    	private static JLabel label3;
    	private static JLabel label4;
    	private static JLabel label5;
    	private static JLabel label6;
    	
    	
    	private static JTextField textField_1;
    	private static JTextField textField_2;
    	private static JTextField textField_3;
    	private static JTextField textField_4;
    	private static JTextField textField_5;
    	private static JTextField textField_6;
        private static JTextField textField_7;
        private static JTextField textField_8;

    	private static JButton calcular;
    	private static JButton calcular2;
    	private static JButton calcular3;
    	private static JButton calcular4;
    	private static JButton calcular5;
    	
        private static JLabel resultadoLabel3;
        
        private static JLabel lblNewLabel_1;
        private static JLabel lblNewLabel_2;
        private static JLabel lblNewLabel_3;
        private static JLabel lblNewLabel_4;
        private static JTextField textField_9;
    	
    	private static void funcion_vectores() {
    			 	
    	JFrame frame = new JFrame("Calculadora");
         frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\5TO 2DA\\LPOO\\07-08-2023 LOGO Calculadora\\346399.png"));
         frame.setBounds(600, 250, 270, 200);
   	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	     frame.setResizable(false);
   	     frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

   	     JPanel panel = new JPanel();
   	     panel.setBackground(new Color(0, 0, 0));
   	     panel.setForeground(new Color(255, 128, 255));
   	     frame.getContentPane().add(panel);
   	     panel.setLayout(null);

   	     JLabel lblNewLabel = new JLabel("Calculadora");
   	     lblNewLabel.setForeground(new Color(255, 255, 255));
   	     lblNewLabel.setBounds(93, 11, 73, 14);
   	     panel.add(lblNewLabel);
   	     
	   	  JButton btnNewButton_back = new JButton("Back");
	      btnNewButton_back.addActionListener(new ActionListener() {
	      	public void actionPerformed(ActionEvent e) {
	      		
	      		frame.removeAll();
	      		frame.setVisible(false);
	      		Interfaz.main(null);;
	      	}
	      });
	      btnNewButton_back.setBounds(10, 7, 70, 15);
	      panel.add(btnNewButton_back);
   	     
   	     JButton btnNewButton = new JButton("Suma");
   	     btnNewButton.addActionListener(new ActionListener() {
   	     	public void actionPerformed(ActionEvent e) {
   	     		
   	     		resultadoLabel.setText("");
      	    		resultadoLabel2.setText("");
      	    		resultadoLabel3.setText("");
      	    		
      	    		textField.setText(null);
      	    		textField_1.setText(null);
      	    		textField_2.setText(null);
      	    		textField_3.setText(null);
      	    		textField_4.setText(null);
      	    		textField_5.setText(null);
   	     		
   	     		label1.setVisible(false);
   	     		label2.setVisible(false);
   	     		label3.setVisible(false);
   	     		label4.setVisible(false);
   	     		label5.setVisible(false);
   	     		label6.setVisible(false);
   	     		
   	     		lblNewLabel_1.setVisible(false);
   		   	    lblNewLabel_2.setVisible(false);
   		   	    lblNewLabel_3.setVisible(false);
   	   	     
   	     		textField.setVisible(false);
   	     		textField_1.setVisible(false);
   	     		textField_2.setVisible(false);
   	     		textField_3.setVisible(false);
   	     		textField_4.setVisible(false);
   	     		textField_5.setVisible(false);
   	     		
   	     		textField_6.setVisible(false);
   	     		textField_7.setVisible(false);
   	     		textField_8.setVisible(false);
   	     		
   	     		label1.setVisible(true);
   		   	    label2.setVisible(true);
   		   	    label3.setVisible(true);
   		   	    label4.setVisible(true);
   		   	    label5.setVisible(true);
   		   	    label6.setVisible(true);
   		   	     
   		   	     textField.setVisible(true);
   		   	     textField_1.setVisible(true);
   		   	     textField_2.setVisible(true);
   		   	     textField_3.setVisible(true);
   		   	     textField_4.setVisible(true);
   		   	     textField_5.setVisible(true);
   		   	     
   		   	     calcular.setVisible(true);
   		   	     calcular2.setVisible(false);
   		   	     calcular3.setVisible(false);
   		   	     calcular4.setVisible(false);
   		   	     calcular5.setVisible(false);
   		   	     
   		   	     frame.setSize(270,420);
   		   	     
   		   	     calcular.addActionListener(new ActionListener() {
   		   	    	 public void actionPerformed(ActionEvent e) {
   		   	    		int i;
   		   	    		float x[]=new float[2];	
   		   	    		float y[]=new float[2];	
   		   	    		float z[]=new float[2];	
   		   	 		
   		   	    		float suma_x=0,suma_y=0,suma_z=0;
   		   	    		
   		   	    		x[0]=Integer.parseInt(textField.getText());
   		   	    		y[0]=Integer.parseInt(textField_1.getText());
   		   	    		z[0]=Integer.parseInt(textField_2.getText());
   		   	    		
   		   	    		x[1]=Integer.parseInt(textField_3.getText());
   		   	    		y[1]=Integer.parseInt(textField_4.getText());
   		   	    		z[1]=Integer.parseInt(textField_5.getText());
   		   	    		
   		   	    		for(i=0;i<2;i++){ 
   		   	    			
   		   					suma_x+=x[i];
   		   					suma_y+=y[i];
   		   					suma_z+=z[i];
   		   				
   		   	    		}
   		   	    	Color blanco = new Color(255, 255, 255);
   		   	    		resultadoLabel.setText("Valor de X es de: " + suma_x);
   		   	    		resultadoLabel.setForeground(blanco);
   		   	    	
   		         	    resultadoLabel2.setText("Valor de Y es de: " + suma_y);
   		         	    resultadoLabel2.setForeground(blanco);
   		         	    
   		         	    resultadoLabel3.setText("Valor de Z es de: " + suma_z);
   		         	    resultadoLabel3.setForeground(blanco);
   		   	    		 
   		   	    		 
   		   	    	 }
   		   	    	 
   		   	     });
   		   	     
   	     	}
   	     });
   	     btnNewButton.setForeground(new Color(255, 255, 255));
   	     btnNewButton.setBackground(new Color(237,152,32));
   	     btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
   	     
   	     btnNewButton.setBounds(24, 46, 89, 23);
   	     panel.add(btnNewButton);
   	     
   	     JButton btnNewButton_1 = new JButton("Resta");
   	     btnNewButton_1.addActionListener(new ActionListener() {
   	    	public void actionPerformed(ActionEvent e) {
   	    		
   	    		
   	    		resultadoLabel.setText("");
      	    		resultadoLabel2.setText("");
      	    		resultadoLabel3.setText("");
   	    		
      	    		textField.setText(null);
      	    		textField_1.setText(null);
      	    		textField_2.setText(null);
      	    		textField_3.setText(null);
      	    		textField_4.setText(null);
      	    		textField_5.setText(null);
      	    		
   	    		label1.setVisible(false);
   	     		label2.setVisible(false);
   	     		label3.setVisible(false);
   	     		label4.setVisible(false);
   	     		label5.setVisible(false);
   	     		label6.setVisible(false);
   	   	     
   	     		textField.setVisible(false);
   	     		textField_1.setVisible(false);
   	     		textField_2.setVisible(false);
   	     		textField_3.setVisible(false);
   	     		textField_4.setVisible(false);
   	     		textField_5.setVisible(false);
   	     		
   	     		lblNewLabel_1.setVisible(false);
   	     		lblNewLabel_2.setVisible(false);
   	     		lblNewLabel_3.setVisible(false);
   	   	     
   	     		textField_6.setVisible(false);
   	     		textField_7.setVisible(false);
   	     		textField_8.setVisible(false);
   	     		
   	     		label1.setVisible(true);
   	     		label2.setVisible(true);
   	     		label3.setVisible(true);
   	     		label4.setVisible(true);
   	     		label5.setVisible(true);
   	     		label6.setVisible(true);
   	   	     
   	     		textField.setVisible(true);
   	     		textField_1.setVisible(true);
   	     		textField_2.setVisible(true);
   	     		textField_3.setVisible(true);
   	     		textField_4.setVisible(true);
   	     		textField_5.setVisible(true);
   	     		
   	     		calcular.setVisible(false);
   	     		calcular2.setVisible(true);
   	     		calcular3.setVisible(false);
   	     		calcular4.setVisible(false);
   	     		calcular5.setVisible(false);
   	     		
   		   	    frame.setSize(270,420);
   	     		
   	     		calcular2.addActionListener(new ActionListener() {
   	     			public void actionPerformed(ActionEvent e) {
   	     				
   	     				int i;
   		   	    		float x[]=new float[2];	
   		   	    		float y[]=new float[2];	
   		   	    		float z[]=new float[2];	
   		   	 		
   		   	    		float resta_x=0,resta_y=0,resta_z=0;
   		   	    		
   		   	    		x[0]=Integer.parseInt(textField.getText());
   		   	    		y[0]=Integer.parseInt(textField_1.getText());
   		   	    		z[0]=Integer.parseInt(textField_2.getText());
   		   	    		
   		   	    		x[1]=Integer.parseInt(textField_3.getText());
   		   	    		y[1]=Integer.parseInt(textField_4.getText());
   		   	    		z[1]=Integer.parseInt(textField_5.getText());
   		   	    		
   		   	    		for(i=0;i<(2-1);i++){
   			   	 			resta_x=x[i]-(x[i+1]);
   			   	 			x[i+1]=resta_x;
   			   	 			
   			   	 			resta_y=y[i]-(y[i+1]);
   			   	 			y[i+1]=resta_y;
   			   	 			
   			   	 			resta_z=z[i]-z[i+1];
   			   	 			z[i+1]=resta_z;	
   			   	 		}
   		   	    	Color blanco = new Color(255, 255, 255);
   		   	    	
   		   	    		resultadoLabel.setText("Valor de X es de: " + resta_x);
   		   	    		resultadoLabel.setForeground(blanco);
   		   	    	
   		         	    resultadoLabel2.setText("Valor de Y es de: " + resta_y);
	   		         	resultadoLabel2.setForeground(blanco);
	   		         	
   		         	    resultadoLabel3.setText("Valor de Z es de: " + resta_z);
   		         	    resultadoLabel3.setForeground(blanco);
   		         	    
   	     				
   	     			}
   	     			
   	     		});
   	    		
   	    	}
   	     });
   	     
   	     btnNewButton_1.setForeground(new Color(255, 255, 255));
	     btnNewButton_1.setBackground(new Color(237,152,32));
	     btnNewButton_1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
   	     
   	     
   	     btnNewButton_1.setBounds(142, 46, 89, 23);
   	     panel.add(btnNewButton_1);
   	     
   	     
   	     
   	     JButton btnNewButton_2 = new JButton("Prod. Vectorial");
   	     
   	     btnNewButton_2.addActionListener(new ActionListener() {
   		    	public void actionPerformed(ActionEvent e) {
   		    		
   		    		resultadoLabel.setText("");
   	   	    		resultadoLabel2.setText("");
   	   	    		resultadoLabel3.setText("");
   	   	    		
   	   	    		textField.setText(null);
   	   	    		textField_1.setText(null);
   	   	    		textField_2.setText(null);
   	   	    		textField_3.setText(null);
   	   	    		textField_4.setText(null);
   	   	    		textField_5.setText(null);
   		    	
   		    		label1.setVisible(false);
   		     		label2.setVisible(false);
   		     		label3.setVisible(false);
   		     		label4.setVisible(false);
   		     		label5.setVisible(false);
   		     		label6.setVisible(false);
   		   	     
   		     		textField.setVisible(false);
   		     		textField_1.setVisible(false);
   		     		textField_2.setVisible(false);
   		     		textField_3.setVisible(false);
   		     		textField_4.setVisible(false);
   		     		textField_5.setVisible(false);
   		     		
   		     		lblNewLabel_1.setVisible(false);
   		     		lblNewLabel_2.setVisible(false);
   		     		lblNewLabel_3.setVisible(false);
   		   	     
   		     		textField_6.setVisible(false);
   		     		textField_7.setVisible(false);
   		     		textField_8.setVisible(false);
   		     		
   		     		label1.setVisible(true);
   		     		label2.setVisible(true);
   		     		label3.setVisible(true);
   		     		label4.setVisible(true);
   		     		label5.setVisible(true);
   		     		label6.setVisible(true);
   		   	     
   		     		textField.setVisible(true);
   		     		textField_1.setVisible(true);
   		     		textField_2.setVisible(true);
   		     		textField_3.setVisible(true);
   		     		textField_4.setVisible(true);
   		     		textField_5.setVisible(true);
   		     		
   		     		calcular.setVisible(false);
   		     		calcular2.setVisible(false);
   		     		calcular3.setVisible(true);
   		     		calcular4.setVisible(false);
   		     		calcular5.setVisible(false);
   			   	     
   			   	    frame.setSize(270,420);
   			   	    
   			   	    calcular3.addActionListener(new ActionListener() {
   			   	    	public void actionPerformed(ActionEvent e) {
   			   	    		
   			   	    		int i;
   							float x[]=new float[2];	
   							float y[]=new float[2];	
   							float z[]=new float[2];	
   				
   							float cal_x=0,cal_y=0,cal_z=0;
   							
   							x[0]=Integer.parseInt(textField.getText());
   			   	    		y[0]=Integer.parseInt(textField_1.getText());
   			   	    		z[0]=Integer.parseInt(textField_2.getText());
   			   	    		
   			   	    		x[1]=Integer.parseInt(textField_3.getText());
   			   	    		y[1]=Integer.parseInt(textField_4.getText());
   			   	    		z[1]=Integer.parseInt(textField_5.getText());
   			   	    		
   			   	    		for(i=0;i<(2-1);i++){
   								 cal_x=(y[i]*z[i+1])-(y[i+1]*z[i]);
   							     cal_y=-((x[i]*z[i+1])-(x[i+1]*z[i]));
   								 cal_z=(x[i]*y[i+1])-(x[i+1]*y[i]);
   								
   								x[i+1]=cal_x;
   								y[i+1]=cal_y;
   								z[i+1]=cal_z;
   							}
   			   	    	Color blanco = new Color(255, 255, 255);
   			   	    	
   			   	    	
   			   	    		resultadoLabel.setText("P.V."+cal_x);
   			   	    		resultadoLabel.setForeground(blanco);
   			   	    	
   			   	    		resultadoLabel2.setText("P.V."+cal_y);
   			   	    		resultadoLabel2.setForeground(blanco);
   			   	    		
   			   	    		resultadoLabel3.setText("P.V."+cal_z);
   			   	    		resultadoLabel3.setForeground(blanco);
   			   	    		
   			   	    	}
   			   	    });
   		    		
   		    		
   		    	}
   	     });
   		 
   	     btnNewButton_2.setForeground(new Color(255, 255, 255));
	     btnNewButton_2.setBackground(new Color(237,152,32));
	     btnNewButton_2.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     
   	     btnNewButton_2.setBounds(9, 80, 105, 23);
   	     panel.add(btnNewButton_2);
   	     
   	     JButton btnNewButton_3 = new JButton("Prod. Escalar");
   	     
   	     btnNewButton_3.addActionListener(new ActionListener() {
   		    	public void actionPerformed(ActionEvent e) {
   		    		resultadoLabel.setText("");
   	   	    		resultadoLabel2.setText("");
   	   	    		resultadoLabel3.setText("");
   		    		
   	   	    		textField.setText(null);
   	   	    		textField_1.setText(null);
   	   	    		textField_2.setText(null);
   	   	    		textField_3.setText(null);
   	   	    		textField_4.setText(null);
   	   	    		textField_5.setText(null);
   	   	    		
   	   	    		textField_6.setText(null);
   	   	    		textField_7.setText(null);
   	   	    		textField_8.setText(null);
   	   	    		
   	   	    		lblNewLabel_1.setVisible(false);
   		     		lblNewLabel_2.setVisible(false);
   		     		lblNewLabel_3.setVisible(false);
   		   	     
   		     		textField_6.setVisible(false);
   		     		textField_7.setVisible(false);
   		     		textField_8.setVisible(false);
   		     		
   		    		label1.setVisible(false);
   		     		label2.setVisible(false);
   		     		label3.setVisible(false);
   		     		label4.setVisible(false);
   		     		label5.setVisible(false);
   		     		label6.setVisible(false);
   		   	     
   		     		textField.setVisible(false);
   		     		textField_1.setVisible(false);
   		     		textField_2.setVisible(false);
   		     		textField_3.setVisible(false);
   		     		textField_4.setVisible(false);
   		     		textField_5.setVisible(false);
   		     		
   		     		label1.setVisible(true);
   		     		label2.setVisible(true);
   		     		label3.setVisible(true);
   		     		label4.setVisible(true);
   		     		label5.setVisible(true);
   		     		label6.setVisible(true);
   		   	     
   		     		textField.setVisible(true);
   		     		textField_1.setVisible(true);
   		     		textField_2.setVisible(true);
   		     		textField_3.setVisible(true);
   		     		textField_4.setVisible(true);
   		     		textField_5.setVisible(true);
   		    		
   		     		calcular.setVisible(false);
   		     		calcular2.setVisible(false);
   		     		calcular3.setVisible(false);
   		     		calcular4.setVisible(true);
   		     		calcular5.setVisible(false);
   		     		
   		     		frame.setSize(270,420);
   		    		
   		     		calcular4.addActionListener(new ActionListener() {
   		     			public void actionPerformed(ActionEvent e) {
   		     				
   		     				int i;
   		     				float x[]=new float[2];	
   		     				float y[]=new float[2];	
   		     				float z[]=new float[2];	
   		     				
   		     				x[0]=Integer.parseInt(textField.getText());
   			   	    		y[0]=Integer.parseInt(textField_1.getText());
   			   	    		z[0]=Integer.parseInt(textField_2.getText());
   			   	    		
   			   	    		x[1]=Integer.parseInt(textField_3.getText());
   			   	    		y[1]=Integer.parseInt(textField_4.getText());
   			   	    		z[1]=Integer.parseInt(textField_5.getText());
   		     				
   			   	    		float mul_x=0,mul_y=0,mul_z=0;
   			   	    		
   			   	    		for(i=0;i<1;i++){
   				   	 			mul_x=x[i]*x[i+1];
   				   	 			x[i+1]=mul_x;
   				   	 			
   				   	 			mul_y=y[i]*y[i+1];
   				   	 			y[i+1]=mul_y;
   				   	 		    
   				   	 			mul_z=z[i]*z[i+1];
   				   	 			z[i+1]=mul_z;
   				   	 		}
   			   	    		
   			   	    		float produ=mul_x+mul_y+mul_z;
   			   	    	Color blanco = new Color(255, 255, 255);
   			   	    	
   			   	    		resultadoLabel.setText("Producto de los vectores: "+produ);
   			   	    		resultadoLabel.setForeground(blanco);
   		     				
   		     			}
   		     		});
   		    	}
   	     });
   		    	
   	     btnNewButton_3.setForeground(new Color(255, 255, 255));
	     btnNewButton_3.setBackground(new Color(237,152,32));
	     btnNewButton_3.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     
   	     btnNewButton_3.setBounds(142, 80, 105, 23);
   	     panel.add(btnNewButton_3);
   	     
   	     JButton btnNewButton_4 = new JButton("Multiplicacion por Escalar");
   	     btnNewButton_4.addActionListener(new ActionListener() {
   	     	public void actionPerformed(ActionEvent e) {
   	     		
   	     		resultadoLabel.setText("");
      	    		resultadoLabel2.setText("");
      	    		resultadoLabel3.setText("");
   	    		
      	    		textField.setText(null);
      	    		textField_1.setText(null);
      	    		textField_2.setText(null);
      	    		textField_3.setText(null);
      	    		textField_4.setText(null);
      	    		textField_5.setText(null);
      	    		
      	    		textField_6.setText(null);
      	    		textField_7.setText(null);
      	    		textField_8.setText(null);
      	    		textField_9.setText(null);
      	    		
   	    		label1.setVisible(false);
   	     		label2.setVisible(false);
   	     		label3.setVisible(false);
   	     		label4.setVisible(false);
   	     		label5.setVisible(false);
   	     		label6.setVisible(false);
   	   	     
   	     		textField.setVisible(false);
   	     		textField_1.setVisible(false);
   	     		textField_2.setVisible(false);
   	     		textField_3.setVisible(false);
   	     		textField_4.setVisible(false);
   	     		textField_5.setVisible(false);
   	     		
   	     		lblNewLabel_1.setVisible(true);
   	     		lblNewLabel_2.setVisible(true);
   	     		lblNewLabel_3.setVisible(true);
   	     		lblNewLabel_4.setVisible(true);
   	     		
   	     		textField_6.setVisible(true);
   	     		textField_7.setVisible(true);
   	     		textField_8.setVisible(true);
   	     		textField_9.setVisible(true);
   	     		
   	     		calcular.setVisible(false);
   	     		calcular2.setVisible(false);
   	     		calcular3.setVisible(false);
   	     		calcular4.setVisible(false);
   	     		calcular5.setVisible(true);
   	     		
   		   	    frame.setSize(270,420);
   	    		
   	    		
   	    		calcular5.addActionListener(new ActionListener() {
   	    			public void actionPerformed(ActionEvent e) {
   	    				
   	    				int i;
   	    				float x[]=new float[2];	
   	    				float y[]=new float[2];	
   	    				float z[]=new float[2];
   	    				
   	    				x[0]=Integer.parseInt(textField_6.getText());
   		   	    		y[0]=Integer.parseInt(textField_7.getText());
   		   	    		z[0]=Integer.parseInt(textField_8.getText());
   		   	    		
   		   	    		float esc=Integer.parseInt(textField_9.getText());
   		   	    		
   		   	    		float escalar_x;
   		   	 			float escalar_y;
   		   	 			float escalar_z;
   		   	 			
   		   	    		
   		   	    		for(i=0;i<1;i++){
   			   	 			escalar_x=(x[i]*esc);
   			   	 			escalar_y=(y[i]*esc);
   			   	 			escalar_z=(z[i]*esc);
   			   	 			
   			   	 		Color blanco = new Color(255, 255, 255);
   			   	 		
   			   	 		
   			   	 			resultadoLabel.setText("Valor X: "+escalar_x);
   			   	 			resultadoLabel.setForeground(blanco);
   			   	 		
   				   	 		resultadoLabel2.setText("Valor Y: "+escalar_y);
   				   	 		resultadoLabel2.setForeground(blanco);
   				   	 		
   				   	 		resultadoLabel3.setText("Valor Z: "+escalar_z);
   				   	 		resultadoLabel3.setForeground(blanco);
   				   	 		
   				   	 	escalar_x=0;
   		   	 			escalar_y=0;
   		   	 			escalar_z=0;
   		     			
   		   	    		}
   		   	    		
   		   	    		
   	    				
   	    			}
   	    			
   	    		});
   	    		
   	     	}
   	     });
   	     btnNewButton_4.setForeground(new Color(255, 255, 255));
	     btnNewButton_4.setBackground(new Color(237,152,32));
	     btnNewButton_4.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     
   	     btnNewButton_4.setBounds(50, 116, 150, 23);
   	     panel.add(btnNewButton_4);
   	     
   	     textField = new JTextField();
   	     textField.setBounds(24, 168, 86, 20);
   	     panel.add(textField);
   	     textField.setColumns(10);
   	     
   	     textField_1 = new JTextField();
   	     textField_1.setColumns(10);
   	     textField_1.setBounds(24, 199, 86, 20);
   	     panel.add(textField_1);
   	     
   	     textField_2 = new JTextField();
   	     textField_2.setColumns(10);
   	     textField_2.setBounds(24, 230, 86, 20);
   	     panel.add(textField_2);
   	     
   	     textField_3 = new JTextField();
   	     textField_3.setColumns(10);
   	     textField_3.setBounds(145, 168, 86, 20);
   	     panel.add(textField_3);
   	     
   	     textField_4 = new JTextField();
   	     textField_4.setColumns(10);
   	     textField_4.setBounds(145, 199, 86, 20);
   	     panel.add(textField_4);
   	     
   	     textField_5 = new JTextField();
   	     textField_5.setColumns(10);
   	     textField_5.setBounds(145, 230, 86, 20);
   	     panel.add(textField_5);
   	     
   	     label1 = new JLabel("X");
   	     label1.setForeground(new Color(255, 255, 255));
   	     label1.setBounds(10, 168, 24, 14);
   	     panel.add(label1);
   	     
   	     label2 = new JLabel("Y");
   	     label2.setForeground(new Color(255, 255, 255));
   	     label2.setBounds(10, 199, 34, 14);
   	     panel.add(label2);
   	     
   	     label3 = new JLabel("Z");
   	     label3.setForeground(new Color(255, 255, 255));
   	     label3.setBounds(10, 230, 24, 14);
   	     panel.add(label3);
   	     
   	     label4 = new JLabel("X");
   	     label4.setForeground(new Color(255, 255, 255));
   	     label4.setBounds(133, 168, 18, 14);
   	     panel.add(label4);
   	     
   	     label5 = new JLabel("Y");
   	     label5.setForeground(new Color(255, 255, 255));
   	     label5.setBounds(133, 199, 18, 14);
   	     panel.add(label5);
   	     
   	     label6 = new JLabel("Z");
   	     label6.setForeground(new Color(255, 255, 255));
   	     label6.setBounds(133, 233, 18, 14);
   	     panel.add(label6);
   	     
   	     calcular = new JButton("Calcular");
	   	 calcular.setForeground(new Color(255, 255, 255));
	   	 calcular.setBackground(new Color(237,152,32));
	   	 calcular.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
   	     calcular.setBounds(75, 268, 89, 23);
   	     panel.add(calcular);
   	     
   	     calcular2 = new JButton("Calcular");
   	     calcular2.setForeground(new Color(255, 255, 255));
	   	 calcular2.setBackground(new Color(237,152,32));
	   	 calcular2.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     calcular2.setBounds(75, 268, 89, 23);
   	     calcular2.setBounds(75, 268, 89, 23);
   	     panel.add(calcular2);
   	     
   	     calcular3 = new JButton("Calcular");
   	     calcular3.setForeground(new Color(255, 255, 255));
	   	 calcular3.setBackground(new Color(237,152,32));
	   	 calcular3.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     calcular3.setBounds(75, 268, 89, 23);
   	     calcular3.setBounds(75, 268, 89, 23);
   	     panel.add(calcular3);
   	     
   	     calcular4 = new JButton("Calcular");
   	     calcular4.setForeground(new Color(255, 255, 255));
	   	 calcular4.setBackground(new Color(237,152,32));
	   	 calcular4.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     calcular4.setBounds(75, 268, 89, 23);
   	     calcular4.setBounds(75, 268, 89, 23);
   	     panel.add(calcular4);
   	     
   	     calcular5 = new JButton("Calcular");
   	     calcular5.setForeground(new Color(255, 255, 255));
	   	 calcular5.setBackground(new Color(237,152,32));
	   	 calcular5.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
	     calcular5.setBounds(75, 268, 89, 23);
   	     calcular5.setBounds(75, 268, 89, 23);
   	     panel.add(calcular5);
   	     
   	     resultadoLabel = new JLabel("");
   	     resultadoLabel.setBounds(25, 300, 219, 25);
   	     panel.add(resultadoLabel);
   	        
   	     resultadoLabel2 = new JLabel("");
   	     resultadoLabel2.setBounds(25, 320, 219, 25);
   	     panel.add(resultadoLabel2);
   	        
   	     resultadoLabel3 = new JLabel("");
   	     resultadoLabel3.setBounds(25, 340, 219, 25);
   	     panel.add(resultadoLabel3);
   	     
   	     textField_6 = new JTextField();
   	     textField_6.setBounds(30, 168, 86, 20);
   	     panel.add(textField_6);
   	     textField_6.setColumns(10);
   	     
   	     textField_7 = new JTextField();
   	     textField_7.setBounds(30, 199, 86, 20);
   	     panel.add(textField_7);
   	     textField_7.setColumns(10);
   	     
   	     textField_8 = new JTextField();
   	     textField_8.setBounds(30, 230, 86, 20);
   	     panel.add(textField_8);
   	     textField_8.setColumns(10);
   	     
   	     lblNewLabel_1 = new JLabel("X");
   	     lblNewLabel_1.setForeground(new Color(255, 255, 255));
   	     lblNewLabel_1.setBounds(15, 170, 18, 17);
   	     panel.add(lblNewLabel_1);
   	     
   	     lblNewLabel_2 = new JLabel("Y");
   	     lblNewLabel_2.setForeground(new Color(255, 255, 255));
   	     lblNewLabel_2.setBounds(15, 200, 46, 14);
   	     panel.add(lblNewLabel_2);
   	     
   	     lblNewLabel_3 = new JLabel("Z");
   	     lblNewLabel_3.setForeground(new Color(255, 255, 255));
   	     lblNewLabel_3.setBounds(15, 230, 46, 14);
   	     panel.add(lblNewLabel_3);
   	     
   	     lblNewLabel_4 = new JLabel("Escalar");
   	     lblNewLabel_4.setForeground(new Color(255, 255, 255));
   	     lblNewLabel_4.setBounds(161, 171, 46, 14);
   	     panel.add(lblNewLabel_4);
   	     
   	     textField_9 = new JTextField();
   	     textField_9.setBounds(145, 199, 86, 20);
   	     panel.add(textField_9);
   	     textField_9.setColumns(10);
   	     
   	     frame.setVisible(true);
   	     
   	     calcular.setVisible(false);
   	     calcular2.setVisible(false);
   	     calcular3.setVisible(false);
   	     calcular4.setVisible(false);
   	     calcular5.setVisible(false);
   	     
   	     label1.setVisible(false);
   	     label2.setVisible(false);
   	     label3.setVisible(false);
   	     label4.setVisible(false);
   	     label5.setVisible(false);
   	     label6.setVisible(false);
   	     
   	     lblNewLabel_1.setVisible(false);
   	     lblNewLabel_2.setVisible(false);
   	     lblNewLabel_3.setVisible(false);
   	     lblNewLabel_4.setVisible(false);
   	     
   	     textField.setVisible(false);
   	     textField_1.setVisible(false);
   	     textField_2.setVisible(false);
   	     textField_3.setVisible(false);
   	     textField_4.setVisible(false);
   	     textField_5.setVisible(false);
   	     
   	     textField_6.setVisible(false);
   	     textField_7.setVisible(false);
   	     textField_8.setVisible(false);
   	     textField_9.setVisible(false);
   	 
    		
    	}
    	
    
        private static JTextField textField_10;
        private static JTextField textField_11;

        private static JLabel X1;
        private static JLabel X2;
        private static JLabel X3;

        private static JLabel Y1;
        private static JLabel Y2;
        private static JLabel Y3;

        private static JLabel Z1;
        private static JLabel Z2;
        private static JLabel Z3;

        private static JLabel Idependiente1;
        private static JLabel Idependiente2;
        private static JLabel Idependiente3;
        
        
        private static JButton Calcular;
        
    	private static void funcion_sistemas() {
    		JFrame frame = new JFrame("Calculadora");
            frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\5TO 2DA\\LPOO\\07-08-2023 LOGO Calculadora\\346399.png"));
    		frame.setBounds(600, 250, 270, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));

            JPanel panel = new JPanel();
            panel.setBackground(new Color(0, 0, 0));
            panel.setForeground(new Color(255, 128, 255));
            frame.getContentPane().add(panel);
            panel.setLayout(null);

            JLabel lblNewLabel = new JLabel("Calculadora");
            lblNewLabel.setForeground(new Color(255, 255, 255));
            lblNewLabel.setBounds(103, 11, 73, 14);
            panel.add(lblNewLabel);
            
            JButton btnNewButton_back = new JButton("Back");
            btnNewButton_back.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		
            		frame.removeAll();
            		frame.setVisible(false);
            		Interfaz.main(null);;
            	}
            });
            btnNewButton_back.setBounds(10, 7, 70, 15);
            panel.add(btnNewButton_back);

            JButton btnNewButton = new JButton("Sistemas 2x2");
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.setSize(300, 400);
                    Calcular.setBounds(91, 250, 94, 23);
                    
                    X1.setVisible(true);
                    textField.setVisible(true);
                    
                    Y1.setVisible(true);
                    textField_1.setVisible(true);

                    Idependiente1.setVisible(true);
                    textField_3.setVisible(true);
                    
                    X2.setVisible(true);
                    textField_4.setVisible(true);
                    
                    Y2.setVisible(true);
                    textField_5.setVisible(true);
                    
                    Idependiente2.setVisible(true);
                    textField_7.setVisible(true);
                    
                    Z1.setVisible(false);
                    textField_2.setVisible(false);
                    Z2.setVisible(false);
                    textField_6.setVisible(false);
                    X3.setVisible(false);
                    Y3.setVisible(false);
                    Z3.setVisible(false);
                    Idependiente3.setVisible(false);
                    textField_8.setVisible(false);
                    textField_9.setVisible(false);
                    textField_10.setVisible(false);
                    textField_11.setVisible(false);
                    
                    textField.setText(null);
                    textField_1.setText(null);
                    textField_2.setText(null);
                    textField_3.setText(null);
                    textField_4.setText(null);
                    textField_5.setText(null);
                    textField_6.setText(null);
                    textField_7.setText(null);
                    textField_8.setText(null);
                    textField_9.setText(null);
                    textField_10.setText(null);
                    textField_11.setText(null);
                    
                    resultadoLabel.setText(null);
                    resultadoLabel2.setText(null);
                    resultadoLabel3.setText(null);
                    

                    
                    Calcular.setVisible(true);
                    
                    Calcular.addActionListener(new ActionListener() {
                    	public void actionPerformed(ActionEvent e) {
                    		
                    		resultadoLabel.setText(null);
                            resultadoLabel2.setText(null);
                            resultadoLabel3.setText(null);
                            
                    		
                    		float a[] = new float [2];
                    		float b[] = new float [2];
                    		float indep[] = new float [2];
                    		int i=0;
                            
                    		a[0]=Integer.parseInt(textField.getText());
                    		b[0]=Integer.parseInt(textField_1.getText());
                    		indep[0]=Integer.parseInt(textField_3.getText());
                    		
                    		a[1]=Integer.parseInt(textField_4.getText());
                    		b[1]=Integer.parseInt(textField_5.getText());
                    		indep[1]=Integer.parseInt(textField_7.getText());
                    		
                    		float cal_inde=0, cal_x=0, cal_y=0, det_x=0, det_y=0;
                    		
                    		for(i=0;i<1;i++){
                    			
                    			cal_inde=(a[i]*b[i+1])-(a[i+1]*b[i]);
                    			cal_x=(b[i+1]*indep[i])-(b[i]*indep[i+1]);
                    			cal_y=(a[i]*indep[i+1])-(a[i+1]*indep[i]);
                    			
                    			if(cal_inde==0 && cal_y==0 && cal_x==0){
                    			
                    				resultadoLabel.setText("El sistema 2x2 tiene infinitas soluciones");
                    				
                    			
                    			}
                    		}
                    		
                    		if(cal_inde==0 && cal_y!=0 && cal_x!=0){
                    		
                    			resultadoLabel.setText("El sistema 2x2 no tiene ninguna solución");
                    		
                    		}
                    		
                    		if(cal_inde!=0 && cal_y!=0 && cal_x!=0){
            	        	
                    			det_x=(float)(cal_x/cal_inde);
            	        		det_y=(float)(cal_y/cal_inde);
            	        		
            	        		resultadoLabel.setText("Valor X= "+det_x);
            	        		resultadoLabel2.setText("Valor Y= "+det_y);
                    		
            	        		cal_inde=0;
            	        		cal_x=0;
            	        		cal_y=0;
            	        		det_x=0;
            	        		det_y=0;
                    		}
                    		
                    	}
                    });
                    Calcular.setForeground(new Color(255, 255, 255));
                    Calcular.setBackground(new Color(237,152,32));
                    Calcular.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
                    
            		
                }
                
            });
            btnNewButton.setForeground(new Color(255, 255, 255));
   	     	btnNewButton.setBackground(new Color(237,152,32));
   	     	btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
      	     
            btnNewButton.setBounds(70, 48, 122, 23);
            panel.add(btnNewButton);
            
            Calcular = new JButton("-Calcular-");
            Calcular.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            	}
            });
            Calcular.setBounds(91, 250, 94, 23);
            panel.add(Calcular);
            
            Calcular.setVisible(false);

            JButton btnNewButton_1 = new JButton("Sistemas 3x3");
            btnNewButton_1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	
                	textField.setText(null);
                    textField_1.setText(null);
                    textField_2.setText(null);
                    textField_3.setText(null);
                    textField_4.setText(null);
                    textField_5.setText(null);
                    textField_6.setText(null);
                    textField_7.setText(null);
                    textField_8.setText(null);
                    textField_9.setText(null);
                    textField_10.setText(null);
                    textField_11.setText(null);
                    
                    resultadoLabel.setText(null);
                    resultadoLabel2.setText(null);
                    resultadoLabel3.setText(null);
                    
                	frame.setSize(300, 550);
                    
                    X1.setVisible(true);
                    textField.setVisible(true);
                    
                    Y1.setVisible(true);
                    textField_1.setVisible(true);
                    
                    Z1.setVisible(true);
                    textField_2.setVisible(true);
                    
                    Idependiente1.setVisible(true);
                    textField_3.setVisible(true);
                    
                    X2.setVisible(true);
                    textField_4.setVisible(true);
                    
                    Y2.setVisible(true);
                    textField_5.setVisible(true);
                    
                    Z2.setVisible(true);
                    textField_6.setVisible(true);
                    
                    Idependiente2.setVisible(true);
                    textField_7.setVisible(true);
                    
                    
                    X3.setVisible(true);
                    textField_8.setVisible(true);
                    
                    Y3.setVisible(true);
                    textField_9.setVisible(true);
                    
                    Z3.setVisible(true);
                    textField_10.setVisible(true);
                    
                    Idependiente3.setVisible(true);
                    textField_11.setVisible(true);
                    
                    
                    Calcular.setBounds(33, 400, 219, 25);
                    Calcular.setVisible(true);
                    
                	
                	Calcular.addActionListener(new ActionListener() {
                		public void actionPerformed(ActionEvent e) {
                			
                			
                            
                			
                			resultadoLabel.setBounds(33, 430, 219, 25);
    	         	       	resultadoLabel2.setBounds(33, 450, 219, 25);
    	         	       	resultadoLabel3.setBounds(33, 470, 219, 25); 
                			
               			 	float x[] = new float [3];
    	           			float y[] = new float [3];
    	           			float z[] = new float [3];
    	           			float inde[] = new float [3];
    	           			int i=0;
               				float det_x=0, det_y=0, det_z,cal_x=0, cal_y=0, cal_z=0, cal_inde=0;
               				
               				
               				x[0]=Integer.parseInt(textField.getText());
               				y[0]=Integer.parseInt(textField_1.getText());
               				z[0]=Integer.parseInt(textField_2.getText());
               				inde[0]=Integer.parseInt(textField_3.getText());
               				
               				x[1]=Integer.parseInt(textField_4.getText());
               				y[1]=Integer.parseInt(textField_5.getText());
               				z[1]=Integer.parseInt(textField_6.getText());
               				inde[1]=Integer.parseInt(textField_7.getText());
               				
               				x[2]=Integer.parseInt(textField_8.getText());
               				y[2]=Integer.parseInt(textField_9.getText());
               				z[2]=Integer.parseInt(textField_10.getText());
               				inde[2]=Integer.parseInt(textField_11.getText());
               				
               				cal_inde = x[0]*y[1]*z[2] + x[1]*y[2]*z[0] + x[2]*y[0]*z[1]
               		             - x[0]*y[2]*z[1] - x[1]*y[0]*z[2] - x[2]*y[1]*z[0];
               		             
    	           		    cal_x = inde[0]*y[1]*z[2] + inde[1]*y[2]*z[0] + inde[2]*y[0]*z[1]
    	           		          - inde[0]*y[2]*z[1] - inde[1]*y[0]*z[2] - inde[2]*y[1]*z[0];
    	           		          
    	           		    cal_y = x[0]*inde[1]*z[2] + x[1]*inde[2]*z[0] + x[2]*inde[0]*z[1]
    	           		          - x[0]*inde[2]*z[1] - x[1]*inde[0]*z[2] - x[2]*inde[1]*z[0];
    	           		          
    	           		    cal_z = x[0]*y[1]*inde[2] + x[1]*y[2]*inde[0] + x[2]*y[0]*inde[1]
    	           		          - x[0]*y[2]*inde[1] - x[1]*y[0]*inde[2] - x[2]*y[1]*inde[0];
    	           		    
    		           		 if (cal_inde == 0 && cal_y == 0 && cal_x == 0 && cal_z == 0){
    		           			 
    		         	    	
    		         	    	resultadoLabel.setText("El sistema 3x3 tiene infinitas soluciones");
            	        		
    		         	    	
    		         	    }
    		         	    
    		         	    else if (cal_inde == 0 && (cal_y != 0 || cal_x != 0 || cal_z != 0)){
    		         	    	
    		         	    	resultadoLabel.setText("El sistema 3x3 no tiene solucion");
            	        		
    		         	    }
    		         	    else {
    		         	        det_x = (float) cal_x / cal_inde;
    		         	        det_y = (float) cal_y / cal_inde;
    		         	        det_z = (float) cal_z / cal_inde;
    	
    		         	        resultadoLabel.setText("Valor de X es de: " + det_x);
    			         	    resultadoLabel2.setText("Valor de Y es de: " + det_y);
    			         	    resultadoLabel3.setText("Valor de Z es de: " + det_z);
    			         	    
    		         	    }
                		
                		}
                		
                	});
                	Calcular.setForeground(new Color(255, 255, 255));
                    Calcular.setBackground(new Color(237,152,32));
                    Calcular.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
                	
                	
                }
            });
            
            btnNewButton_1.setForeground(new Color(255, 255, 255));
   	     	btnNewButton_1.setBackground(new Color(237,152,32));
   	     	btnNewButton_1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
      	     
            btnNewButton_1.setBounds(70, 82, 122, 23);
            panel.add(btnNewButton_1);

            resultadoLabel = new JLabel("");
            resultadoLabel.setForeground(new Color(255,255,255));
            resultadoLabel.setBounds(33, 280, 219, 25);
            panel.add(resultadoLabel);
            
            resultadoLabel2 = new JLabel("");
            resultadoLabel2.setForeground(new Color(255,255,255));
            resultadoLabel2.setBounds(33, 300, 219, 25);
            panel.add(resultadoLabel2);
            
            resultadoLabel3 = new JLabel("");
            resultadoLabel3.setForeground(new Color(255,255,255));
            resultadoLabel3.setBounds(33, 320, 219, 25);
            panel.add(resultadoLabel3);


            X1 = new JLabel("X = ");
            X1.setForeground(new Color(255,255,255));
            X1.setBounds(10, 132, 27, 14);
            panel.add(X1);

            Y1 = new JLabel("Y = "); 
            Y1.setForeground(new Color(255,255,255));
            Y1.setBounds(10, 163, 27, 14); 
            panel.add(Y1);

            Z1 = new JLabel("Z = ");
            Z1.setForeground(new Color(255,255,255));
            Z1.setBounds(10, 194, 27, 14); 
            panel.add(Z1);

            Idependiente1 = new JLabel("Indp. = ");
            Idependiente1.setForeground(new Color(255,255,255));
            Idependiente1.setBounds(10, 222, 49, 14);
            panel.add(Idependiente1);

            X2 = new JLabel("X = ");
            X2.setForeground(new Color(255,255,255));
            X2.setBounds(152, 129, 27, 14); 
            panel.add(X2);

            Y2 = new JLabel("Y = "); 
            Y2.setForeground(new Color(255,255,255));
            Y2.setBounds(152, 160, 27, 14);
            panel.add(Y2);

            Z2 = new JLabel("Z = ");
            Z2.setForeground(new Color(255,255,255));
            Z2.setBounds(152, 191, 27, 14); 
            panel.add(Z2);

            Idependiente2 = new JLabel("Indp. = ");
            Idependiente2.setForeground(new Color(255,255,255));
            Idependiente2.setBounds(152, 219, 49, 14);
            panel.add(Idependiente2);

            X3 = new JLabel("X = ");
            X3.setForeground(new Color(255,255,255));
            X3.setBounds(10, 272, 27, 14); 
            panel.add(X3);

            Y3 = new JLabel("Y = ");
            Y3.setForeground(new Color(255,255,255));
            Y3.setBounds(10, 297, 27, 14); 
            panel.add(Y3);

            Z3 = new JLabel("Z = "); 
            Z3.setForeground(new Color(255,255,255));
            Z3.setBounds(10, 322, 27, 14); 
            panel.add(Z3);

            Idependiente3 = new JLabel("Indp. = ");
            Idependiente3.setForeground(new Color(255,255,255));
            Idependiente3.setBounds(10, 347, 49, 14);
            panel.add(Idependiente3);

            
            textField = new JTextField();
            textField.setBounds(34, 129, 86, 20);
            panel.add(textField);
            textField.setColumns(10);
            
            textField_1 = new JTextField();
            textField_1.setBounds(34, 160, 86, 20);
            panel.add(textField_1);
            textField_1.setColumns(10);
            
            textField_2 = new JTextField();
            textField_2.setBounds(34, 188, 86, 20);
            panel.add(textField_2);
            textField.setColumns(10);
            
            textField_3 = new JTextField();
            textField_3.setBounds(56, 219, 86, 20);
            panel.add(textField_3);
            textField.setColumns(10);

            textField_4 = new JTextField();
            textField_4.setBounds(182, 129, 86, 20);
            panel.add(textField_4);
            textField.setColumns(10);

            textField_5 = new JTextField();
            textField_5.setBounds(182, 160, 86, 20);
            panel.add(textField_5);
            textField.setColumns(10);
            
            textField_6 = new JTextField();
            textField_6.setBounds(182, 191, 86, 20);
            panel.add(textField_6);
            textField.setColumns(10);
            
            textField_7 = new JTextField();
            textField_7.setBounds(192, 219, 86, 20);
            panel.add(textField_7);
            textField_7.setColumns(10);

            textField_8 = new JTextField();
            textField_8.setBounds(34, 269, 86, 20);
            panel.add(textField_8);
            textField_8.setColumns(10);

            textField_9 = new JTextField();
            textField_9.setBounds(34, 294, 86, 20);
            panel.add(textField_9);
            textField_9.setColumns(10);

            textField_10 = new JTextField();
            textField_10.setBounds(34, 319, 86, 20);
            panel.add(textField_10);
            textField_10.setColumns(10);

            textField_11 = new JTextField();
            textField_11.setBounds(56, 344, 86, 20);
            panel.add(textField_11);
            textField_11.setColumns(10);

            frame.setVisible(true);
            X1.setVisible(false);
            textField.setVisible(false);
            
            Y1.setVisible(false);
            textField_1.setVisible(false);
            
            Z1.setVisible(false);
            textField_2.setVisible(false);
            
            Idependiente1.setVisible(false);
            textField_3.setVisible(false);
            
            X2.setVisible(false);
            textField_4.setVisible(false);
            
            Y2.setVisible(false);
            textField_5.setVisible(false);
            
            Z2.setVisible(false);
            textField_6.setVisible(false);
            
            Idependiente2.setVisible(false);
            textField_7.setVisible(false);
            
            X3.setVisible(false);
            textField_8.setVisible(false);
            
            Y3.setVisible(false);
            textField_9.setVisible(false);
            
            Z3.setVisible(false);
            textField_10.setVisible(false);
            
            Idependiente3.setVisible(false);
            textField_11.setVisible(false);
    	}
    	
    	private static int posicion_x = 25;
        private static JLabel resultado;
        private static int posicion_y = 150;
    	
    	private static void funcion_matriz() {
    		JFrame frame = new JFrame("Calculadora");
            frame.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\5TO 2DA\\LPOO\\07-08-2023 LOGO Calculadora\\346399.png"));
            frame.setBounds(600, 250, 270, 300);
            frame.setResizable(false);

            JFrame frame2 = new JFrame("Calculadora");
            frame2.setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\5TO 2DA\\LPOO\\07-08-2023 LOGO Calculadora\\346399.png"));
            frame2.setBounds(550, 250, 270, 350);
            frame2.setResizable(false);

            JPanel panel = new JPanel();
            panel.setBackground(new Color(0, 0, 0));
            panel.setForeground(new Color(255, 128, 255));
            frame.getContentPane().add(panel);
            panel.setLayout(null);

            JPanel panel2 = new JPanel();
            panel2.setBackground(new Color(0, 0, 0));
            panel2.setForeground(new Color(255, 128, 255));
            frame2.getContentPane().add(panel2);
            panel2.setLayout(null);

            JLabel lblNewLabel = new JLabel("Calculadora");
            lblNewLabel.setForeground(new Color(255, 255, 255));
            lblNewLabel.setBounds(98, 11, 73, 14);
            panel.add(lblNewLabel);
            
            JButton btnNewButton_back = new JButton("Back");
            btnNewButton_back.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		
            		frame.removeAll();
            		frame.setVisible(false);
            		Interfaz.main(null);;
            	}
            });
            btnNewButton_back.setBounds(10, 7, 70, 15);
            panel.add(btnNewButton_back);
            
            /*--------------------------------------------------------------------*/

            JButton btnNewButton = new JButton("Suma");
            btnNewButton.addActionListener(new ActionListener() {

                int x = 0, i = 0;

                JTextField[][] matriz1 = new JTextField[5][5];
                JTextField[][] matriz2 = new JTextField[5][5];

                float[][] matrizresultado = new float[5][5];

                public void actionPerformed(ActionEvent e) {

                    String input1 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de filas");
                    int filas = Integer.parseInt(input1);

                    String input2 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de columnas");
                    int columnas = Integer.parseInt(input2);

                    frame.setVisible(false);
                    frame2.setVisible(true);
                    
                    JLabel lblNewLabel = new JLabel("Calculadora");
                    lblNewLabel.setForeground(new Color(255, 255, 255));
                    lblNewLabel.setBounds(98, 11, 73, 14);
                    panel2.add(lblNewLabel);
                    
                    
                 
                    /*panel2.removeAll();*/

                    int count_x = 50;
                    int count_y = 80;
                    
                    int sum = 0;
                    
                    JLabel MatrizAlabel = new JLabel("Matriz A");
                    MatrizAlabel.setForeground(new Color(255,255,255));
                    MatrizAlabel.setBounds(count_x, count_y-20, 73, 14);
                    panel2.add(MatrizAlabel);

                    for (i = 0; i < filas; i++) {
                    	
                    	sum = 20;
                    	
                        for (x = 0; x < columnas; x++) {
                            matriz1[i][x] = new JTextField();
                            matriz1[i][x].setBounds(count_x, count_y, 15, 15);
                            panel2.add(matriz1[i][x]);

                            count_x += 20;
                            sum+=20;
                        }
                        
                        count_y += 20;
                        count_x=50;
                        

                    }
                    
                    JLabel inversa = new JLabel("+");
    	             inversa.setForeground(new Color(255, 255, 255));
    	             inversa.setBounds(sum+50, 90, 130, 14);
    	             panel2.add(inversa);
                    
                    sum+=80;
                    count_x = sum;
                    count_y = 80;
                    
                    JLabel MatrizBlabel = new JLabel("Matriz B");
                    MatrizBlabel.setForeground(new Color(255,255,255));
                    MatrizBlabel.setBounds(count_x, count_y-20, 73, 14);
                    panel2.add(MatrizBlabel);
                    
                    
                    
                    
                    for (i = 0; i < filas; i++) {
                        for (x = 0; x < columnas; x++) {
                            matriz2[i][x] = new JTextField(); 
                            matriz2[i][x].setBounds(count_x, count_y, 15, 15);
                            panel2.add(matriz2[i][x]);

                            count_x += 20;
                        }
                        count_y += 20;
                        count_x=sum;
                    }

                    JButton back = new JButton("Back");
                    back.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.setVisible(true);
                            frame2.dispose(); // Cerrar elsegundo JFrame (frame2)
                            panel2.removeAll(); // Eliminar todos los componentes del panel2
                        }
                    });

                    back.setBounds(180, 20, 70, 15);
                    panel2.add(back);

                    JButton calcular1 = new JButton("Calcular");
                    calcular1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            int pos_x_aux = posicion_x;
                            int pos_y_aux = posicion_y;

                            for (i = 0; i < filas; i++) {
                                for (x = 0; x < columnas; x++) {
                                    matrizresultado[i][x] = Integer.parseInt(matriz1[i][x].getText())
                                            + Integer.parseInt(matriz2[i][x].getText());

                                    JLabel resultadoLabel = new JLabel(" [" + matrizresultado[i][x]+"] ");
                                    resultadoLabel.setForeground(new Color(255,255,255));
                                    resultadoLabel.setBounds(pos_x_aux, pos_y_aux, 219, 25);
                                    panel2.add(resultadoLabel);

                                    pos_x_aux += 40;
                                }
                                pos_y_aux += 30;
                                pos_x_aux = posicion_x;

                            }
                            panel2.repaint(); // Actualizar el panel para que se muestren todos los resultados
                        }
                    });
                    calcular1.setForeground(new Color(255, 255, 255));
                    calcular1.setBackground(new Color(237,152,32));
                    calcular1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
            	    
                    calcular1.setBounds(30, 250, 89, 23);
                    panel2.add(calcular1);
                }
            });
            btnNewButton.setForeground(new Color(255, 255, 255));
    	    btnNewButton.setBackground(new Color(237,152,32));
    	    btnNewButton.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
            btnNewButton.setBounds(30, 69, 89, 23);
            panel.add(btnNewButton);

            /*---------------------------------------------------------------------------------------------*/
            
            JButton btnNewButton_1 = new JButton("Resta");
            btnNewButton_1.addActionListener(new ActionListener() {

                int x = 0, i = 0;

                JTextField[][] matriz1 = new JTextField[5][5];
                JTextField[][] matriz2 = new JTextField[5][5];

                float[][] matrizresultado = new float[5][5];

                public void actionPerformed(ActionEvent e) {

                    String input1 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de filas");
                    int filas = Integer.parseInt(input1);

                    String input2 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de columnas");
                    int columnas = Integer.parseInt(input2);

                    frame.setVisible(false);
                    frame2.setVisible(true);
                    
                    JLabel lblNewLabel = new JLabel("Calculadora");
                    lblNewLabel.setForeground(new Color(255, 255, 255));
                    lblNewLabel.setBounds(98, 11, 73, 14);
                    panel2.add(lblNewLabel);

                    int count_x = 50;
                    int count_y = 80;
                    
                    int sum = 0;
                    
                    JLabel MatrizAlabel = new JLabel("Matriz A");
                    MatrizAlabel.setForeground(new Color(255,255,255));
                    MatrizAlabel.setBounds(count_x, count_y-20, 73, 14);
                    panel2.add(MatrizAlabel);
                    

                    for (i = 0; i < filas; i++) {
                    	
                    	sum = 20;
                    	
                        for (x = 0; x < columnas; x++) {
                            matriz1[i][x] = new JTextField();
                            matriz1[i][x].setBounds(count_x, count_y, 15, 15);
                            panel2.add(matriz1[i][x]);

                            count_x += 20;
                            sum+=20;
                        }
                        
                        count_y += 20;
                        count_x=50;
                        

                    }
                    
                    JLabel inversa = new JLabel("__");
    	             inversa.setForeground(new Color(255, 255, 255));
    	             inversa.setBounds(sum+48, 85, 130, 14);
    	             panel2.add(inversa);
                    
                    sum+=80;
                    count_x = sum;
                    count_y = 80;
                    
                    JLabel MatrizBlabel = new JLabel("Matriz B");
                    MatrizBlabel.setForeground(new Color(255,255,255));
                    MatrizBlabel.setBounds(count_x, count_y-20, 73, 14);
                    panel2.add(MatrizBlabel);
                    
                    for (i = 0; i < filas; i++) {
                        for (x = 0; x < columnas; x++) {
                            matriz2[i][x] = new JTextField(); 
                            matriz2[i][x].setBounds(count_x, count_y, 15, 15);
                            panel2.add(matriz2[i][x]);

                            count_x += 20;
                        }
                        count_y += 20;
                        count_x=sum;
                    }

                    JButton back = new JButton("Back");
                    back.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.setVisible(true);
                            frame2.dispose(); // Cerrar elsegundo JFrame (frame2)
                            panel2.removeAll(); // Eliminar todos los componentes del panel2
                        }
                    });

                    back.setBounds(180, 20, 70, 15);
                    panel2.add(back);

                    JButton calcular1 = new JButton("Calcular");
                    calcular1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        	
                        	
                            int pos_x_aux = posicion_x;
                            int pos_y_aux = posicion_y;
                            
                            for (i = 0; i < filas; i++) {
                                for (x = 0; x < columnas; x++) {
                                    matrizresultado[i][x] = Integer.parseInt(matriz1[i][x].getText())
                                            - Integer.parseInt(matriz2[i][x].getText());

                                    JLabel resultadoLabel = new JLabel(" [" + matrizresultado[i][x]+"] ");
                                    resultadoLabel.setForeground(new Color(255,255,255));
                                    resultadoLabel.setBounds(pos_x_aux, pos_y_aux, 219, 25);
                                    panel2.add(resultadoLabel);

                                    pos_x_aux += 40;
                                }
                                pos_y_aux += 30;
                                pos_x_aux = posicion_x;

                            }
                            panel2.repaint(); // Actualizar el panel para que se muestren todos los resultados
                        }
                    });
                    calcular1.setForeground(new Color(255, 255, 255));
                    calcular1.setBackground(new Color(237,152,32));
                    calcular1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
                    
                    calcular1.setBounds(30, 235, 89, 23);
                    panel2.add(calcular1);
                }
            });
            
            btnNewButton_1.setForeground(new Color(255, 255, 255));
    	    btnNewButton_1.setBackground(new Color(237,152,32));
    	    btnNewButton_1.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    	     	
            btnNewButton_1.setBounds(140, 69, 89, 23);
            panel.add(btnNewButton_1);
            
            /*-------------------------------------------------------------------*/
            
            JButton btnNewButton_2 = new JButton("Multiplicacion");
            btnNewButton_2.addActionListener(new ActionListener() {

                int x = 0, i = 0, j = 0;

                JTextField[][] matriz1 = new JTextField[5][5];
                JTextField[][] matriz2 = new JTextField[5][5];

                float[][] matrizresultado = new float[5][5];

                public void actionPerformed(ActionEvent e) {

                    String input1 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de filas");
                    int filas1 = Integer.parseInt(input1);

                    String input2 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de columnas");
                    int columnas1 = Integer.parseInt(input2);

                    String input3 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de filas");
                    int filas2 = Integer.parseInt(input3);

                    String input4 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de columnas");
                    int columnas2 = Integer.parseInt(input4);
                    
                    JLabel lblNewLabel = new JLabel("Calculadora");
                    lblNewLabel.setForeground(new Color(255, 255, 255));
                    lblNewLabel.setBounds(98, 11, 73, 14);
                    panel2.add(lblNewLabel);
                    
                    

                    if (columnas1 == filas2) {
                        frame.setVisible(false);
                        frame2.setVisible(true);
                        
                        

                        int count_x = 50;
                        int count_y = 100;
                        
                        JLabel MatrizAlabel = new JLabel("Matriz A");
                        MatrizAlabel.setForeground(new Color(255,255,255));
                        MatrizAlabel.setBounds(count_x, count_y-20, 73, 14);
                        panel2.add(MatrizAlabel);
                        
                        JLabel inversa = new JLabel("Multiplicar Matriz:");
       	             	inversa.setForeground(new Color(255, 255, 255));
       	             	inversa.setBounds(15, 50, 130, 14);
       	             	panel2.add(inversa);

                        for (i = 0; i < filas1; i++) {
                            for (x = 0; x < columnas1; x++) {
                                matriz1[i][x] = new JTextField();
                                matriz1[i][x].setBounds(count_x, count_y, 15, 15);
                                panel2.add(matriz1[i][x]);

                                count_x += 20;
                            }
                            count_y += 20;
                            count_x = 50;
                        }

                        count_x = columnas1 * 20 + 80;
                        count_y = 100;
                        
                        JLabel MatrizBlabel = new JLabel("Matriz B");
                        MatrizBlabel.setForeground(new Color(255,255,255));
                        MatrizBlabel.setBounds(count_x, count_y-20, 73, 14);
                        panel2.add(MatrizBlabel);

                        for (i = 0; i < filas2; i++) {
                            for (x = 0; x < columnas2; x++) {
                                matriz2[i][x] = new JTextField();
                                matriz2[i][x].setBounds(count_x, count_y, 15, 15);
                                panel2.add(matriz2[i][x]);

                                count_x += 20;
                            }
                            count_y += 20;
                            count_x = columnas1 * 20 + 80;
                        }

                        JButton back = new JButton("Back");
                        back.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                frame.setVisible(true);
                                frame2.dispose(); // Cerrar elsegundo JFrame (frame2)
                                panel2.removeAll(); // Eliminar todos los componentes del panel2
                            }
                        });

                        back.setBounds(180, 20, 70, 15);
                        panel2.add(back);

                        JButton calcular2 = new JButton("Calcular");
                        calcular2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                int[][] matriz_multiplicacion = new int[filas1][columnas2];

                                for (i = 0; i < filas1; i++) {
                                    for (x = 0; x < columnas2; x++) {
                                        matriz_multiplicacion[i][x] = 0;

                                        for (j = 0; j < columnas1; j++) {
                                            matriz_multiplicacion[i][x] += Integer.parseInt(matriz1[i][j].getText())
                                                    * Integer.parseInt(matriz2[j][x].getText());
                                        }
                                    }
                                }

                                int pos_x_aux = posicion_x;
                                int pos_y_aux = posicion_y+20;

                                for (i = 0; i < filas1; i++) {
                                    for (x = 0; x < columnas2; x++) {
                                        matrizresultado[i][x] = matriz_multiplicacion[i][x];

                                        JLabel resultadoLabel = new JLabel(" [" + matrizresultado[i][x] + "] ");
                                        resultadoLabel.setForeground(new Color(255,255,255));
                                        resultadoLabel.setBounds(pos_x_aux, pos_y_aux, 219, 25);
                                        panel2.add(resultadoLabel);

                                        pos_x_aux += 40;
                                    }
                                    pos_y_aux += 30;
                                    pos_x_aux = posicion_x;
                                }
                                panel2.repaint();
                            }
                        });
                        calcular2.setForeground(new Color(255, 255, 255));
                        calcular2.setBackground(new Color(237,152,32));
                        calcular2.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));

                        calcular2.setBounds(30, 260, 89, 23);
                        panel2.add(calcular2);
                    } else {
                        JOptionPane.showMessageDialog(frame, "Ingrese valores v�lidos");
                    }
                }
            });
            
            btnNewButton_2.setForeground(new Color(255, 255, 255));
    	    btnNewButton_2.setBackground(new Color(237,152,32));
    	    btnNewButton_2.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    	     	
            btnNewButton_2.setBounds(10, 111, 109, 23);
            panel.add(btnNewButton_2);
            
    /*------------------------------------------------------------------------*/

    	     JButton btnNewButton_3 = new JButton("Inversa");
    	     btnNewButton_3.addActionListener(new ActionListener() {
    	         int Dimension;
    	         int posicion_x_aux = posicion_x;
    	         int posicion_y_aux = posicion_y;
    	
    	         JTextField[][] Sistema = new JTextField[5][5];
    	         float[][] Inversa = new float[5][5];
    	         JLabel[][] resultadoLabels = new JLabel[5][5];
    	
    	         // Variables agregadas
    	         float Pivote;
    	         float V1;
    	         float V2;
    	
    	         // Formato decimal para mostrar solo dos decimales
    	         DecimalFormat decimalFormat = new DecimalFormat("#.00");
    	
    	         public void actionPerformed(ActionEvent e) {
    	
    	             String input1 = JOptionPane.showInputDialog(frame, "Ingrese la dimensión");
    	             Dimension = Integer.parseInt(input1);
    	
    	             frame.setVisible(false);
    	             frame2.setVisible(true);
    	             resultado.setVisible(true);
    	             
    	             JLabel lblNewLabel = new JLabel("Calculadora");
    	             lblNewLabel.setForeground(new Color(255, 255, 255));
    	             lblNewLabel.setBounds(98, 11, 73, 14);
    	             panel2.add(lblNewLabel);
    	             
    	             JLabel inversa = new JLabel("Averiguar Inversa:");
    	             inversa.setForeground(new Color(255, 255, 255));
    	             inversa.setBounds(15, 50, 130, 14);
    	             panel2.add(inversa);
    	             
    	             JButton back = new JButton("Back");
                     back.addActionListener(new ActionListener() {
                         public void actionPerformed(ActionEvent e) {
                             frame.setVisible(true);
                             frame2.dispose(); // Cerrar elsegundo JFrame (frame2)
                             panel2.removeAll(); // Eliminar todos los componentes del panel2
                         }
                     });

                     back.setBounds(180, 20, 70, 15);
                     panel2.add(back);
    	
    	             int count_x = 80;
    	             int count_y = 100;
                     
                     JLabel MatrizAlabel = new JLabel("Matriz:");
                     MatrizAlabel.setBounds(count_x, count_y-20, 73, 14);
                     MatrizAlabel.setForeground(new Color(255,255,255));
                     panel2.add(MatrizAlabel);
    	
    	             for (int i = 0; i < Dimension; i++) {
    	                 for (int j = 0; j < Dimension; j++) {
    	                     Sistema[i][j] = new JTextField();
    	                     Sistema[i][j].setBounds(count_x, count_y, 20, 20);
    	                     panel2.add(Sistema[i][j]);
    	                     count_x += 25;
    	                 }
    	                 count_y += 25;
    	                 count_x = 80;
    	             }
    	
    	             JButton calcular3 = new JButton("Calcular");
    	             calcular3.addActionListener(new ActionListener() {
    	                 public void actionPerformed(ActionEvent e) {
    	                     float[][] matrizAux = new float[Dimension][Dimension];
    	
    	                     for (int i = 0; i < Dimension; i++) {
    	                         for (int j = 0; j < Dimension; j++) {
    	                             matrizAux[i][j] = Float.parseFloat(Sistema[i][j].getText());
    	                         }
    	                     }
    	
    	                     // Inicializar matriz Inversa como matriz identidad
    	                     for (int i = 0; i < Dimension; i++) {
    	                         for (int j = 0; j < Dimension; j++) {
    	                             if (i == j) {
    	                                 Inversa[i][j] = 1;
    	                             } else {
    	                                 Inversa[i][j] = 0;
    	                             }
    	                         }
    	                     }
    	
    	                     // Eliminamos la declaración repetida de las variables Pivote, V1 y V2
    	
    	                     for (int Col = 0; Col < Dimension; Col++) {
    	                         int NoCero = 0;
    	                         int A = Col;
    	
    	                         while (NoCero == 0) {
    	                             if (Math.abs(matrizAux[A][Col]) > 0.0000001 || Math.abs(matrizAux[A][Col]) < -0.0000001) {
    	                                 NoCero = 1;
    	                             } else {
    	                                 A++;
    	                             }
    	
    	                             if (A >= Dimension) {
    	                                 resultado.setText("La matriz no tiene inversa");
    	                             }
    	                         }
    	
    	                         if (A != Col) {
    	                             for (int B = 0; B < Dimension; B++) {
    	                                 V1 = matrizAux[A][B];
    	                                 matrizAux[A][B] = matrizAux[Col][B];
    	                                 matrizAux[Col][B] = V1;
    	
    	                                 V2 = Inversa[A][B];
    	                                 Inversa[A][B] = Inversa[Col][B];
    	                                 Inversa[Col][B] = V2;
    	                             }
    	                         }
    	
    	                         Pivote = matrizAux[Col][Col];
    	
    	                         for (int B = 0; B < Dimension; B++) {
    	                             matrizAux[Col][B] = matrizAux[Col][B] / Pivote;
    	                             Inversa[Col][B] = Inversa[Col][B] / Pivote;
    	                         }
    	
    	                         for (int C1 = 0; C1 < Dimension; C1++) {
    	                             if (C1 != Col) {
    	                                 V1 = matrizAux[C1][Col];
    	
    	                                 for (int C2 = 0; C2 < Dimension; C2++) {
    	                                     matrizAux[C1][C2] = matrizAux[C1][C2] - V1 * matrizAux[Col][C2];
    	                                     Inversa[C1][C2] = Inversa[C1][C2] - V1 * Inversa[Col][C2];
    	                                 }
    	                             }
    	                         }
    	                     }
    	                     
    	                     int pos_y_inversa = posicion_y_aux+30;
    	
    	                     for (int A = 0; A < Dimension; A++) {
    	                         for (int B = 0; B < Dimension; B++) {
    	                             resultadoLabels[A][B] = new JLabel(" [" + decimalFormat.format(Inversa[A][B]) + "] ");
    	                             resultadoLabels[A][B].setForeground(new Color(255,255,255));
    	                             resultadoLabels[A][B].setBounds(posicion_x_aux, pos_y_inversa, 219, 25);
    	                             panel2.add(resultadoLabels[A][B]);
    	                             posicion_x_aux += 40;
    	                         }
    	                         pos_y_inversa += 30;
    	                         posicion_x_aux = posicion_x;
    	                     }
    	
    	                     panel2.repaint();
    	                 }
    	             });
    	             
    	             calcular3.setForeground(new Color(255, 255, 255));
    	             calcular3.setBackground(new Color(237,152,32));
    	             calcular3.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    	
    	             calcular3.setBounds(30, 280, 89, 23);
    	             panel2.add(calcular3);
    	         }
    	     });
    	     
    	     btnNewButton_3.setForeground(new Color(255, 255, 255));
    	     btnNewButton_3.setBackground(new Color(237,152,32));
    	     btnNewButton_3.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    	
    	     btnNewButton_3.setBounds(140, 111, 89, 23);
    	     panel.add(btnNewButton_3);
    	     
    /*-----------------------------------------------------------------------*/
    	     
    	     JButton btnNewButton_4 = new JButton("Escalar");
    	     btnNewButton_4.addActionListener(new ActionListener() {
    	    	 
    	    	 int x = 0, i = 0;
    	         JTextField matriz[][] = new JTextField[5][5];
    	         float matrizresultado[][] = new float[5][5];
    	     	
    	    	 public void actionPerformed(ActionEvent e) {
    	    		 	String input1 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de filas");
    	                int filas = Integer.parseInt(input1);

    	                String input2 = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de columnas");
    	                int columnas = Integer.parseInt(input2);
    	                
    	                frame.setVisible(false);
    	                frame2.setVisible(true);
    	                
    	                JLabel lblNewLabel = new JLabel("Calculadora");
    	                lblNewLabel.setForeground(new Color(255, 255, 255));
    	                lblNewLabel.setBounds(98, 11, 73, 14);
    	                panel2.add(lblNewLabel);
    	                
    	                JLabel inversa = new JLabel("Multiplicación por Escalar:");
       	             	inversa.setForeground(new Color(255, 255, 255));
       	             	inversa.setBounds(15, 50, 180, 14);
       	             	panel2.add(inversa);
    	                
    	                int count_x = 20;
    	                int count_y = 100;
    	                int sum = 0;
    	                
    	                JButton back = new JButton("Back");
    		             back.addActionListener(new ActionListener() {
    		                 public void actionPerformed(ActionEvent e) {
    		                     frame.setVisible(true);
    		                     frame2.dispose();
    		                     panel2.removeAll();
    		                 }
    		             });
    		             
    		             back.setBounds(180, 20, 70, 15);
    		             panel2.add(back);
    		             
    		             
    	                
    		             JLabel Matriz = new JLabel("Matriz:");
    		             Matriz.setForeground(new Color(255,255,255));
    		             Matriz.setBounds(count_x, count_y-20, 73, 14);
    	                 panel2.add(Matriz);
    	                 
    	                 int county = count_y;
    	                 

    	                for (i = 0; i < filas; i++) {
    	                	
    	                	sum = 20;
    	                	
    	                    for (x = 0; x < columnas; x++) {
    	                        matriz[i][x] = new JTextField();
    	                        matriz[i][x].setBounds(count_x, count_y, 15, 15);
    	                        panel2.add(matriz[i][x]);

    	                        count_x += 20;
    	                        sum+=20;
    	                    }
    	                    
    	                    count_y += 20;
    	                    count_x=20;
    	                    

    	                }
    	                
    	                JLabel Escalar = new JLabel("Escalar:");
    	                Escalar.setForeground(new Color(255,255,255));
    		             Escalar.setBounds(sum+40, county-20, 73, 14);
    	                 panel2.add(Escalar);

    	                JTextField numero=new JTextField();
    	                numero.setBounds(sum+40, county, 50, 20);
    	                panel2.add(numero);
    	                
    	                JButton calcular4 = new JButton("Calcular");
    	   	            calcular4.addActionListener(new ActionListener() {
    	   	                 public void actionPerformed(ActionEvent e) {
    	   	                	 
    	   	                	 
    	   	                	 
    	   	                	for(i=0;i<filas;i++){
    	   		                	for(x=0;x<columnas;x++){
    	   		                		matrizresultado[i][x]= Integer.parseInt(matriz[i][x].getText())* Integer.parseInt(numero.getText());
    	   		                	}
    	   		                }
    	   	                	
    	   	                	int pos_x_aux = posicion_x;
                                int pos_y_aux = posicion_y;

                                for (i = 0; i < filas; i++) {
                                    for (x = 0; x < columnas; x++) {

                                        JLabel resultadoLabel = new JLabel(" [" + matrizresultado[i][x] + "] ");
                                        resultadoLabel.setForeground(new Color(255,255,255));
                                        resultadoLabel.setBounds(pos_x_aux, pos_y_aux, 219, 25);
                                        panel2.add(resultadoLabel);

                                        pos_x_aux += 40;
                                    }
                                    pos_y_aux += 30;
                                    pos_x_aux = posicion_x;
                                }
                                panel2.repaint();
    	   	                 }
    		            });
    	   	            calcular4.setForeground(new Color(255, 255, 255));
    	                calcular4.setBackground(new Color(237,152,32));
    	                calcular4.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    		
    		            calcular4.setBounds(30, 235, 89, 23);
    		            panel2.add(calcular4);
    		                
    	                
    	                
    	     	}
    	    	 
    	     });
    	     btnNewButton_4.setForeground(new Color(255, 255, 255));
    	     btnNewButton_4.setBackground(new Color(237,152,32));
    	     btnNewButton_4.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    	     	
    	     btnNewButton_4.setBounds(30, 157, 89, 23);
    	     panel.add(btnNewButton_4);
    	     
    	     /*--------------------------------------------------------------*/
    	     
    	     JButton btnNewButton_5 = new JButton("División");
    	        btnNewButton_5.addActionListener(new ActionListener() {

    	            DecimalFormat df = new DecimalFormat("#.00");

    	            int Dimension, NoCero, Col, C1, C2, x, j, i;
    	            float Pivote, V1, V2;
    	            float matrizaux[][] = new float[5][5];
    	            float Inversa[][] = new float[5][5];
    	            JTextField matriza[][] = new JTextField[5][5];
    	            JTextField matrizb[][] = new JTextField[5][5];
    	            float matrizauxA[][] = new float[5][5];
    	            float matrizauxB[][] = new float[5][5];

    	            public void actionPerformed(ActionEvent e) {

    	                String input1 = JOptionPane.showInputDialog(frame, "Ingrese la dimension");
    	                Dimension = Integer.parseInt(input1);

    	                frame.setVisible(false);
    	                frame2.setVisible(true);
    	                
    	                JLabel lblNewLabel = new JLabel("Calculadora");
    	                lblNewLabel.setForeground(new Color(255, 255, 255));
    	                lblNewLabel.setBounds(98, 11, 73, 14);
    	                panel2.add(lblNewLabel);
    	                
    	                JLabel inversa = new JLabel("División de Matrices:");
    		             inversa.setForeground(new Color(255, 255, 255));
    		             inversa.setBounds(15, 50, 230, 14);
    		             panel2.add(inversa);

    	                int count_x = 50;
    	                int count_y = 100;
                        
                        JLabel MatrizAlabel = new JLabel("Matriz A");
                        MatrizAlabel.setForeground(new Color(255,255,255));
                        MatrizAlabel.setBounds(count_x, count_y-20, 73, 14);
                        panel2.add(MatrizAlabel);

    	                int sum = 0;

    	                for (i = 0; i < Dimension; i++) {
    	                    sum = 20;
    	                    for (x = 0; x < Dimension; x++) {
    	                        matriza[i][x] = new JTextField();
    	                        matriza[i][x].setBounds(count_x, count_y, 15, 15);
    	                        panel2.add(matriza[i][x]);

    	                        count_x += 20;
    	                        sum += 20;
    	                    }
    	                    count_y += 20;
    	                    count_x = 50;
    	                }
    	                
    	                JLabel labelSigno = new JLabel("/");
    	                labelSigno.setForeground(new Color(255, 255, 255));
    	                labelSigno.setBounds(sum+50, 110, 130, 14);
    		            panel2.add(labelSigno);
    		             
    	                sum += 80;
    	                count_x = sum;
    	                count_y = 100;
                        
                        JLabel MatrizBlabel = new JLabel("Matriz B");
                        MatrizBlabel.setForeground(new Color(255,255,255));
                        MatrizBlabel.setBounds(count_x, count_y-20, 73, 14);
                        panel2.add(MatrizBlabel);

    	                for (i = 0; i < Dimension; i++) {
    	                    for (x = 0; x < Dimension; x++) {
    	                        matrizb[i][x] = new JTextField();
    	                        matrizb[i][x].setBounds(count_x, count_y, 15, 15);
    	                        panel2.add(matrizb[i][x]);

    	                        count_x += 20;
    	                    }
    	                    count_y += 20;
    	                    count_x = sum;
    	                }

    	                JButton back = new JButton("Back");
    	                back.addActionListener(new ActionListener() {
    	                    public void actionPerformed(ActionEvent e) {
    	                        frame.setVisible(true);
    	                        frame2.dispose(); // Cerrar segundo JFrame (frame2)
    	                        panel2.removeAll(); // Eliminar todos los componentes del panel2
    	                    }
    	                });

    	                back.setBounds(180, 20, 70, 15);
                        panel2.add(back);

    	                JButton calcular5 = new JButton("Calcular");
    	                calcular5.addActionListener(new ActionListener() {
    	                    public void actionPerformed(ActionEvent e) {
    	                        for (int x = 1; x <= Dimension; x++) {
    	                            for (int j = 1; j <= Dimension; j++) {
    	                                matrizaux[x][j] = Integer.parseInt(matrizb[x - 1][j - 1].getText());
    	                                matrizauxA[x][j] = Integer.parseInt(matriza[x - 1][j - 1].getText());
    	                            }
    	                        }

    	                        for (C1 = 1; C1 <= Dimension; C1++) {
    	                            for (C2 = 1; C2 <= Dimension; C2++) {
    	                                if (C1 == C2) {
    	                                    Inversa[C1][C2] = 1;
    	                                } else {
    	                                    Inversa[C1][C2] = 0;
    	                                }
    	                            }
    	                        }

    	                        for (Col = 1; Col <= Dimension; Col++) {
    	                            NoCero = 0;
    	                            x = Col;
    	                            while (NoCero == 0) {
    	                                if ((Math.abs(matrizaux[x][Col]) > 0.0000001) || ((Math.abs(matrizaux[x][Col]) < -00.0000001))) {
    	                                    NoCero = 1;
    	                                } else {
    	                                    x++;
    	                                }
    	                            }

    	                            Pivote = matrizaux[x][Col];

    	                            for (C1 = 1; C1 <= Dimension; C1++) {

    	                                V1 = matrizaux[x][C1];

    	                                matrizaux[x][C1] = matrizaux[Col][C1];

    	                                matrizaux[Col][C1] = V1 / Pivote;

    	                                V2 = Inversa[x][C1];

    	                                Inversa[x][C1] = Inversa[Col][C1];

    	                                Inversa[Col][C1] = V2 / Pivote;
    	                            }

    	                            for (C2 = Col + 1; C2 <= Dimension; C2++) {

    	                                V1 = matrizaux[C2][Col];

    	                                for (C1 = 1; C1 <= Dimension; C1++) {

    	                                    matrizaux[C2][C1] = matrizaux[C2][C1] - V1 * matrizaux[Col][C1];
    	                                    Inversa[C2][C1] = Inversa[C2][C1] - V1 * Inversa[Col][C1];

    	                                }
    	                            }
    	                        }

    	                        /* Se diagonaliza la matriz triangular superior */
    	                        for (Col = Dimension; Col >= 1; Col--) {

    	                            for (C1 = (Col - 1); C1 >= 1; C1--) {

    	                                V1 = matrizaux[C1][Col];

    	                                for (C2 = 1; C2 <= Dimension; C2++) {

    	                                    matrizaux[C1][C2] = matrizaux[C1][C2] - V1 * matrizaux[Col][C2];
    	                                    Inversa[C1][C2] = Inversa[C1][C2] - V1 * Inversa[Col][C2];

    	                                }
    	                            }
    	                        }

    	                        float matriz_multiplicacion[][] = new float[Dimension + 1][Dimension + 1];

    	                        for (j = 1; j <= Dimension; j++) {

    	                            for (x = 1; x <= Dimension; x++) {

    	                                matriz_multiplicacion[j][x] = 0;

    	                                for (i = 1; i <= Dimension; i++) {

    	                                    matriz_multiplicacion[j][x] += (float) (matrizauxA[j][i] * Inversa[i][x]);

    	                                }

    	                            }
    	                        }

    	                        int pos_x_aux = 25;
    	                        int pos_y_aux = 160;

    	                        for (int i = 0; i < Dimension; i++) {
    	                            for (int x = 0; x < Dimension; x++) {
    	                                JLabel resultadoLabel = new JLabel(
    	                                        " [" + df.format(matriz_multiplicacion[i + 1][x + 1]) + "] ");
    	                                
    	                                resultadoLabel.setBounds(pos_x_aux, pos_y_aux, 219, 25);
    	                                resultadoLabel.setForeground(new Color(255,255,255));
    	                                panel2.add(resultadoLabel);

    	                                pos_x_aux += 45;
    	                            }
    	                            pos_y_aux += 30;
    	                            pos_x_aux = 25;
    	                        }
    	                        panel2.repaint();

    	                    }
    	                });
    	                calcular5.setForeground(new Color(255, 255, 255));
    	                calcular5.setBackground(new Color(237,152,32));
    	                calcular5.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
    	                
    	                calcular5.setBounds(30, 260, 89, 23);
    	                panel2.add(calcular5);

    	            }
    	        });
    	        
    	        btnNewButton_5.setForeground(new Color(255, 255, 255));
       	     	btnNewButton_5.setBackground(new Color(237,152,32));
       	     	btnNewButton_5.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
       	     	
    	    btnNewButton_5.setBounds(140, 157, 89, 23);
    	    panel.add(btnNewButton_5);
    	    
    	    JButton btnNewButton_6 = new JButton("Determinante");
            btnNewButton_6.addActionListener(new ActionListener() {
            	
            	

                JTextField[][] matrizAux = new JTextField[5][5];

                int x, i, k, j, l, recorrido, orden;
                double resultadoA; // Change the data type to double for floating-point calculation

                DecimalFormat df = new DecimalFormat("#.00");

                public void actionPerformed(ActionEvent e) {

                    String input1 = JOptionPane.showInputDialog(frame, "Ingrese la dimension");
                    orden = Integer.parseInt(input1);

                    frame.setVisible(false);
                    frame2.setVisible(true);
                    
                    resultado.setVisible(true);
                    
                    JLabel lblNewLabel = new JLabel("Calculadora");
                    lblNewLabel.setForeground(new Color(255, 255, 255));
                    lblNewLabel.setBounds(98, 11, 73, 14);
                    panel2.add(lblNewLabel);

                    JButton back = new JButton("Back");
                    back.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            frame.setVisible(true);
                            frame2.dispose(); // Cerrar segundo JFrame (frame2)
                            panel2.removeAll(); // Eliminar todos los componentes del panel2
                        }
                    });
                    
                    JLabel det = new JLabel("Hallar determinante:");
                    det.setForeground(new Color(255, 255, 255));
                    det.setBounds(15, 50, 180, 14);
    	            panel2.add(det);

                    back.setBounds(190, 20, 70, 15);
                    panel2.add(back);

                    int count_x = 80;
                    int count_y = 100;
                    
                    JLabel MatrizAlabel = new JLabel("Matriz:");
                    MatrizAlabel.setForeground(new Color(255,255,255));
                    MatrizAlabel.setBounds(count_x, count_y-20, 73, 14);
                    panel2.add(MatrizAlabel);

                    double sum = 0; // Change the data type to double for floating-point values

                    for (i = 0; i < orden; i++) {
                        sum = 20;
                        for (x = 0; x < orden; x++) {
                            matrizAux[i][x] = new JTextField();
                            matrizAux[i][x].setBounds(count_x, count_y, 20, 20);
                            panel2.add(matrizAux[i][x]);

                            count_x += 25;
                            sum += 25;
                        }
                        count_y += 25;
                        count_x = 80;
                    }

                    JButton calcular6 = new JButton("Calcular");
                    calcular6.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e) {
                        	
                        	

                            double matriz[][] = new double[5][5]; // Change the data type to double for the matrix

                            for (x = 0; x < orden; x++) {
                                for (j = 0; j < orden; j++) {
                                    matriz[x][j] = Double.parseDouble(matrizAux[x][j].getText()); // Parse input as double
                                }
                            }

                            recorrido = orden - 1;

                            resultadoA = matriz[1][1];
                            int sign = 1; // Variable to track the sign changes

                            for (k = 0; k < recorrido; k++) {
                                l = k + 1;
                                for (i = l; i < orden; i++) {
                                    for (j = l; j < orden; j++)
                                        matriz[i][j] = (matriz[k][k] * matriz[i][j] - matriz[k][j] * matriz[i][k])
                                                / matriz[k][k];
                                }
                                resultadoA = resultadoA * matriz[k + 1][k + 1];
                                sign *= Math.signum(matriz[k][k]);
                            }

                            resultadoA *= sign; // Apply the sign to the determinant
                            
                            JLabel resultadoDet = new JLabel("");
                           	resultadoDet.setForeground(new Color(255,255,255));
                            resultadoDet.setBounds(posicion_x, posicion_y+70, 219, 25);
                            panel2.add(resultadoDet);
                            
                            resultadoDet.setForeground(new Color(255,255,255));
                            resultadoDet.setText("Determinante:" + df.format(resultadoA));

                        }
                    });
                    
                    calcular6.setForeground(new Color(255, 255, 255));
                    calcular6.setBackground(new Color(237,152,32));
                    calcular6.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));
                    
                    calcular6.setBounds(30, 260, 89, 23);
                    panel2.add(calcular6);

                }
            });
            
            btnNewButton_6.setForeground(new Color(255, 255, 255));
    	    btnNewButton_6.setBackground(new Color(237,152,32));
    	    btnNewButton_6.setBorder(BorderFactory.createLineBorder(new Color(237, 152, 32)));

            btnNewButton_6.setBounds(67, 201, 121, 23);
            panel.add(btnNewButton_6);
    	     
    	     

           	resultado = new JLabel("");
           	resultado.setForeground(new Color(255,255,255));
            resultado.setBounds(posicion_x, posicion_y, 219, 25);
            panel2.add(resultado);
            
            resultado.setVisible(false);
            frame.setVisible(true);
            frame2.setVisible(false);
    	}

}