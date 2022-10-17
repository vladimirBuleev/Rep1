package furniture;

public class FurnitureConstructor {
    public static void main(String[] args) {
        TypeOfFurniture typeCloset = TypeOfFurniture.CLOSET;
        Furniture closet = new Furniture("SKÅNEVIK","Черный", typeCloset.getName());
        TypeOfFurniture typeTable=TypeOfFurniture.TABLE;
        Furniture table = new Furniture("IDÅSEN","Коричневый",typeTable.getName());
        TypeOfFurniture typeChair=TypeOfFurniture.CHAIR;
        Furniture chair = new Furniture("POÄNG","Бежевый", typeChair.getName());
        Furniture[] furnitures ={closet,table,chair};
        for( Furniture furniture:furnitures){
            furniture.result();
        }
    }
}
