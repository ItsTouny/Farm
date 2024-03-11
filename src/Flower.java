public abstract class Flower {
    public Flower(String name, double price, double neededArea, double chanceOfGrowth, FlowerType type) {
        Farm farm = new Farm();
        this.name = name;
        this.price = price;
        this.neededArea = neededArea;
        if (farm.water()){
            this.chanceOfGrowth = chanceOfGrowth*2;
        }else this.chanceOfGrowth = chanceOfGrowth;
        this.type = type;

    }
    protected FlowerType type;
    protected String name;
    protected double price;
    protected double neededArea;
    protected double chanceOfGrowth;

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", neededArea=" + neededArea +
                ", chanceOfGrowth=" + chanceOfGrowth +
                '}';
    }

}
