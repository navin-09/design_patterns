package Creational_Design_Patterns.ProtoType_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private static Map<String, Prototype> prototypes = new HashMap<>();

    public static void addPrototype(String key, Prototype prototype) {
        prototypes.put(key, prototype);
    }

    public static Prototype getPrototype(String key) {
        Prototype prototype = prototypes.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}