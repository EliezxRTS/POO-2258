import java.util.Arrays;

public class CartonBoxNG {
    Object[] content;

    public CartonBoxNG() {
    }

    public CartonBoxNG(Object[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CartonBoxNG{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
    public void add(int position, Object object){
        content[position] = object;
    }
    public Object get(int position){
        return content[position];
    }
}
