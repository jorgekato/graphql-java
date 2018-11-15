/**
 * 
 */
package br.com.jkato.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import br.com.jkato.graphql.model.Mutation;
import br.com.jkato.graphql.model.Query;
import br.com.jkato.graphql.repository.LinkRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

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

@WebServlet ( urlPatterns = "/graphql" )
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    /**
     * Construtor padrão/alternativo da classe
     * 
     * @param schema
     */
    public GraphQLEndpoint () {
        super( buildSchema() );
    }

    /**
     * TODO Descrição do Método
     * 
     * @return
     */
    private static GraphQLSchema buildSchema () {
        LinkRepository linkRepository = new LinkRepository();

        return SchemaParser
                .newParser()
                .file( "schema.graphqls" )
                .resolvers( new Query( linkRepository ) , new Mutation( linkRepository ) )
                .build()
                .makeExecutableSchema();
    }

}
