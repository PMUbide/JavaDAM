package algorithm;
import java.util.ArrayList;
import java.util.List;

public class BuscadorPar {
	private final List<Person> people;

	public BuscadorPar(List<Person> people) {
		this.people = people;
	}

	public Par find(Criteria criteria) {
//		Optional 
		List<Par> pares = new ArrayList<Par>();

		for (int i = 0; i < people.size() - 1; i++) {
			for (int j = i + 1; j < people.size(); j++) {
				Par par = new Par();
				if (people.get(i).getBirthDate().getTime() < people.get(j).getBirthDate().getTime()) {
					par.jovenPerson = people.get(i);
					par.viejoPerson = people.get(j);
				} else {
					par.jovenPerson = people.get(j);
					par.viejoPerson = people.get(i);
				}
				par.distance = par.viejoPerson.getBirthDate().getTime() - par.jovenPerson.getBirthDate().getTime();
				pares.add(par);
			}
		}

		if (pares.size() < 1) {
			return new Par();
		}

		Par resultado = pares.get(0);
		for (Par potentialResult : pares) {
			switch (criteria) {
				case Cercano :
					if (potentialResult.distance < resultado.distance) {
						resultado = potentialResult;
					}
					break;

				case Lejano :
					if (potentialResult.distance > resultado.distance) {
						resultado = potentialResult;
					}
					break;
			}
		}

		return resultado;
	}
}
