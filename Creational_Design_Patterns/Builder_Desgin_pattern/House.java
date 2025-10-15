package Creational_Design_Patterns.Builder_Desgin_pattern;

public class House {
    private final int walls;
    private final int doors;
    private final int windows;
    private final String roof;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;

    // Private constructor to enforce object creation through the builder
    private House(HouseBuilder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", doors=" + doors +
                ", windows=" + windows +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }

    // Static nested Builder class
    public static class HouseBuilder {
        private int walls;
        private int doors;
        private int windows;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;

        public HouseBuilder setWalls(int walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
