package races;

public class HalfElf extends Race {

	public HalfElf() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(CHA, 2);
		// add any two +1
		
		super.size = MED;
		
		super.speed = 30;
		
		super.languages.add("Common");
		super.languages.add("Elvish");
		//add one extra language
		
		super.hasDarkvision = true;
		
		super.raceName = "Half-Elf";
	}

}
