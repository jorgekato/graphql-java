/**
 * 
 */
package br.com.jkato.graphql.model;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import br.com.jkato.graphql.repository.LinkRepository;

/**
 * DOCUMENTAÇÃO DA CLASSE <br>
 * ---------------------- <br>
 * FINALIDADE: <br>
 * TODO Definir documentação da classe. <br>
 * <br>
 * HISTÓRICO DE DESENVOLVIMENTO: <br>
 * 14 de nov de 2018 - @author jorge - Primeira versão da classe. <br>
 * <br>
 * <br>
 * LISTA DE CLASSES INTERNAS: <br>
 */

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query ( LinkRepository linkRepository ) {
        this.linkRepository = linkRepository;

    }

    public List < Link > allLinks () {
        return linkRepository.getAllLinks();
    }

}
