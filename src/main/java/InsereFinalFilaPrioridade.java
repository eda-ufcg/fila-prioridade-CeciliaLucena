import java.util.ArrayList;

public class InsereFinalFilaPrioridade implements FilaPrioridade {

	private ArrayList<Pair> fila;

	public InsereFinalFilaPrioridade(int capacidade) {
		this.fila = new ArrayList<Pair>(capacidade);
	}
	
	// criar um Pair e adicionar no fim da fila
	public void add(String elemento, int prioridade) {
		Pair pair = new Pair(elemento, prioridade);
		this.fila.add(pair);
	}


	// buscar pelo elemento de maior prioridade na fila.
	public String removeNext() {
		if(!fila.isEmpty()){
			Pair maiorPriori = this.fila.get(0);
			for(int i = 1; i < fila.size(); i++) {
				if(fila.get(i).getPrioridade() > maiorPriori.getPrioridade()) {
					maiorPriori = fila.get(i);
				}
			}

			return maiorPriori.getElemento();
		}
		return "Fila vazia.";
	}

}
