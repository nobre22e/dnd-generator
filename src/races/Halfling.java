package races;

public class Halfling extends Race {

	public Halfling() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(DEX, 2);
		
		super.size = MED;
		
		super.speed = 25;
		
		super.languages.add("Common");
		super.languages.add("Halfling");
		
		super.hasDarkvision = false;
		
		super.raceName = "Halfling";
	}

}
