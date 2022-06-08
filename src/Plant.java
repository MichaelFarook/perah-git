public class Plant {


    private String nameOfPlant;
    private String lightning;
    private String watering;
    private String lastWatering;
    private static int idPlant = 0;

    public Plant(String nameOfPlant, String lightning, String watering, String lastWatering) {
        this.setNameOfPlant(nameOfPlant);
        this.setLightning(lightning);
        this.setWatering(watering);
        this.setLastWatering(lastWatering);
        idPlant++;
    }
    public Plant() {
        nameOfPlant = "PlantName";
        lightning = "Lightning";
        watering = "Watering";
        lastWatering = "Last Watering";
        idPlant++;
    }
    public Plant(String nameOfPlant) {
        this.nameOfPlant = nameOfPlant;
        lightning = "Lightning";
        watering = "Watering";
        lastWatering = "Last Watering";
        idPlant++;
    }

    public Plant(Plant p) {
        this.copy(p);
    }

    public String getNameOfPlant() {
        return nameOfPlant;
    }

    public void setNameOfPlant(String nameOfPlant) {
        this.nameOfPlant = nameOfPlant;
    }

    public String getLightning() {
        return lightning;
    }

    public void setLightning(String lightning) {
        this.lightning = lightning;
    }

    public String getWatering() {
        return watering;
    }

    public void setWatering(String watering) {
        this.watering = watering;
    }

    public String getLastWatering() {
        return lastWatering;
    }

    public void setLastWatering(String lastWatering) {
        this.lastWatering = lastWatering;
    }

    public static int getIdPlant() {
        return idPlant;
    }

    public static void setIdPlant(int id) {
        idPlant = id;
    }

    public void copy(Plant p) {
        this.setNameOfPlant(p.getNameOfPlant());
        this.setLightning(p.getLightning());
        this.setWatering(p.getWatering());
        this.setLastWatering(p.getLastWatering());
    }

    @Override
    public String toString() {
        return ("Name: " + this.getNameOfPlant() + "\nLightning: " + this.getLightning() +
                "\nWatering: " + this.getWatering() + "\nLast Watering: " + this.getLastWatering() + "\nPlant ID: " + this.getIdPlant() );
    }

}
