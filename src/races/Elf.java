package races;

public class Elf extends Race {

	public Elf() {
		// TODO Auto-generated constructor stub
		super.abilityInc.put(DEX, 2);
		
		super.size = MED;
		
		super.speed = 30;
		
		super.languages.add("Common");
		super.languages.add("Elvish");
		
		super.hasDarkvision = true;
		
		super.raceName = "Elf";
	}

}
