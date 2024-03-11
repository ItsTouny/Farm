import java.util.ArrayList;
import java.util.HashSet;

public class Farm {
    public Farm() {
    }
    HashSet<FlowerType> types = new HashSet<>();
    private ArrayList<Flower> planted = new ArrayList<>();

    public void plant(Flower flower){
        if (types.size()<5){
            planted.add(flower);
            types.add(flower.type);
        }else throw new RuntimeException();
    }
    public void harvest(){

    }
    public boolean water(){
        return true;
    }

}
