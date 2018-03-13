package races;

public class Human extends Race {

	public Human() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(CHA, 1);
		super.abilityInc.put(CON, 1);
		super.abilityInc.put(DEX, 1);
		super.abilityInc.put(INT, 1);
		super.abilityInc.put(STR, 1);
		super.abilityInc.put(WIS, 1);
		
		super.size = MED;
		
		super.speed = 30;
		
		super.languages.add("Common");
		// add one extra language
		
		super.hasDarkvision = false;
		
		super.raceName = "Human";
	}

}
