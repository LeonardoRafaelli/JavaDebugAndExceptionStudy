import java.util.concurrent.CancellationException;

public class CafeSystem {

    static Programador pessoa = new Programador("Leozin");
    public static void main(String[] args) {
        try{
            rotina();
        }catch (Exception exception){
            System.out.println("Erro: " + exception.getClass().getSimpleName() + ": " + exception.getMessage());
        }
    }

    public static void rotina(){
        Caneca caneca = pessoa.pegaCaneca();
        try{
            pessoa.bebe(caneca);
        } catch (Exception exception){
            System.out.println("Bebi da caneca mas estava vazia :(");
            System.out.println("Erro: " + exception.getClass().getSimpleName() + ": " + exception.getMessage());
            System.out.println("Eu sei!! >:(");
        } finally {
            pessoa.encherCaneca(caneca);
            System.out.println("Enchi a caneca :)");
        }

        try{
            pessoa.bebe(caneca);
            System.out.println("Café tava bonzão na real ta ligado! :)");
        }catch (Exception exception){
            if(caneca.getCafe().getTemperatura() > 100){
                System.out.println("Café quentão viado, ta doido!");
            }
            if(caneca.getCafe().getTemperatura() < 0){
                System.out.println("Café com gelo é isso aqui???");
            }
            System.out.println("Erro: " + exception.getClass().getSimpleName() + ": " + exception.getMessage());
        } finally {
            System.out.println("Temperatura do café: " + caneca.getCafe().getTemperatura() + "ºC");
        }
    }

}
