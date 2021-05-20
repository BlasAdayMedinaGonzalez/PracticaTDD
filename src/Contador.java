

public class Contador {
    int valorInicial = 0;
    int valorIncremento = 1;
    int valorlimite;
    int valorActual;

    //#region g y s
    public int getValorInical() {
        return valorInicial;
    }
    public void setValorInical(int valorInical) {
        this.valorInicial = valorInical;
    }
    public int getValorlimite() {
        return valorlimite;
    }
    public void setValorlimite(int valorlimite) {
        this.valorlimite = valorlimite;
    }
    public int getValorIncremento() {
        return valorIncremento;
    }
    public void setValorIncremento(int valorIncremento) {
        this.valorIncremento = valorIncremento;
    }
    //#endregion g y s 
    
    public Contador(int valorInical, int valorIncremento, int valorlimite ) {
        this.valorInicial = valorInical;
        this.valorlimite = valorlimite;
        this.valorIncremento = valorIncremento;
    }
    public Contador(int valorlimite) {
        this.valorlimite = valorlimite;
    }
    public int incrementar() {
        this.valorActual = this.valorInicial;
        if (getValorInical() < getValorlimite()) {
            this.valorActual += getValorIncremento();
        } 
        return this.valorActual;
    }

    public int limite() {
        incrementar();
        if (this.valorActual < this.valorlimite) {
            this.valorActual += getValorIncremento();
            return this.valorActual;
        } else {
            return this.valorInicial;
        }   
    }

    public int valorActual() {
        return this.valorActual;
    }

    public int resetear() {
        return this.valorActual = 0;
    }
}
