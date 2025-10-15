package Structural_Design_Patterns.FlyWeight_Design_Pattern;

// Client usage
public class Client {
    public static void main(String[] args) {
        GlyphRegistry factory = new GlyphRegistry();

        // imagine a document of thousands of characters
        String text = "ABBABBAAABBA...."; // imagine very long
        int x = 0, y = 0;

        for (char c : text.toCharArray()) {
            Glyph g = factory.getGlyph(c, "Arial"); // shared glyph per (char,font)
            g.draw(x, y, 12, "black");              // extrinsic args: position, size, color
            x += 8;
        }

        System.out.println("Unique flyweights in pool: " + factory.getPoolSize());
    }
}