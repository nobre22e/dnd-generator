package races;

public class Dragonborn extends Race {

	public Dragonborn() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(STR, 2);
		super.abilityInc.put(CHA, 1);
		
		super.size = MED;
		
		super.speed = 30;
		
		super.languages.add("Common");
		super.languages.add("Draconic");
		
		super.hasDarkvision = false;
		
		super.raceName = "Dragonborn";
	}

}
