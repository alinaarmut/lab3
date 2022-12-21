public class Kisonka extends Essence implements Dovolni, Laughing {
    public Kisonka(String name) {
        super(name);
        System.out.println("Кисонька присоединилась к истории");
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Имя: " + getName();
    }

    public void dovolnya(String Object){
        System.out.println(getName() + " " + Object + " " + ",что они исчезли");

    }

    @Override
    public void laughin(String action, String asObject) {
        System.out.println(getName() + " " + asObject + " " + action);

    }
}
