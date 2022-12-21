
public class Story {
    public static void main(String[] args) {
        Vintic vintic;
        try {
            vintic = new Vintic("");
        } catch (NameError e ) {
            System.out.println(e.getMessage());
            vintic = new Vintic("Виньтик");
        }
        Shpuntic shpuntic = new Shpuntic("Шпуньтик");
        Bublic bublic = new Bublic("Бублик");
        Shofer shofer = new Shofer("Шофер");
        Baby baby = new Baby("Малышки");
        Kisonka kisonka = new Kisonka("Кисонька");
        Lastochka lastochka = new Lastochka("Ласточка");
        kisonka.dovolnya("была довольна");
        lastochka.dovolnya("была довольна");
        kisonka.laughin("смеялась", "злорадно");
        shpuntic.missed("на возвращение", "пропала");
        vintic.missed("на возвращение", "пропала");
        Mashin mashin = new Mashin("Машина");
        mashin.seemed("показалась", "улицы");
        Mashin.Kolesa kolesa = mashin.new Kolesa();
        kolesa.auto("Колеса", "прокатились", " улице");
        baby.goes("подошли", "к гаражу");
        bublic.go("приехал");
        bublic.angry("рассердился", "в сторону");
        bublic.go("не уехал");
        vintic.start(" начал починять", " машину");
        shpuntic.start("начал", "машину");
        bublic.go("принялся", "помогать");
        shofer.look("увидит", "кого-то починяющего машину");
        shofer.start("начал помогать", "друзьям");
        shofer.takeMolot();
        shofer.takeNut();
        shofer.takeScrew();
        try {
            shofer.fixeed();
        } catch (ShoferIsNotReadyExpection e) {
            System.out.println(e.getMessage());
            System.out.println("Проверяем инструменты! Гайка взята? " + shofer.isNutTakeOn + "\r\n Молоток взят? "
                    + shofer.isMolotTakeOn + "\r\n Винтик взят? " + shofer.isScrewTakeOn);
        }

        shofer.fixed(Instruments.gaika);
        shofer.fixed(Instruments.molot);
        shofer.fixed(Instruments.bolt);



        shofer.start(" давал","советы");
        mashin.donthavetime("не успели", "починить");



        class Sineglazka{
            public void came(String name, String state){
                System.out.println();
            }
        }
        Sineglazka sineglazka2 = new Sineglazka(){
            public void came(String name, String state){
                System.out.println("На следующее утро" + " " + name + " " + state + " " + "что, малыши" + " " +"ведут себя примерно " );

            }
        };
        sineglazka2.came("Синеглазка", "пришла и рассказала");


    }
}
