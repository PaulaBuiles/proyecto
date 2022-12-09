package cue.clothingshopfinal.services;

import cue.clothingshopfinal.model.Client;
import cue.clothingshopfinal.model.ClientDTO;

import java.util.List;

public interface ClientService {
    void addClient(Client client, ClientDTO clientDto);
    void createUserList();
    List<Client> getClientList();

    List<ClientDTO> getClientDTOList();

    Client getClientOn();

    void setClientOn(Client client);

    void printClients();
    void condition(String password);
}
