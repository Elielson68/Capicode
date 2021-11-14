// Generated from com\mycompany\capicodesintatico\Capicode.g4 by ANTLR 4.9.2
package com.mycompany.capivaracode;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CapicodeParser}.
 */
public interface CapicodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CapicodeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CapicodeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterListaVariaveis(CapicodeParser.ListaVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#listaVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitListaVariaveis(CapicodeParser.ListaVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(CapicodeParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(CapicodeParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(CapicodeParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(CapicodeParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(CapicodeParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(CapicodeParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(CapicodeParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(CapicodeParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(CapicodeParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(CapicodeParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(CapicodeParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(CapicodeParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(CapicodeParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(CapicodeParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CapicodeParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CapicodeParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(CapicodeParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(CapicodeParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(CapicodeParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(CapicodeParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(CapicodeParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(CapicodeParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(CapicodeParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(CapicodeParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(CapicodeParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(CapicodeParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapicodeParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(CapicodeParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapicodeParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(CapicodeParser.SubAlgoritmoContext ctx);
}