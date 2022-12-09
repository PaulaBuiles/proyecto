package cue.clothingshopfinal.services.Impl;

import cue.clothingshopfinal.model.Client;
import cue.clothingshopfinal.model.ClientDTO;
import cue.clothingshopfinal.persistence.Persistence;
import cue.clothingshopfinal.services.ClientService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientServiceImpl implements ClientService {
    List<Client> clientList = new ArrayList<>();

    List<ClientDTO> clientListDto = new ArrayList<>();

    Client clientOn;

    private final ClothingImpl clothing;

    @Override
    public List<Client> getClientList() {
        return clientList;
    }

    @Override
    public List<ClientDTO> getClientDTOList() {return clientListDto;}

    @Override
    public Client getClientOn() {
        return clientOn;
    }

    @Override
    public void setClientOn(Client clientOn) {
        this.clientOn = clientOn;
    }

    @Override
    public void printClients() {
        for (Client client: clientList){
            System.out.println(client.toString());
        }
    }

    public ClientServiceImpl(ClothingImpl clothing) {this.clothing = clothing;}

    @Override
    public void createUserList(){
        try {
            this.clientList = Persistence.loadUsers();
            System.out.println(clientList);
            for (Client client : clientList){
                clientListDto.add(new ClientDTO(client.getUsername(), client.getEmail(), client.getPassword()));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void addClient(Client client,ClientDTO clientDto) {
        clientListDto.add(clientDto);
        clientList.add(client);
        try {
            Persistence.saveUsers(clientList);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void condition(String password){
        for (Client cli : clientList){
            if (cli.getPassword().equals(password)){
                clientOn =(Client) cli;
                clientOn.setCondition(true);
            }
        }
    }
}
