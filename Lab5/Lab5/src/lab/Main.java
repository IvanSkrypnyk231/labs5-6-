package lab;

public class Main {
    public static void main( String... args) {
        Zoo zoo1 = new Zoo(),
                zoo2 = new Zoo( 12466, "Nantues zoo", 641),
                zoo3 = new Zoo(61235, "Paris national zoo", 6010, 213, 45167.66, 15.50);
        System.out.println("All " + Zoo.getCountry() + " zoos:");
        System.out.println(zoo1);
        System.out.println(zoo2);
        System.out.println(zoo3);
    }
}
