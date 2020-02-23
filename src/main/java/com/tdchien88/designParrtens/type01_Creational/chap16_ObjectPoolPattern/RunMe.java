package com.tdchien88.designParrtens.type01_Creational.chap16_ObjectPoolPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class RunMe {

	private static ObjectPool<ExportingProcess> pool;
	private static AtomicLong processNo = new AtomicLong(0);

	public static void testObjectPool(int nTask) {
		ExecutorService executor = Executors.newFixedThreadPool(nTask);

		// execute 8 tasks in separate threads
		for (int i = 1; i <= nTask; i++) {

			executor.execute(new ExportingTask(pool, i));
		}

		executor.shutdown();
		try {
			executor.awaitTermination(30, TimeUnit.SECONDS);
		} catch (InterruptedException e)

		{
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
// 		Create a pool of objects of type ExportingProcess.
//      Parameters: 
//        1) Minimum number of special ExportingProcess instances residing in the pool = 4 
//        2) Maximum number of special ExportingProcess instances residing in the pool = 10 
//        3) Time in seconds for periodical checking of minObjects / maxObjects conditions in a separate thread = 5. 
//
//        -->When the number of ExportingProcess instances is less than minObjects,  
//            missing instances will be created. 
//        -->When the number of ExportingProcess instances is greater than maxObjects, 
//             too many instances will be removed. 
//        -->If the validation interval is negative, no periodical checking of  
//             minObjects / maxObjects conditions in a separate thread take place. 
//         These boundaries are ignored then. 
//        
		int nTask = 20;
		int minObjects = 4;
		int maxObjects = 10;
		long validationInterval = 50;

		pool = new ObjectPool<ExportingProcess>(minObjects, maxObjects, validationInterval) {
			protected ExportingProcess createObject() {
				// create a test object which takes some time for creation
				return new ExportingProcess(processNo.incrementAndGet());
			}
		};

		pool.shutdown();
		testObjectPool(nTask);
	}

}
