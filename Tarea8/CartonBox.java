import java.util.Arrays;

public class CartonBox <T> {
    public static final int CAPACIDAD = 10;

    private T[] content;

    public CartonBox() {
    }

    public CartonBox(T[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CartonBox{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
    public void add(int position, T object){
        content[position] = object;
    }
    public T get(int position){
        return content[position];
    }
}