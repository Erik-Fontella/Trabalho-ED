public class Noh {
    private Object info; 
    private Noh prox;

    public Noh(Object info) {
        this.info = info;
        this.prox = null;
    }

    public Object getInfo() {
        return this.info;
    }
    public Noh getProx() {
        return this.prox;
    }
    
    public void setProx(Noh n) {
        this.prox = n;
    }
}