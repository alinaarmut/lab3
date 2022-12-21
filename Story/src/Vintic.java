public class Vintic extends Essence implements Started, Missed {
    public Vintic(String name) throws NameError {
        super((name.isEmpty()) ? "Винтик" : name);
        if (!name.isEmpty()){

        System.out.println("Винтик присоединился к истории");}
        else {
            throw new NameError("Объект не смог присоединиться к истории!");

        }
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
        System.out.println(getName() + " " + action + " " + Object);


    }
    @Override
    public void missed(String state, String action){
        System.out.println( "Надежда" + " " + state + " " + getName() + " " + action );
    }
}

