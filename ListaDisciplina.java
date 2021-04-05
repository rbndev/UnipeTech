public class ListaDisciplina {
	private No first;
	private No last;
	private int sizeNo;
	
	public ListaDisciplina() {
		this.first = null;
		this.last = null;
		this.sizeNo = 0;
	}

	public No getFirst() {
		return first;
	}

	public void setFirst(No first) {
		this.first = first;
	}

	public No getLast() {
		return last;
	}

	public void setLast(No last) {
		this.last = last;
	}

	public int getSizeNo() {
		return sizeNo;
	}
	
	public void addDisc(Disciplina d){
		No newNo = new No(d);
		if(this.isEmpty()) {
			this.last = newNo;
		}
		newNo.setProx(this.first);
		this.first = newNo;
		this.sizeNo++;
	}
		
	public boolean delDisc(String materia) {
		No atual = this.first;
		No ant   = null;
		if(isEmpty()) {
			return false;
		}else {
			while((atual != null) && (!atual.getD().getMaterias().equals(materia))) {
				ant = atual;
				atual = atual.getProx();
			}
			if(atual == this.first) {
				if(this.first == this.last) {
					this.last = null;
				}
				this.first = this.first.getProx();
			}else {
				if(atual == this.last) {
					this.last = ant;
				}
				ant.setProx(atual.getProx());	
			}
			this.sizeNo--;
			return true;
		}
		
	}
	
	public String searchDisc(String materia) {
		@SuppressWarnings("unused")
		String msg = "";
		No atual = this.first;
		while((atual != null) && (!atual.getD().getMaterias().equals(materia))) {
			atual = atual.getProx();
		}
		return msg = "Materia: "+atual.getD().getMaterias()+"/n"+
					 "nota: "+atual.getD().getNota();
	}
	
	public String showDisciplinas() {
		String msg = "";
		if(isEmpty()) {
			msg = "Não possui disciplina cadastrada!\n";
		}else {
			No atual = this.first;
			while(atual != null) {
				msg += "Materia: "+atual.getD().getMaterias() + "\n"+
						"Nota: " + atual.getD().getNota()+ "\n";
				atual = atual.getProx();
			}
		}
		return msg;
	}
	
	public boolean isEmpty() {
		return (this.first == null);
	}
	
}
