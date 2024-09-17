public class InsereOrdenadoFilaPrioridade implements FilaPrioridade {

	private Pair[] fila;
	private int head;
	private int last;

	public InsereOrdenadoFilaPrioridade(int capacidade) {
		this.fila = new Pair[capacidade];
		this.last = -1;
		this.head = -1;
	}

	public boolean isEmpty() {
		return this.head == -1 && this.last == -1;
	}

	public boolean isFull() {
		return (this.last + 1) % this.fila.length == this.head;
	}
	
	// criar um Pair e inserir de forma ordenada decrescente no array.
	public void add(String elemento, int prioridade) {
		Pair pair = new Pair(elemento, prioridade);
		if(!isFull()) {
			last++;
		}
		if(isEmpty()) {
			head = 0;
		}
		if(isFull()) {
			this.head = (this.head + 1) % this.fila.length;
		}
		this.last = (this.last + 1) % this.fila.length;
		this.fila[last] = pair;
	}


	// remover e retornar o primeiro elemento do array, que é o de maior prioridade. lembrar manipular head e tail
	// para ser uma fila circular. assim a remoção fica O(1)
	public String removeNext() {
		return "";
	}

}
