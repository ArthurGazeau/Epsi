
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.bouton.factory.BoutonT1Factory;
import fr.bouton.factory.BoutonT2Factory;

public class Fenetre extends JFrame{

	public Fenetre(){

		JPanel jPanel = new JPanel();
		String[] theme = new String[] {"Theme 1", "Theme 2"
		};

		JComboBox<String> comboTheme = new JComboBox<>(theme);
		comboTheme.setSize(100, 100);
		jPanel.add(comboTheme);
		JButton bouton = new JButton("Theme 1");
		jPanel.add(bouton);

		this.setTitle("Test");
		this.setSize(400, 500);
		this.setContentPane(jPanel);

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		comboTheme.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox theme = (JComboBox) e.getSource();
				String selection = (String) theme.getSelectedItem();
				if(selection.equals("Theme 1")){
					BoutonT1Factory b1 = new BoutonT1Factory();
					jPanel.remove(1);
					jPanel.add(b1.bouton());				
				}
				else if (selection.equals("Theme 2")){
					BoutonT2Factory b2 = new BoutonT2Factory();
					jPanel.remove(1);
					jPanel.add(b2.bouton());	
				}
				jPanel.repaint();
				jPanel.revalidate();
			}
		});

	}

	public static void main(String []args){
		Fenetre fen = new Fenetre();
	}

}
