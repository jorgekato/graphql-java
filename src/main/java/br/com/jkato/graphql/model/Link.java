/**
 * 
 */
package br.com.jkato.graphql.model;

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

public class Link {

    private String id;
    private String url;
    private String description;

    public Link( String url, String description ) {
        this(null, url, description);
    }
    
    /**
     * Construtor alternativo da classe
     */
    public Link ( String id, String url , String description ) {
        this.id = id;
        this.url = url;
        this.description = description;
    }

    /**
     * Método de recuperação do campo id
     *
     * @return valor do campo id
     */
    public String getId () {
        return id;
    }

    /**
     * Método de recuperação do campo url
     *
     * @return valor do campo url
     */
    public String getUrl () {
        return url;
    }

    /**
     * Método de recuperação do campo description
     *
     * @return valor do campo description
     */
    public String getDescription () {
        return description;
    }
}
