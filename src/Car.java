class Car {
    private final String color;
    private final int wheels;
    private final String engine;
    private final boolean leatherSeats;
    private final String style;


    private Car(String color,int wheels,String engine,boolean leatherSeats, String style) {
        this.color = color;
        this.wheels = wheels;
        this.engine = engine;
        this.leatherSeats = leatherSeats;
        this.style = style;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheels=" + wheels +
                ", engine='" + engine + '\'' +
                ", leatherSeats=" + leatherSeats +
                ", style='" + style + '\'' +
                '}';
    }

    static class Builder {
        private String color;
        private int wheels;
        private String engine;
        private boolean leatherSeats;
        private String style;

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setLeatherSeats(boolean leatherSeats) {
            this.leatherSeats = leatherSeats;
            return this;
        }

        public Builder setStyle(String style) {
            this.style = style;
            return this;
        }

        public Car build() {
            return new Car(color,wheels,engine,leatherSeats,style);
        }
    }
}
