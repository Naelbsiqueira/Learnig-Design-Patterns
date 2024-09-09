package structure.pack;

public class LegalPerson implements PersonAdapter {
    private String cnpj;
    public LegalPerson(String cnpj){this.cnpj = cnpj;}
    public String getCnpj(){return cnpj;}

    @Override
    public String gerRegistro() {
        return getCnpj();
    }
}
