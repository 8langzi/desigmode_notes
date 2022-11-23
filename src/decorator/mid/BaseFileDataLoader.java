package src.decorator.mid;

import java.io.*;

public class BaseFileDataLoader implements DataLoader{

    private String filePath;

    BaseFileDataLoader(String filePath){
        this.filePath = filePath;
    }

    @Override
    public String read() {
        char[] buffer = null;
        File file = new File(filePath);
        try(FileReader fileReader = new FileReader(file)){
            buffer = new char[(int)file.length()];
            fileReader.read(buffer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new String(buffer);
    }

    @Override
    public void write(String data) {
        File file = new File(filePath);
        try(OutputStream fos = new FileOutputStream(file)){
            fos.write(data.getBytes(),0,data.length());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
