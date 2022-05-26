public class Caneca {
    private boolean cheia;
    private Cafe cafe;

    public Caneca(boolean cheia) {
        this.cheia = cheia;
    }

    public boolean isCheia() {
        return cheia;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    public boolean getCheia(){
        return this.cheia;
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }
}
