public class Pilha {
    public static void main(String[] args) {
        System.out.println("Início main");
        try{
            chamada1();
        } catch(Exception exception){
            System.out.println("Deu ruim no vééétor  " +
                    exception.getMessage() +
                    "  -  " + exception.getMessage()
                    + "  -  " + exception.getClass().getSimpleName());
            exception.printStackTrace();
        }
//        catch (ArithmeticException exception){
//            System.out.println("Deu ruim na conta pae  " + exception.getMessage() +
//                    "  -  " + exception.getCause()
//                    + "  -  " + exception.getClass());
//            exception.printStackTrace();
//        }
        System.out.println("Fim main");
    }

    private static void chamada1() {
        System.out.println("Início primeira chamada!");
        int[] vetor = new int[2];

        for (int i = 0; i <= vetor.length; i++) {
                vetor[i] = chamada2(i);
                System.out.println("Deu ruim na conta");
        }


        System.out.println("Fim primeira chamada!");
    }

    private static int chamada2(int i) {
        System.out.println("Início segunda chamada!");
        chamada3();
        System.out.println("Fim segunda chamada!");
        return i/0;
    }

    private static void chamada3() {
        System.out.println("Início terceira chamada!");
        System.out.println("Fim terceira chamada!");
    }

}
