package Practice_4;

/**
 * Created by jarek on 02.07.2017.
 */
public class MultiDisplay {
    private String message;
    private int value;

    public MultiDisplay() {
        message = "";
        value = 0;
    }
    public void setDisplayMessage(String text) {
        this.message = text;
    }

    public void setDisplayCount(int number) {
        this.value = number;
    }

    public String getDisplayMessage() {
        return this.message;
    }

    public int getDisplayValue() {
        return this.value;
    }

    public void display() {
        for (int i = 0; i < this.value; i++) {
            System.out.println(this.message);
        }
    }

    public void displayDifferent(String text, int number) {
        this.message = text;
        this.value = number;

        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }


}
