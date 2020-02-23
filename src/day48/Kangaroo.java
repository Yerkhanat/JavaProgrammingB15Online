package day48;

public class Kangaroo implements Bouncible,BoxerWithBellyPouch {
    String name;
    int jumpDistance;
    public Kangaroo(String name, int jumpDistance){
        this.name = name;
        this.jumpDistance=jumpDistance;
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name "+name+ " carry child in the pocket");
    }

    @Override
    public void KickBox() {
        System.out.println("Kangaroo with name " + name +" is boxing.");

    }





    @Override
    public void bounce() {
        System.out.println("This " + name + " can jump " + jumpDistance
                + " meters forward and it would be nice to have " + GRAVITY + " gravity");
    } public void eat(){
        System.out.println("Kangaroo with name "+name+" is eating");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

}