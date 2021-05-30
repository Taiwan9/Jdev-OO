package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedDeque<ObjetoFilathread> pilha_fila = new ConcurrentLinkedDeque<ObjetoFilathread>();

	public static void add(ObjetoFilathread objetoFilathread) {
		pilha_fila.add(objetoFilathread);
	}

	@Override
	public void run() {
		Iterator interacao = pilha_fila.iterator();

		synchronized (interacao) {/*Bloquear o acesso a esta lista por outros processos*/
			
			while (interacao.hasNext()) { // Equanto conter dados na lista ira processar

				ObjetoFilathread processar = (ObjetoFilathread) interacao.next();/* Pega o objeto atual */

				/* Processar 10 mil notas ficais */
				/* Gerar um lista enorme de PDF */
				/* Gerar o envio em massa de email */
				
				System.out.println("-------------------------------------------------------------");
				
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());

				interacao.remove();

				try {
					Thread.sleep(100); /* Dar um tempo pra descarga de memória */
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		}

		try {
			Thread.sleep(1000);/* Processou toda a lista dar um tempo para limpeza de memória */
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
