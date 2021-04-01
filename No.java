public class No {
    
    private Aluno a;
    private No prox;
    
    public No(Aluno al){
        this.a = al;
        this.prox = null;
    }// Constructor

    public Aluno getA() {
        return a;
    }

    public void setA(Aluno a) {
        this.a = a;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
        
}
