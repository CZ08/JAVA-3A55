package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() {
        super();
    }

    public Dolphin(String habitat, float swimmingSpeed) {
        super(habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim() {
        System.out.println("This dolphin is swimming at speed: " + swimmingSpeed + " km/h.");
    }

    @Override
    public String toString() {
        return "Dolphin [habitat=" + habitat + ", swimmingSpeed=" + swimmingSpeed + "]";
    }
}
