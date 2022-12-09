package cue.clothingshopfinal.controller;

import cue.clothingshopfinal.services.Impl.ClothingImpl;
import cue.clothingshopfinal.services.ModelFcatoryService;

public class ModelFactoryController implements ModelFcatoryService {
    ClothingImpl clothing;

    public ClothingImpl getClothing() {
        return clothing;
    }

    private static class SingletonHolder {
        // El constructor de Singleton puede ser llamado desde aquí al ser protected
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        clothing = new ClothingImpl();
    }

}
