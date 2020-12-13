package Advanced.classes.NonStaticKlases;

public class Bicykle {

    private int maxSpeed;

    public Bicykle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
        }

        //isorine klase butina, kad galetum sukurti.
        //neveiks be isorines klases
        //inner class
    public class Wheel {
        public void damage() {
            maxSpeed *= 0.5;
        }
    }
}
