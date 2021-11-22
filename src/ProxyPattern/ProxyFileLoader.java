package ProxyPattern;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ProxyFileLoader implements FileLoader{
    
    Map<String, File> cache = new ConcurrentHashMap<>();
    
    @Override
    public File loadFile(String name) {
        if(cache.containsKey(name)) {
            System.out.println("Returning file from cache");
            return cache.get(name);
        } else {
            System.out.println("Loading Real file ........");
            RealFileLoader loader = new RealFileLoader();
            File original = loader.loadFile(name);
            System.out.println("Path ---"+original.getAbsolutePath());
            cache.put(name, original);
            return original;
        }
    }
}
