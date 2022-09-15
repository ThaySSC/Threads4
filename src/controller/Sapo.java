package controller;
public class Sapo extends Thread {
	private String nome; 
	private int distanciaCorrida = 0;
	private int distanciaTotalCorrida; 
	private int pulo = 0; 
	private int pulos = 0; 
	private static int colocacao = 0; 
	private final static int PULO_MAXIMO = 50;

/* Construtor */
	public Sapo (String nome, int distanciaTotalCorrida) {
/* Chamar o construtor */
		super(nome);
		this.distanciaTotalCorrida = distanciaTotalCorrida;
		this.nome = nome;
		}
}