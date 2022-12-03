public abstract class Essence {
    private String name;

    public Essence(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals (Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Имя: " + getName();
    }

    public void look(String action, String state) {
        System.out.println(getName() + action + state);
    }

    public void angry(String state, String byObject){
        System.out.println(getName() + state + byObject);
    }

    public void go(String toObject){
        System.out.println();
    }

    public void start(String action, String Object){
        System.out.println();
    }

    public void fixed(Instruments instruments){
        System.out.println();
    }

    public void goes(String action, String toObject){
        System.out.println();
    }

}
