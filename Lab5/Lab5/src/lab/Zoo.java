package lab;

public record Zoo(int visitors, String name, int animals, int exoticaAnimals, double square, double entranceFee) {
        private static final String country = "France";

        public Zoo(int visitors, String name, int animals) {
            this(visitors, name, animals, 13, 670.75, 0.00);
        }

        public Zoo() {
            this(14060, "Bretagne national park", 350);
        }

        @Override
        public String toString() {
            return String.format("%s with %d animals and %d exotic. %d visitors a year. " +
                    "Square is %.2f and entrance fee is %.2f euro.",
                    name, animals, exoticaAnimals, visitors, square, entranceFee
                    );
        }

        public static String getCountry() {return country;}

}
