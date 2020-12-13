package Advanced.classes.StaticKlases;

public class Bicykle {

    private int maxSpeed;

    public Bicykle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    //isorine klase gali buti nesukurta
    //gali egzistuoti viena be kitos
    //veikia kaip atskiros klases
    // nested class
    public static class Mechnic {
        public void upgrade(Bicykle bicycle){
            bicycle.maxSpeed += 3;
        }
    }
}
