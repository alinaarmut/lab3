public class Shofer extends Essence implements Fixxed, Looking, Started{
    String name;
    boolean isNutTakeOn;
    boolean isMolotTakeOn;
    boolean isScrewTakeOn;
    public Shofer(String name) {
        super(name);
        System.out.println("Шофер присоединился к истории");
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
    public void look(String action, String state) {
        System.out.println(getName() + " " + action + " " + state);
    }


    @Override
        public void start(String action, String Object) {
            System.out.println(getName() + " " + action  + " " + Object);
    }

    
    @Override
    public void fixed (Instruments instruments) {
        System.out.print(getName() + " " + " стал подвинчивать");
        switch (instruments) {
            case gaika -> System.out.println(" " + "гайку");
            case bolt -> System.out.println(" " + "болт");
            case molot -> System.out.println(" " + "молот");
        }
    }
        public void takeNut() {

            System.out.println("Гайка взята!");
            this.isNutTakeOn = true;
        }

        public void takeMolot() {

            System.out.println("Молот взят!");
            this.isMolotTakeOn = true;
        }

        public void takeScrew() {
            System.out.println("Винтик взят!");
            this.isScrewTakeOn = true;
        }

    public void fixeed() throws ShoferIsNotReadyExpection {
            if (isScrewTakeOn && isMolotTakeOn && isNutTakeOn) {
                System.out.println(getName() + " " + " готов чинить машину");
            } else {
                throw new ShoferIsNotReadyExpection( getName() + " не готов чинить");
            }
        }
}
