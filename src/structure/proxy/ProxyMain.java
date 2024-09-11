package structure.proxy;
/*Padrão Proxy: Fornece um objeto substituto com a mesma interface do objeto real,
delegando as requisições dos clientes para o objeto substituto.
É útil quando o objeto real é remoto, de criação custosa ou
quando se deseja interceptar requisições para realizar controle,
como autorização ou validação. Isso permite otimizar o desempenho e
adicionar camadas de segurança sem alterar o objeto original*/

import java.net.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        // Cria uma instância do proxy, que será o intermediário para a CompleteList
        ContactList list = new ProxyContactList("Cristino Castro - GO");

        // Chama o metodo do proxy que delega a exibição da lista
        System.out.println("");
        list.show();// Método show() da interface ContactList
        list.printCompleteList();
    }
}