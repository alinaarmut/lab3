public class Mashin extends Essence implements Seemed, DontHaveTime{
    public Mashin(String name) {
        super(name);
        System.out.println("Появилась машина");
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
    public void seemed(String action, String state){
        System.out.println("В конце" + " " + state + " " + action +  " "  + getName()) ;
        }

    public class Kolesa {
        public void auto(String state, String action, String toObject){
            System.out.println(state + " с шипением и треском" + " " + action + " " + "по" + " " + toObject);
        }

    }
    @Override
    public void donthavetime(String action1, String action2){
        System.out.println( "Они" + " " + action1 + " " + action2 +  " "  + "машину") ;
    }

}
