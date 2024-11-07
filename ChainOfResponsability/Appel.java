package ChainOfResponsability;

public class Appel {
    public int level;
    public String message;

    public Appel(int level, String message) {
        this.level = level;
        this.message = message;
    }
    
    public int getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
}
