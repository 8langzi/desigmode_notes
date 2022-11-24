package src.structural.decorator.mid;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class CompressionDataDecorator extends DataLoaderDecorator{

    CompressionDataDecorator(DataLoader dataLoader) {
        super(dataLoader);
    }

    @Override
    public String read() {
        return decompress(super.read());
    }

    @Override
    public void write(String data) {
        super.write(compress(data));
    }

    private String compress(String data) {
        byte[] resultBytes = data.getBytes();
        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout,new Deflater());
            dos.write(resultBytes);
            dos.close();
            bout.close();
            return Base64.getEncoder().encodeToString(bout.toByteArray());
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }
    }

    private String decompress(String data) {
        byte[] dataBytes = Base64.getDecoder().decode(data);
        try {
            InputStream in = new ByteArrayInputStream(dataBytes);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;
            while ((b = iin.read()) != -1){
                bout.write(b);
            }
            in.close();
            iin.close();
            bout.close();
            return new String(bout.toByteArray());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }


}
