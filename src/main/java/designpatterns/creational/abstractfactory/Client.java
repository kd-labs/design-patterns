package designpatterns.creational.abstractfactory;

import designpatterns.creational.abstractfactory.furniturefactory.ArtDecoFurnitureFactory;
import designpatterns.creational.abstractfactory.furniturefactory.FurnitureFactory;
import designpatterns.creational.abstractfactory.furniturefactory.ModernFurnitureFactory;
import designpatterns.creational.abstractfactory.furniturefactory.VictorianFurnitureFactory;
import designpatterns.creational.abstractfactory.room.LivingRoom;

public class Client {

    public static void main(String[] args) {
        LivingRoom room = configureLivingRoom(args[0]);
        room.buildRoom();
    }

    private static LivingRoom configureLivingRoom(String property) {
        LivingRoom room;
        FurnitureFactory factory = null;
        if(property.equalsIgnoreCase("art deco")) {
            factory = new ArtDecoFurnitureFactory();
        } else if(property.equalsIgnoreCase("victorian")) {
            factory = new VictorianFurnitureFactory();
        } else if(property.equalsIgnoreCase("modern")) {
            factory = new ModernFurnitureFactory();
        }
        room = new LivingRoom(factory);
        return room;
    }

}
