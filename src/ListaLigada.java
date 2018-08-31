
public class ListaLigada {
	public n� inicio;

	public ListaLigada() {
		inicio = null;
	}

	// leva o inicio para o prox, e o novo n� pro inicio
	public void adicionaInicio(int e) {
		n� novo = new n�(e);
		novo.prox = inicio; // passo 1
		inicio = novo;
	}

	public String toString() {
		String r = "";
		n� aux = inicio;
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
			n� aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}
			aux.prox = new n�(e);
		}
	}

	public int removeFinal() {
		// verifica a lista e diz se esta vazia
		int r = -1;
		if (vazia()) {
			System.out.println("Erro! Sua lista esta vazia, jovem.");
			// aqui comeca a diversao
		} else {
			// isso verifica se tem so um n�
			if (inicio.prox == null) {
				r = inicio.dado;
				inicio = null;
				// isso ocorre se tiver mais de um n�
			} else {
				n� aux1 = inicio;
				n� aux2 = null;
				// isso joga o aux 2 pro 1, e o 1 pro espa�o vago, tirando o final
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
