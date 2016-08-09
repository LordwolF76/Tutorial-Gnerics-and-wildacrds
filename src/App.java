import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by LordwolF on 8/8/2016.
 */
class Machine {
    @Override
    public String toString() {
        return "Machine{}";
    }

    public void start() {
        System.out.println("Starting");
    }
}

class Camera extends Machine {
    @Override
    public String toString() {
        return "Camera{}";
    }

    public void snap(){
        System.out.println("Taking Picture");
    }
}

public class App {
    public static void main(String[] args) {

        ArrayList<Machine> list = new ArrayList<>();

        list.add(new Machine());
        list.add(new Machine());

        ArrayList<Camera> list2 = new ArrayList<>();

        list2.add(new Camera());
        list2.add(new Camera());

        showList(list2);

    }

    public static void  showList(ArrayList<? extends Machine> list) {
        for(Machine value: list) {
            System.out.println(value);
            value.start();

        }

    }
}
