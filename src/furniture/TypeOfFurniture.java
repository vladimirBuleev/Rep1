package furniture;

public enum TypeOfFurniture {
    TABLE("стол"),CLOSET("шкаф"),CHAIR("стул");
    String name;
    TypeOfFurniture(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
