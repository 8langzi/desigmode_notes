package src.structural.decorator.mid;

public class Test {

    public static void main(String[] args) {
        String testInfo = "Name, testInfo \nLIH, 10000\nMax,9000";
        DataLoaderDecorator encoded = new CompressionDataDecorator(new EncryptionDataDecorator(new BaseFileDataLoader("demo.txt")));
        encoded.write(testInfo);

        DataLoader loader = new BaseFileDataLoader("demo.txt");

        System.out.println("输入-------------------");
        System.out.println(testInfo);
        System.out.println("- 加密+压缩 写入文件-----------------");
        System.out.println(loader.read());
        System.out.println("- 解密+解压 -----------------------");
        System.out.println(encoded.read());

    }

}
