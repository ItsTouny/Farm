public class Main {
    public static void main(String[] args) {
        Rose rose1 = new Rose("karel",5,5,5);
        Tulip rose2 = new Tulip("karel",5,5,5);
        Lily rose3 = new Lily("karel",5,5,5);
        Sunflower rose4 = new Sunflower("karel",5,5,5);
        Daisy rose5 = new Daisy("karel",5,5,5);
        Poppy rose6 = new Poppy("karel",5,5,5);

        Flower flower = rose1;
        Farm farm = new Farm();
        farm.plant(rose1);
        farm.plant(rose4);
        farm.plant(rose2);
        farm.plant(rose3);
        farm.plant(rose5);
        farm.plant(rose6);

    }
}