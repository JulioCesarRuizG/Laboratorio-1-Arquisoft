import java.util.Scanner;

/////////////////////////////////////////////////////////////////////////////////////
//En esta clase se encuentran las implementaciones con extends Thread e implements Thread
/////////////////////////////////////////////////////////////////////////////////////

public class TallerThread extends Thread
{
	private int actual;
	private int valor;
	
	public void run()
	{
		for(int i=0 ; (actual+2) <= valor ; i+=2)
		{
			System.out.println(actual);
			actual +=2;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(actual);
	}
	
	public TallerThread(int actual, int valor)
	{
		this.actual = actual;
		this.valor = valor;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el lìmite superior del rango");
		int valor = sc.nextInt();
		TallerThread primero = new TallerThread(1, valor);
		TallerThread segundo = new TallerThread(2, valor);
		primero.start();
		segundo.start();
	}

	
}
/*
public class TallerThread implements Runnable
{
	private int actual;
	private int valor;
	
	public void run()
	{
		for(int i=1 ; (actual+2)<=valor  ; i+=2)
		{
			System.out.println(actual);
			actual +=2;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(actual);
	}
	
	public TallerThread(int actual, int valor)
	{
		this.actual = actual;
		this.valor = valor;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el lìmite superior del rango");
		int valor = sc.nextInt();
		Thread primero = new Thread(new TallerThread(1, valor));
		Thread segundo = new Thread(new TallerThread(2, valor));
		primero.start();
		segundo.start();
	}

	
}
*/
