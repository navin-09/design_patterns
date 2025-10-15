package Structural_Design_Patterns.FlyWeight_Design_Pattern;

// Concrete Flyweight (intrinsic state: character + font)
public final class CharacterGlyph implements Glyph {
    private final char character;     // intrinsic (shared)
    private final String fontName;    // intrinsic (shared)

    public CharacterGlyph(char character, String fontName) {
        this.character = character;
        this.fontName = fontName;
    }

    @Override
    public void draw(int x, int y, int size, String color) {
        // Use intrinsic (character, fontName) + extrinsic (x,y,size,color)
        System.out.printf("Draw '%c' in font %s at (%d,%d) size=%d color=%s%n",
                          character, fontName, x, y, size, color);
    }

    // equals/hashCode if needed for factory keys
    @Override 
    public int hashCode() { return 31 * Character.hashCode(character) + fontName.hashCode(); }
    
    @Override 
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterGlyph)) return false;
        CharacterGlyph that = (CharacterGlyph) o;
        return character == that.character && fontName.equals(that.fontName);
    }
}