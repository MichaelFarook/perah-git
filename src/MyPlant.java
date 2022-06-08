import java.text.SimpleDateFormat;
import java.util.Date;

public class MyPlant extends Plant {
    private Date date;
    private SimpleDateFormat newPl;

    public MyPlant(String nameOfPlantDate, String lightning, String watering, String lastWatering, Date date) {
        super(nameOfPlantDate, lightning, watering, lastWatering);
        this.date = date;
    }

    public MyPlant() {
        super();
        date = new Date();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
