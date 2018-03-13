package races;

public class Dwarf extends Race {

	public Dwarf() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(CON, 2);
		
		super.size = MED;
		
		super.speed = 25;
		
		super.languages.add("Common");
		super.languages.add("Dwarvish");
		
		super.hasDarkvision = true;
		
		super.raceName = "Dwarf";
	}
	// TODO add race-specific features
}
