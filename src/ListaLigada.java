
public class ListaLigada {
	public nó inicio;

	public ListaLigada() {
		inicio = null;
	}

	// leva o inicio para o prox, e o novo nó pro inicio
	public void adicionaInicio(int e) {
		nó novo = new nó(e);
		novo.prox = inicio; // passo 1
		inicio = novo;
	}

	public String toString() {
		String r = "";
		nó aux = inicio;
		while (aux != null) {
			r = r + " " + aux.dado;
			aux = aux.prox;
		}
		return r;
	}

	public int removeInicio() {
		// verifica a lista e diz se esta vazia
		int r = -1;
		if (vazia()) {
			System.out.println("Erro! Sua lista esta vazia, jovem.");
			// aqui comeca a diversao
		} else {
			r = inicio.dado;
			inicio = inicio.prox;

		}
		return r;

	}

	public void adicionaFinal(int e) {
		// isso significa que foi negado, quando estiver vazia ela pula pro else
		if (!(inicio == null)) {
			nó aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = new nó(e);
		}
	}

	public int removeFinal() {
		// verifica a lista e diz se esta vazia
		int r = -1;
		if (vazia()) {
			System.out.println("Erro! Sua lista esta vazia, jovem.");
			// aqui comeca a diversao
		} else {
			// isso verifica se tem so um nó
			if (inicio.prox == null) {
				r = inicio.dado;
				inicio = null;
				// isso ocorre se tiver mais de um nó
			} else {
				nó aux1 = inicio;
				nó aux2 = null;
				// isso joga o aux 2 pro 1, e o 1 pro espaço vago, tirando o final
				while (aux1.prox != null) {
					aux2 = aux1;
					aux1 = aux1.prox;
				}
				r = aux1.dado;
				aux2.prox = null;
			}

		}
		return r;

	}

	// serve para validar se a lista e vazia
	public boolean vazia() {
		return inicio == null;
	}
}
