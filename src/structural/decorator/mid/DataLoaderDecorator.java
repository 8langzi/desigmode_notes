package src.structural.decorator.mid;

public class DataLoaderDecorator implements DataLoader{

    private DataLoader wrapper;

    DataLoaderDecorator(DataLoader dataLoader){
        this.wrapper = dataLoader;
    }

    @Override
    public String read() {
        return wrapper.read();
    }

    @Override
    public void write(String data) {
        wrapper.write(data);
    }
}
