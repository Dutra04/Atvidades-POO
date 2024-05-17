public class Main {
    public static void main(String[] args) {

        Progressao PA = new ProgressaoAritmetica(1, 2);
        System.out.println("Progressão aritmética: ");
        for (int i=0; i <=10; i++){
            System.out.println(PA.proximo());
        }
        PA.reiniciaSeq();

        Progressao PG = new ProgressaoGeometrica(2, 3);
        System.out.println("Progressão geométrica: ");
        for (int i=0; i <= 10; i++){
            System.out.println(PG.proximo());
        }
        PG.reiniciaSeq();

        Progressao Fibo = new Fibonacci();
        System.out.println("Fibonacci: ");
        for (int i=0; i<= 10; i++){
            System.out.println(Fibo.proximo());
        }
        Fibo.reiniciaSeq();
    }
}