package projet.modele.decorateurs;

import java.util.Vector;

import mesmaths.mecanique.MecaniquePoint;
import projet.modele.Bille;
import projet.modele.BilleDecorateur;

public class Frottement extends BilleDecorateur {

	public Frottement(Bille next) {
		super(next);
	}

	@Override
	public void gestionAccélération(Vector<Bille> billes) {
		this.getNext().gestionAccélération(billes);
		this.getAccélération().ajoute(MecaniquePoint.freinageFrottement(this.masse(), this.getVitesse()));	
	}
}
