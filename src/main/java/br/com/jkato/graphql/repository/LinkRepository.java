/**
 * 
 */
package br.com.jkato.graphql.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.jkato.graphql.model.Link;

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

public class LinkRepository {

    private final List < Link > links;

    public LinkRepository () {
        links = new ArrayList <>();

        // add some links to start off with
        links.add( new Link( "http://howtographql.com" , "Your favorite GraphQL page" ) );
        links.add( new Link( "http://graphql.org/learn/" , "The official docks" ) );
    }

    public List < Link > getAllLinks () {
        return links;
    }

    public void saveLink ( Link link ) {
        links.add( link );
    }
}
