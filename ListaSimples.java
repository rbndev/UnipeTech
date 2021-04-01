public class ListaSimples {
    
    private No prim;
    private No ult;
    private int quantiNo;
    
    public ListaSimples(){
        this.prim = null;
        this.ult  = null;
        this.quantiNo = 0;
    }// Constructor

    public No getPrim() {
        return prim;
    }// Inicio Get and Sett

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQuantiNo() {
        return quantiNo;
    }

    public void setQuantiNo(int quantiNo) {
        this.quantiNo = quantiNo;
    }//Fim Get and Sett
    
    public void inserirPrimeiro(Aluno a){
        No novoNo = new No(a);
        if(this.eVazia()){
            this.ult = novoNo;
        }
        novoNo.setProx(this.prim);
        this.prim = novoNo;
        this.quantiNo++;
    }// Inserir Aluno
    
    
    public String imprimirLista(){
        String msg = "";
        if(eVazia()){
            msg="A lista está vazia!";
        }else{
            No atual = this.prim;
            while(atual != null){
                msg += atual.getA().getRgm() + ",";
                atual = atual.getProx();
            }
        }
        return msg;
    }
    
    public boolean eVazia(){
        return (this.prim == null);
    }
      
    
}
