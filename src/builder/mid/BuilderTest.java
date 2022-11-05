package src.builder.mid;

public class BuilderTest {

    public static void main(String[] args) {
        MigrantWorker migrantWorker = MigrantWorker.builder()
                .age(1)
                .name("test1")
                .gender("女")
                .phone("13213215544")
                .build();
        System.out.println(migrantWorker.toString());
    }

}
