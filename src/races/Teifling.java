package races;

public class Teifling extends Race {

	public Teifling() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(CHA, 2);
		super.abilityInc.put(INT, 1);
		
		super.size = MED;
		
		super.speed = 30;
		
		super.languages.add("Common");
		super.languages.add("Infernal");
		
		super.hasDarkvision = true;
		
		super.raceName = "Teifling";
	}

}
