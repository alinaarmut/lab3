
public class Bublic extends Essence implements Goable, Angries {

        public Bublic(String name){
            super(name);
            System.out.println("Бублик присоединился к истории");
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


    public void go(String toObject, String action) {
            System.out.println( getName() + " приехал " + action);
        }
    @Override
        public void angry(String state, String byObject) {
            System.out.println( getName() + " " + state +  " и отошел " + byObject);

        }
    @Override
    public void go(String action) {
        System.out.println( getName() + " " + action);
    }
    @Override
    public void start(String action, String Object) {
        System.out.println( getName() + " " + action + "им" + " " + Object );

    }





}


