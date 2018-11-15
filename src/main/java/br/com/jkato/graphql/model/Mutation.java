/**
 * 
 */
package br.com.jkato.graphql.model;

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

public class Mutation implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Mutation ( LinkRepository linkRepository ) {
        this.linkRepository = linkRepository;
    }

    public Link createLink ( String url , String description ) {
        Link link = new Link( url , description );
        linkRepository.saveLink( link );
        return link;
    }
}
