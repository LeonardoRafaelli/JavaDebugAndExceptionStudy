public class Programador {
    private String nome;

    public Programador(String nome) {
        this.nome = nome;
    }

    public Caneca pegaCaneca(){
        return new Caneca(false);
    }

    public void bebe(Caneca caneca) throws CanecaVaziaException, WrongTemperatureException {
        if(!caneca.getCheia()){
            throw new CanecaVaziaException();
        }
        if(caneca.getCafe().getTemperatura() > 100){
            throw new WrongTemperatureException("Café quentão menor, sé louco tomar isso ai");
        }
        if(caneca.getCafe().getTemperatura() < 0){
            throw new WrongTemperatureException("Tu quer congelar teu cérebro, não é possível, boca de sacola");
        }
    }

    public void encherCaneca(Caneca caneca){
        Cafe cafezao = new Cafe();
        caneca.setCafe(cafezao);
        caneca.setCheia(true);

        double random = (Math.ceil(Math.random() * 3));
        if(random == 1){
            caneca.getCafe().setTemperatura(-50);
        } else if(random == 2){
            caneca.getCafe().setTemperatura(50);
        } else {
            caneca.getCafe().setTemperatura(250);
        }
    }

}
