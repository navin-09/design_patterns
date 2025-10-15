package Structural_Design_Patterns.FlyWeight_Design_Pattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GlyphRegistry {
    private final Map<String, Glyph> pool = new ConcurrentHashMap<>();

    // key can be char + fontName
    public Glyph getGlyph(char c, String fontName) {
        String key = c + "|" + fontName;
        // computeIfAbsent is atomic in ConcurrentHashMap
        return pool.computeIfAbsent(key, k -> new CharacterGlyph(c, fontName));
    }

    public int getPoolSize() {
        return pool.size();
    }
}


