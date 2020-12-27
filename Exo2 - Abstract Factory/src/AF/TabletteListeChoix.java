package AF;

import java.util.ArrayList;
import java.util.List;

public class TabletteListeChoix implements ListeChoix{

	List<String> listechoix = new ArrayList<>();
	
	public TabletteListeChoix(List<String> listechoix) {
		this.listechoix = listechoix;
	}

	@Override
	public void afficher() {
		System.out.println("Liste pour Ordinateur : ");
		for(String element : listechoix) {
			
			System.out.println(element);
			
		}
		
	}

}
