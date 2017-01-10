package fr.bouton.factory;

import javax.swing.JButton;
import fr.bouton.BoutonT2;

public class BoutonT2Factory implements ButtonFactory{

	@Override
	public JButton bouton() {
		BoutonT2 boutonT2 = new BoutonT2();
		return boutonT2;
	}


}
