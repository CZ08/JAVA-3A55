package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {
        super();
    }

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming at depth: " + swimmingDepth + " meters.");
    }

    @Override
    public String toString() {
        return "Penguin [habitat=" + habitat + ", swimmingDepth=" + swimmingDepth + "]";
    }
}
