class Fibonacci extends Progressao{
    private int Numantes;
    private int Numatual;

    public Fibonacci(){
        this.Numantes=0;
        this.Numatual=1;
    }

    public int proximo(){
        int valor = Numantes;
        int proximo = Numantes+Numatual;
        Numantes=Numatual;
        Numatual=proximo;
        return valor;
    }
    public void reiniciaSeq(){
        Numantes=0;
        Numatual=1;
    }
}