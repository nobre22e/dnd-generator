package races;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Race {
	public final String CHA = "Charisma";
	public final String STR = "Strength";
	public final String CON = "Constitution";
	public final String DEX = "Dexterity";
	public final String INT = "Intelligence";
	public final String WIS = "Wisdom";
	
	public final String SM = "Small";
	public final String MED = "Medium";
	
	protected HashMap<String,Integer> abilityInc = new HashMap<String,Integer>();
	protected String size;
	protected int speed;
	protected ArrayList<String> languages = new ArrayList<String>();
	protected boolean hasDarkvision;
	protected String raceName;
	
	public Race() {
		// TODO Auto-generated constructor stub
	}
	
	public HashMap<String,Integer> getAbilityInc(){
		return this.abilityInc;
	}
	
	public boolean getDarkvision(){
		return this.hasDarkvision;
	}
	
	public int getSpeed(){
		return this.speed;
	}
	
	public String getSize(){
		return this.size;
	}
	
	public ArrayList<String> getLang(){
		return this.languages;
	}

}
