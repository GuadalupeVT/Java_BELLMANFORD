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
	private static class Aristas {
		 
        int origen, destino;
        float coste;
 
        public Aristas(int a, int b, float c) {
            origen = a;
            destino = b;
            coste = c;
        }
 
        @Override
        public String toString() {
            return "Aristas{" + "origen=" + origen + ", destino=" + destino + ", coste=" + coste + '}';
        }
    }
 
    public BellmanFord() throws IOException {
        float item;
        aristas = new LinkedList<Aristas>();
        DataInputStream in = new DataInputStream(System.in);
        System.out.print("Introduce numero de vertices ");
        numeroVertices = Integer.parseInt(in.readLine());
        System.out.println("Matriz de costes");
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                if (i != j) {
                    System.out.println("Introduce coste del nodo " + (i + 1) + " al nodo " + (j + 1));
                    item = Float.parseFloat(in.readLine());
                    if (item != 0) {
                        aristas.add(new Aristas(i, j, item));
                    }
                }
            }
        }
        totalAristas = aristas.size();
        etiquetas = new float[numeroVertices];
        predecesor = new int[numeroVertices];
        System.out.print("Introduce el vertice origen");
        nodoOrigen = Integer.parseInt(in.readLine()) - 1;
    }
public class PruebaBELLMANFORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
