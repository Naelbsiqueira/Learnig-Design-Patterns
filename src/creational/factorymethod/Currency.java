package creational.factorymethod;

public interface Currency {
    String getSymbl();
}
class Real implements Currency{
    @Override
    public String getSymbl() {
        return "R$";
    }
}
class Dollar implements Currency{
    @Override
    public String getSymbl() {
        return "US$";
    }
}

