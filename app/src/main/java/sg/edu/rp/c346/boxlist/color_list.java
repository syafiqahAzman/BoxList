package sg.edu.rp.c346.boxlist;

/**
 * Created by 16046491 on 25/7/2018.
 */

public class color_list {
    private String color;


    public color_list(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "color_list{" +
                "color='" + color + '\'' +
                '}';
    }
}
