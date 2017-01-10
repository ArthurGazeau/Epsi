package fr.bouton.factory;

import javax.swing.JButton;
import fr.bouton.BoutonT1;

public class BoutonT1Factory implements ButtonFactory{

	@Override
	public JButton bouton() {
		BoutonT1 boutonT1 = new BoutonT1();
		return boutonT1;
	}


}
