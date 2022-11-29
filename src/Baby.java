public class Baby extends Essence {
    public Baby(String name) {
        super(name);
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
    @Override
    public void goes(String action, String toObject) {
        System.out.println("Когда" + " " + getName() + " " + action + " " + toObject );
    }
}