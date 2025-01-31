public class Fila <T extends Object>{
    private FilaBase cauda = new FilaBase<>();
    private int tamanho;

    public void inserirInicio(T elemento){
        FilaBase t1 = new FilaBase<>();
        if(tamanho == 0){
            t1.elemento = elemento;
            this.cauda.prox = t1;
            this.cauda.ant = t1;
        }else{
            t1.elemento = elemento;
            t1.prox = cauda.prox;
            t1.ant = cauda.ant;
            cauda.prox = t1;
        }
        ++tamanho;
    }

    public T removeFim() throws Exception{
        if(tamanho == 0){
            throw new Exception("A fila está vazia");
        }
        T el = (T) cauda.ant.elemento;
        cauda.ant.ant.prox = cauda.prox;
        cauda.ant.ant.ant = cauda;
        cauda.ant = cauda.ant.ant;
        --tamanho;
        return el;
    }

    public void inserirFim(T elemento){
        FilaBase t1 = new FilaBase<>();
        if(tamanho == 0){
            t1.elemento = elemento;
            this.cauda.prox = t1;
            this.cauda.ant = t1;
        }else{
            t1.elemento = elemento;
            t1.ant = cauda.ant;
            t1.prox = cauda;
            cauda.ant = t1;
        }
        ++tamanho;
    }

    public T removeInicio() throws Exception{
        if(tamanho == 0){
            throw new Exception("A fila está vazia");
        }
        T el = (T) cauda.prox.elemento;
        cauda.prox.prox.ant = cauda.ant;
        cauda.prox = cauda.prox.prox;
        --tamanho;
        return el;
    }

    public int getTamanho(){
        return this.tamanho;
    }
}
