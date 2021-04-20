package sg.edu.rp.c346.id19034275.c347_lesson1_ps_sg_holiday;

public class Secular {
    private int image;
    private String name;
    private String date;


    public Secular(int image, String name, String date) {
        this.name = name;
        this.date = date;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getImage() {
        return image;
    }
}
