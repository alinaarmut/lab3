public class Shpuntic extends Essence implements Started{
    public Shpuntic(String name){
        super(name);
        System.out.println("Шпуньтик присоединился к истории");
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
    public void start(String action, String Object) {
        System.out.println(getName() + " " + action + " " + "починять" + " " + Object );
    }

}
