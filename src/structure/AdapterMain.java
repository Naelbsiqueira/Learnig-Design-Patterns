package structure;
/*O padrão Adapter: É um padrão de design estrutural que permite que interfaces
incompatíveis trabalhem juntas. Ele age como um intermediário que traduz a interface
de uma classe para a interface esperada por outra. Isso facilita a integração de
componentes que, de outra forma, não seriam compatíveis. O Adapter permite que
sistemas existentes se adaptem a novas necessidades sem modificar seu código.*/

import structure.pack.LegalPerson;
import structure.pack.PersonAdapter;
import structure.pack.PhysicalPerson;

import java.util.Objects;

public class AdapterMain {
    public static void main(String[] args) {
        var nael = new LegalPerson(null);
        var empresa = new PhysicalPerson("058.212.331-59");
        var personProcessor = new PersonProcessor();
        personProcessor.process(nael);
        personProcessor.process(empresa);
    }

    private static class PersonProcessor{
        void process(PersonAdapter adapter){
            if (Objects.isNull(adapter.gerRegistro())){
                System.out.print("Registro não encontrado");
            }
        }
    }
}
