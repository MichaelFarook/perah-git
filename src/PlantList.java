public class PlantList {
    private Plant[] plants;
    private String listName;
    private static int idPlantList = 0;

    public PlantList(String listName) {
        this.listName = listName;
        Plant[] plants = new Plant[100];
        idPlantList++;
    }
    public PlantList() {
        this.listName = "Plant List";
        Plant[] plants = new Plant[100];
        idPlantList++;
    }

    public Plant[] getPlants() {
        return plants;
    }

    public void setPlants(Plant[] plants) {
        this.plants = plants;
    }

    public static int getIdPlantList() {
        return idPlantList;
    }

    public static void setIdPlantList(int idPlantList) {
        PlantList.idPlantList = idPlantList;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
