package designpattern.factory;

public class StarWarsFactory {

	public Villian createEnemy(String enemyType) {
		if (enemyType.trim().equalsIgnoreCase("D")) {
			return new DarthVader();
		} else if (enemyType.trim().equalsIgnoreCase("DO")) {
			return new Dooku();
		} else if (enemyType.trim().equalsIgnoreCase("K")) {
			return new Kylo();
		} else
			return null;
	}

}
