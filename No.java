public class No {
	private Disciplina d;
	private No prox;
	
	public No(Disciplina r) {
		this.d = r;
		this.prox = null;
	}

	public Disciplina getD() {
		return d;
	}

	public void setD(Disciplina d) {
		this.d = d;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
	
}
