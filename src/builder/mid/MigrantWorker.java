package src.builder.mid;

public class MigrantWorker {

    private String name;

    private int age;

    private String phone;

    private String gender;

    MigrantWorker(){}

    public static MigrantWorker builder(){
        return new MigrantWorker();
    }

    public MigrantWorker age(int age){
        this.age = age;
        return this;
    }

    public MigrantWorker name(String name){
        this.name = name;
        return this;
    }

    public MigrantWorker phone(String phone){
        this.phone = phone;
        return this;
    }

    public MigrantWorker gender(String gender){
        this.gender = gender;
        return this;
    }

    public MigrantWorker build() {
        validateObject(this);
        return this;
    }

    public void validateObject(MigrantWorker migrantWorker){}

    @Override
    public String toString() {
        return "MigrantWorker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
