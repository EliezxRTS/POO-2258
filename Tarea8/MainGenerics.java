import java.util.ArrayList;

public class MainGenerics {
    public static void main(String[] args){
        System.out.println("-----Caja Generico-----");

        CartonBox<String> cartonBox001 = new CartonBox<>(new String[10]);
        cartonBox001.add(0, "Lapiz");
        cartonBox001.add(1, "Pluma");
        cartonBox001.add(2, "Boligrafo");
        System.out.println(cartonBox001);
        String temp001 = cartonBox001.get(0);

        System.out.println("-----Caja No Generico-----");

        CartonBoxNG cartonBoxNG001 = new CartonBoxNG(new Object[10]);
        cartonBoxNG001.add(0,"Aura");
        cartonBoxNG001.add(1,"Sara");
        cartonBoxNG001.add(2,"Amy");
        System.out.println(cartonBoxNG001);
        String temp002 = (String)cartonBoxNG001.get(0);

        System.out.println("-----Caja comida-----");

        CartonBox<Food> foodCartonBox001 = new CartonBox<>(new Food[10]);
        foodCartonBox001.add(0,new Food("Ensalada",false));
        System.out.println(foodCartonBox001.get(0));

        System.out.println("-----Array comida-----");

        ArrayList<Food> foodArrayList001 = new ArrayList<>();
        foodArrayList001.add(new Food("Fresa",false));
        foodArrayList001.add(new Food("Frambuesa",false));
        foodArrayList001.add(new Food("Mora",false));
        foodArrayList001.add(new Food("Mora azul",false));
        foodArrayList001.add(new Food("Zarzamora",false));
        foodArrayList001.add(new Food("Arandano",false));
        System.out.println(foodArrayList001.size());
        System.out.println(foodArrayList001.get(4));

        System.out.println("-----Array comida2-----");

        ArrayList<Food> foodArrayList002 =new ArrayList<>();
        foodArrayList002.add(new Food("Doritos",true));
        foodArrayList002.add(new Food("Runners",true));
        foodArrayList002.add(new Food("Lays",true));
        foodArrayList002.add(new Food("Chips",true));
        foodArrayList002.add(new Food("Pringles",true));
        System.out.println(foodArrayList002.get(1));
        foodArrayList002.set(1,new Food("Pina",false));
        for (Food food :
                foodArrayList002) {
            System.out.println(food);
        }
        System.out.println("-----Array final comida2-----");

        foodArrayList002.add(1,new Food("Sandia",false));
        for (Food food :
                foodArrayList002) {
            System.out.println(food);
        }
    }
}
