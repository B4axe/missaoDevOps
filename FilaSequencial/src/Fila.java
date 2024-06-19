public class Fila {
    char[] container;
    int numElementos;
    int inicio;
    int fim;
    public Fila(int capacidade){
        this.inicio = 0;
        this.numElementos = 0;
        this.fim = -1;
        this.container = new char[capacidade];
    }
    public boolean isEmpty(){
        return numElementos == 0;
    }
    public boolean offer(char i){
        if(this.numElementos == this.container.length){
            return false;
        }
        this.fim++;
        this.fim = this.fim%this.container.length;
        this.container[this.fim] = i;
        this.numElementos++;
        return true;
    }
    public char poll(){
        char temp = this.container[this.inicio];
        this.inicio++;
        this.inicio = this.inicio%this.container.length;
        this.numElementos--;
        return temp;
    }
    public char peek(){
        return this.container[this.inicio];
    }
    public int size(){
        return this.numElementos;
    }
    public String toString(){
        String fila = "";
        int index = this.inicio;
        int i = 0;
        while(i < this.numElementos){
            index = index%this.container.length;
            fila += this.container[index] + " ";
            index ++;
            i++;
        }
        return fila;
    }
}
