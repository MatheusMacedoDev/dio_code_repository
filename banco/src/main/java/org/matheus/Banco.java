package org.matheus;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public Set<Cliente> getAllClients() {
        return contas.stream()
            .map(conta -> conta.cliente)
            .collect(Collectors.toSet());
    }

}