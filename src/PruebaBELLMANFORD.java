//https://masfernandez.com/2013/04/16/algoritmo-bellman-ford-java/
import java.io.*;
import java.util.*;

class BellmanFord {
 
    private LinkedList<Aristas> aristas;
    private float etiquetas[];
    private int predecesor[];
    private int numeroVertices, totalAristas, nodoOrigen;
    private final int INFINITY = 999;
 
    public LinkedList<Aristas> getAristas() {
		return aristas;
	}

	public void setAristas(LinkedList<Aristas> aristas) {
		this.aristas = aristas;
	}

	public float[] getEtiquetas() {
		return etiquetas;
	}

	public void setEtiquetas(float[] etiquetas) {
		this.etiquetas = etiquetas;
	}

	public int[] getPredecesor() {
		return predecesor;
	}

	public void setPredecesor(int[] predecesor) {
		this.predecesor = predecesor;
	}

	public int getNumeroVertices() {
		return numeroVertices;
	}

	public void setNumeroVertices(int numeroVertices) {
		this.numeroVertices = numeroVertices;
	}

	public int getTotalAristas() {
		return totalAristas;
	}

	public void setTotalAristas(int totalAristas) {
		this.totalAristas = totalAristas;
	}

	public int getNodoOrigen() {
		return nodoOrigen;
	}

	public void setNodoOrigen(int nodoOrigen) {
		this.nodoOrigen = nodoOrigen;
	}

	public int getINFINITY() {
		return INFINITY;
	}

public class PruebaBELLMANFORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
