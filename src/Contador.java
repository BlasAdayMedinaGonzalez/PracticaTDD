

public class Contador {
    int valorInical = 0;
    int valorIncremento = 1;
    int valorlimite;

    //#region g y s
    public int getValorInical() {
        return valorInical;
    }
    public void setValorInical(int valorInical) {
        this.valorInical = valorInical;
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
        this.valorInical = valorInical;
        this.valorlimite = valorlimite;
        this.valorIncremento = valorIncremento;
    }
    public Contador(int valorlimite) {
        this.valorlimite = valorlimite;
    }
    public int incrementar() {
        while (getValorInical() < getValorlimite()) {
            this.valorInical += getValorIncremento();
        }
        return this.valorInical;
    }

    public int limite() {
        while (getValorInical() < getValorlimite()) {
            this.valorInical += getValorIncremento();
            if (getValorInical() > getValorlimite()) {
                this.valorInical = 0;
                break;
            }
        }
        return this.valorInical;
    }

    public int valorActual() {
        while (getValorInical() < getValorlimite()) {
            this.valorInical += getValorIncremento();
            System.out.println(this.valorInical);
        }
        return this.valorInical;
    }

    
}
