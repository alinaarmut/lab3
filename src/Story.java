
public class Story {
    public static void main(String[] args) {
        Vintic vintic = new Vintic("Винтик");
        Shpuntic shpuntic = new Shpuntic("Шпуньтик");
        Bublic bublic = new Bublic("Бублик");
        Shofer shofer = new Shofer("Шофер");
        Baby baby = new Baby("Малышки");
        baby.goes("подошли", "к гаражу");
        bublic.go("приехал");
        bublic.angry("рассердился", "в сторону" );
        bublic.go("не уехал");
        vintic.start(" начал починять", " машину");
        shpuntic.start("начал", "машину");
        bublic.go( "принялся", "помогать");
        shofer.look("увидит", "кого-то починяющего машину");
        shofer.start("начал помогать", "друзьям" );
        shofer.fixed(Instruments.gaika);
        shofer.fixed(Instruments.molot);
        shofer.fixed(Instruments.bolt);
        shofer.start(" давал", "советы");







    }
}