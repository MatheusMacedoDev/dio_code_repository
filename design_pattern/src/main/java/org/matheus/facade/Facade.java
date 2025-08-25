package org.matheus.facade;

import subsystem1.CrmService;
import subsystem2.CepApi;

public class Facade {

    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().getCityFromCep(cep);
        String state = CepApi.getInstance().getStateFromCep(cep);

        CrmService.saveClient(name, cep, city, state);
    }

}
