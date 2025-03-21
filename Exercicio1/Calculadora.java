public class Calculadora {

    public static double adicao(double a, double b){
        return a + b;
    }

    public static double subtracao(double a, double b){
        return a - b;
    }
    public static double multiplicacao(double a, double b){
        return a * b;
    }
    public static double divisao(double a, double b){
        if(b == 0){
            System.out.println("Erro! Divisão por zero!");
            return 0;

        }
        return a / b;
    }
}

