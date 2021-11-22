package ProxyPattern;

import java.io.File;

public class RealFileLoader implements FileLoader {
    @Override
    public File loadFile(String name) {
        System.out.println("Creating file "+name+".........");
        return new File(name);
    }
}
