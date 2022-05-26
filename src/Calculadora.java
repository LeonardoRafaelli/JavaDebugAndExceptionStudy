import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws AntaException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1º num:");
        double num1 = sc.nextDouble();
        System.out.println("Digite 2º num:");
        double num2 = sc.nextDouble();
        System.out.println("Operação: " +
                "\n1 - Adição;" +
                "\n2 - Subtração;" +
                "\n3 - Multiplicação;" +
                "\n4 - Divisão.");

        try{
            switchOpcoes(sc.nextInt(), num1, num2);
        } catch (Exception idiotinha){
            System.out.println("Deu ruim meu nobreeeee\n" +
                    idiotinha.getClass().getSimpleName() + ": " +
                    idiotinha.getMessage());
        } finally {
            main(args);
        }
    }

    public static void switchOpcoes(int opcao, double num1, double num2) throws BurroException, AntaException {
        switch (opcao){
            case 1 -> System.out.println(adicao(num1, num2));
            case 2 -> System.out.println(subtracao(num1, num2));
            case 3 -> System.out.println(multiplicacao(num1, num2));
            case 4 -> System.out.println(divisao(num1, num2));
        }
    }

    private static double adicao(double num1, double num2) throws BurroException{
        if(num1 == num2){
           throw new BurroException();
        }
        return num1 + num2;
    }
    private static double subtracao(double num1, double num2){
        return num1 - num2;
    }
    private static double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    private static double divisao(double num1, double num2) throws AntaException {
        if(num2 < 0){
            throw new AntaException("Não pode dividir por negativo");
        }
        return num1 / num2;
    }
}
