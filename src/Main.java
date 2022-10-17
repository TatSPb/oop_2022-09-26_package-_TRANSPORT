import Transport.Bus;
import Transport.Car;
import Transport.Motorcar;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********* class MOTORCAR *********");

        Motorcar kiaSportage = new Motorcar("KIA", "SPORTAGE", 2022, "Korea", 280, "Violet");
        Motorcar huyndaiAvante = new Motorcar(
                "HYUNDAI",
                "ADVANCE",
                2020,
                "Korea",
                "Yellow",
                150,
                1.2,
                "manual",
                "sedan",
                "g258gg178",
                5,
                false
        );


        /***** CAR СТРАХОВКА И ДОСТУП ****/
        Car.Insurance ladaGrandeIns = new Car.Insurance(null, 3263.23, "#2398");
        System.out.println(ladaGrandeIns);

        kiaSportage.refill();

        System.out.println("\n********* class TRAIN *********");

        Train lastochka = new Train(
                "Lastochka",
                "B-901",
                2011,
                "Russia",
                null,
                301,
                3500,
                1,
                "Belorusskiy vokzal",
                "Minsk-Passazhirskiy",
                11);
        lastochka.refill();

        Train leningrad = new Train(
                "Leningrad",
                "D-125",
                2019,
                "Russia",
                null,
                270,
                1700,
                1,
                "Liningradskiy vokzal",
                "Leningrad-Passazhirskiy",
                8);
        leningrad.refill();

        System.out.println("\n********* class BUS *********");
        Bus liaz5292 = new Bus("LiAZ", "5292", 2020, "Russia", 90, "pink");
        Bus paz3205 = new Bus("PAZ", "3205", 2022, "Russia", 110, "white");
        Bus nefaz3205 = new Bus("NEFAZ", "5299", 2021, "Russia", 120, "blue");
        liaz5292.refill();
    }

}