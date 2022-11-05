package src.builder.simple;

public class BuilderTest {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.construct(builder);
        System.out.println(builder.getResult());
    }

}
