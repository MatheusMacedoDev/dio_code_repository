package subsystem2;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {

    }

    public static CepApi getInstance() {
        return instance;
    }

    public String getCityFromCep(String cep) {
        return "Mauá";
    }

    public String getStateFromCep(String cep) {
        return "SP";
    }
}
