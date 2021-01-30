
public class EjemplosThread {
	

/*
public class EjemplosThread {
	private int contador = 0;
	
	public void incrementar()
	{
		for(int i=0; i<10000; i++)
		{
			contador++;
		}
	}
	
	public int getContador()
	{
		return contador;
	}
	
	public static void main(String[] args)
	{
		TallerThread c = new TallerThread();
		
		for(int i=0;i<1000;i++)
		{
			c.incrementar();
		}
		
		System.out.println(c.getContador());
	}
}
*/
/*
public class EjemplosThread extends Thread{
	private static int contador = 0;
	
	public void run()
	{
		for(int i=0; i<10000; i++)
		{
			contador++;
		}
	}
	
	public static void main(String[] args)
	{
		TallerThread[] c = new TallerThread[1000];
		
		for(int i=0;i<c.length;i++)
		{
			c[i] = new TallerThread();
			c[i].start();
		}
		
		System.out.println(contador);
	}
}
*/
/*
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class EjemplosThread extends Thread
{
	private final static int INT_MAX = 105345;
	private final static int DIM = 3;
	private static int[][] matriz = new int[DIM][DIM];
	private static int mayor = -1;
	private int mayorFila = -1;
	private int idThread;
	private int fila;
	
	public TallerThread(int pt, int pf)
	{
		this.idThread = pt;
		this.fila = pf;
	}
	
	public static void crearMatriz() {
		for(int i=0;i<DIM;i++)
		{
			for(int j=0;j<DIM;j++)
			{
				matriz[i][j] = ThreadLocalRandom.current().nextInt(0, INT_MAX);
			}
		}
		
		System.out.println("Matriz:");
		System.out.println("==============================");
		imprimirMatriz();
	}
	
	private static void imprimirMatriz()
	{
		for(int i=0;i<DIM;i++)
		{
			for(int j=0;j<DIM;j++)
			{
				System.out.println(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public void run()
	{
		for(int j=0;j<DIM;j++)
		{
			if(this.mayorFila < matriz[this.fila][j])
			{
				this.mayorFila = matriz[this.fila][j];
			}
		}
		if(this.mayorFila > mayor)
		{
			try
			{
				Thread.sleep(250);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			mayor = this.mayorFila;
			String warn = String.format("========= Nuevo Maximo Encontrado ========= \n" +
			"ID Thread: %d - Maximo Local Actual: %d - Maximo Global: %d \n" +
			"\n", this.idThread, mayor, this.mayorFila);
			System.out.println(warn);
		}
		String msg = String.format("ID Thread: %d - Maximo Local Actual: %d - Maximo Global: %d \n",
				this.idThread, this.mayorFila, mayor);
		System.out.println(msg);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Busqueda concurrente por una matriz");
		
		TallerThread.crearMatriz();
		System.out.println();
		System.out.println("Iniciando busqueda por la matriz \n");
		
		TallerThread[] bThreads = new TallerThread[DIM];
		for(int i=0;i<DIM;i++)
		{
			bThreads[i] = new TallerThread(i,i);
			bThreads[i].start();
		}
	}
	
	
	
}
*/
}
