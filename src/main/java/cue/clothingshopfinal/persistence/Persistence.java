package cue.clothingshopfinal.persistence;

import cue.clothingshopfinal.model.Client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Persistence {

    public static final String RUTA_ARCHIVO_USERS = "src/main/java/cue/clothingshopfinal/persistence/resources/users.txt";

    public static void saveUsers(List<Client> clientList) throws IOException {

        String content = "";

        for (Client client : clientList) {
            content += client.getUsername() + "_" + client.getPassword() + "_" + client.getEmail() + "_" + client.getId() + "\n";
        }

        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_USERS, content, true);
    }

    public static List<Client> loadUsers() throws FileNotFoundException, IOException {

        List<Client> clientList = new ArrayList<>();

        ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_USERS);

        String linea = "";

        for (String s : contenido) {
            Client client = new Client();
            linea = s;
            client.setUsername(linea.split("_")[0]);
            client.setPassword(linea.split("_")[1]);
            client.setId(linea.split("_")[2]);
            client.setEmail(linea.split("_")[3]);

            clientList.add(client);
        }
        return clientList;
        }
    }
