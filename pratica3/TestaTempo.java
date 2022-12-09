package pratica3;

public class TestaTempo {

	public static void main(String[] args) {
		
		Tempo t1 = new Tempo(20, 30, 30);
		System.out.println("Tempo no formato hhmmss: " + t1.mostrarTempo());
		t1.decMin();
		System.out.println("Após decrementar um minuto: " + t1.mostrarTempo());
		
	    Tempo t2 = new Tempo(23,59);
	    System.out.println("Tempo no formato hhmmss: " + t2.mostrarTempo());
	    t2.incMin();
	    System.out.println("Após incrementar um minuto: " +t2.mostrarTempo());
	    
	    Tempo t3 = new Tempo(5);
	    System.out.println("Tempo no formato hhmmss: " + t3.mostrarTempo());
	    t3.decMin();
	    System.out.println("Após decrementar um minuto: " + t3.mostrarTempo());
	}

}
