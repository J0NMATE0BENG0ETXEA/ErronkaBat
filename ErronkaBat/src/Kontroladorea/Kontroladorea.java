package Kontroladorea;

import java.util.ArrayList;

import Eredua.Departamentu;
import Eredua.Emplegatu;
import Eredua.IrakurriFitxategi;
import Leihoak.KudeatuDepart;
import Leihoak.KudeatuEmple;
import Leihoak.MenuNagusi;
import Leihoak.PantailaDepart;
import Leihoak.PantailaEmple;

public class Kontroladorea {
	//Atributuak
	private MenuNagusi PantailaMenu;
	private PantailaDepart PantailaDepart;
	private PantailaEmple PantailaEmple;
	private KudeatuDepart PantailaKudeatuDepart;
	private KudeatuEmple PantailaKudeatuEmple;
	private Kontsultak kon = new Kontsultak();
	private IrakurriFitxategi ira = new IrakurriFitxategi();

	// ***************Bistaratzeko pantailak:********************************
	//Menu Pantaila
		public MenuNagusi getpantailaMenu() {
			return PantailaMenu;
		}

		public void setMenua(MenuNagusi nireMenua) {
			this.PantailaMenu = nireMenua;
		}

		public void bistaratuMenua() {
			PantailaMenu.setVisible(true);
			PantailaDepart.setVisible(false);
			PantailaEmple.setVisible(false);
			PantailaKudeatuEmple.setVisible(false);
			PantailaKudeatuDepart.setVisible(false);
		}
	//Pantaila Departamentuak
		
		public PantailaDepart getDepartPantaila() {
			return PantailaDepart;
		}
		
		public void setDepartPantaila(PantailaDepart nireDepart) {
			this.PantailaDepart = nireDepart;
		}
		
		public void bistaratuDepartPantaila() {
			PantailaDepart.setVisible(true);
			PantailaMenu.setVisible(false);
			PantailaEmple.setVisible(false);
			PantailaKudeatuEmple.setVisible(false);
			PantailaKudeatuDepart.setVisible(false);
		}
		
		
	//Pantaila Emplegatuak
		
		public PantailaEmple getEmplePantaila() {
			return PantailaEmple;
		}
		
		public void setEmplePantaila(PantailaEmple nireEmple) {
			this.PantailaEmple = nireEmple;
		}
		
		public void bistaratuEmplePantaila() {
			PantailaDepart.setVisible(false);
			PantailaMenu.setVisible(false);
			PantailaKudeatuEmple.setVisible(false);
			PantailaKudeatuDepart.setVisible(false);
			PantailaEmple.setVisible(true);
		}
		
	//kudeatu pantaila departamentu
		
		public KudeatuDepart getKudeatuDepartPantaila() {
			return PantailaKudeatuDepart;
		}
		
		public void setKudeatuDepartPantaila(KudeatuDepart nireDepart) {
			this.PantailaKudeatuDepart = nireDepart;
		}
		
		public void bistaratuKudeatuDepartPantaila() {
			PantailaKudeatuDepart.setVisible(true);
			PantailaEmple.setVisible(false);
			PantailaDepart.setVisible(false);
			PantailaMenu.setVisible(false);
			PantailaKudeatuEmple.setVisible(false);
			
		}
		
	//kudeatu pantaila Emplegatuak
		
		public KudeatuEmple getKudeatuEmplePantaila() {
			return PantailaKudeatuEmple;
		}
		
		public void setKudeatuEmplePantaila(KudeatuEmple nireEmple) {
			this.PantailaKudeatuEmple = nireEmple;
		}
		
		public void bistaratuKudeatuEmplePantaila() {
			PantailaKudeatuEmple.setVisible(true);
			PantailaEmple.setVisible(false);
			PantailaDepart.setVisible(false);
			PantailaMenu.setVisible(false);
			PantailaKudeatuDepart.setVisible(false);
		}
		
		
	//Botoien kudeaketa
		
		public void kargatuDepartamentuXML(){
			ira.kargatuDepartamentuXML();
			ArrayList<Departamentu> depLista = ira.getDepLista();
			for (int i = 0; i < depLista.size(); i++) {
				kon.insertDepart(depLista.get(i));
			}
		}
		
		public void kargatuDepartamentuCSV(){
			ira.kargatuDepartamentuCSV();
			ArrayList<Departamentu> depLista = ira.getDepLista();
			for (int i = 0; i < depLista.size(); i++) {
				kon.insertDepart(depLista.get(i));
			}
		}
		
		public void kargatuEmplegatuXML(){
			ira.kargatuEmplegatuXML();
			ArrayList<Emplegatu> depLista = ira.getEmpleLista();
			for (int i = 0; i < depLista.size(); i++) {
				kon.insertEmple(depLista.get(i));
			}
		}
		
		public void kargatuEmplegatuCSV(){			
			ira.kargatuEmplegatuCSV();
			ArrayList<Emplegatu> depLista = ira.getEmpleLista();
			for (int i = 0; i < depLista.size(); i++) {
				kon.insertEmple(depLista.get(i));
			}
		}
		
	
	//Bistaratu datuak pantailetan

	
	// ***************Departamentu kudeaketa:********************************
		
		

}