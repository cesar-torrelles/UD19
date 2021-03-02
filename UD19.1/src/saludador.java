
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class saludador extends JFrame {
	
	private JPanel contentPane;
	public saludador() {
		
		//añadimos titulo
		setTitle("Saludador App");
		
		//añadimos coordenadas  X/Y al contenedor
		setBounds(400,20,370,300);
		
		
		//indicamos que se cierre cuando termine 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//indicamos que sea visible
		setVisible(true);
		
		//creamos el panel
		contentPane =new JPanel();
		
		//indicamos el diseño
		contentPane.setLayout(null);
		
		// hacemos que aparezca en el centro
		setLocationRelativeTo(null);
		
		//asigamos panel a la ventana
		setContentPane(contentPane);
		
		
		//creacion de componentes
		
		JLabel etiqueta=new JLabel("Escriba su nombre");
		
		//colocamos el componente
		
		etiqueta.setBounds(102, 31, 150, 20);
		
		//añadimos el elemento al panel
		contentPane.add(etiqueta);
		
		
		//creacion de campo de texto
		
		JTextField textField = new JTextField();
		textField.setBounds(79, 62, 200, 20);
		contentPane.add(textField);
		
		
		//creacion de boton
		
		JButton btnPulsame = new JButton ("Saludar!");
		
		btnPulsame.setBounds(130, 93, 90, 23);
		contentPane.add(btnPulsame);
		
		btnPulsame.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
			JOptionPane.showMessageDialog(null,"Hola  " + textField.getText() );
			
			}
				
		});
		
}
}
	


