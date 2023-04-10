package tacos;

import lombok.Data;



@Data
public class Ingredient {
    public static Type Type;
    private final String id;
    private final String name;
    private final Type type;

    public enum Type {

        CHEESE, PROTEIN, SAUCE, VEGGIES, WRAP

    }


}
