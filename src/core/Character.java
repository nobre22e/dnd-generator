package core;
import java.util.ArrayList;

import backgrounds.*;
import classes.*;
import races.*;

class Character {
	private ArrayList<String> languages = new ArrayList<String>();
	private ArrayList<String> equipment = new ArrayList<String>();
	private Race race;
	private CharClass charclass;
	private Background background;

	public Character() {
		// TODO Auto-generated constructor stub
	}
	public Character(Race race, CharClass clss, Background back){
		this.race = race;
		this.charclass = clss;
		this.background = back;
		setupCharacter();
	}
	
	private void setupCharacter(){
		
	}

	public int getSpeed() {
		return race.getSpeed();
	}

	public boolean getDarkvision() {
		return race.getDarkvision();
	}

	public void addLanguage(String language) {
		languages.add(language);
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

}
