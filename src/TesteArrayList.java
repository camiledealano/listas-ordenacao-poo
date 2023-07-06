import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TesteArrayList extends JFrame {
	
	private JTextArea areaDeNomes;
	private JButton btnAlimentar;
	private ArrayList<String> arlNomes = new ArrayList<String>();
	
	public TesteArrayList() {
		setSize(500, 500);
		setLayout(null);
		componentesCriar();
		setVisible(true);
	}
	
	private void componentesCriar() {
		areaDeNomes = new JTextArea();
		areaDeNomes.setBounds(10, 10, 200, 450);
		getContentPane().add(areaDeNomes);
		
		btnAlimentar = new JButton(new AbstractAction() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] linhas = areaDeNomes.getText().split("\n");
				for (String l : linhas) {
					arlNomes.add(l);
				}
			}
		});
		btnAlimentar.setBounds(220, 10, 100, 25);
		getContentPane().add(btnAlimentar);
	}

	public static void main(String[] args) {
		new TesteArrayList();
	}

}






