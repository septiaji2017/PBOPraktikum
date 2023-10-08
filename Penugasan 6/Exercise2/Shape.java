package Exercise2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        color = "Green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        String filledStatus = filled ? "filled" : "not filled";
        return "A Shape with color of " + color + " and " + filledStatus;
    }
}
