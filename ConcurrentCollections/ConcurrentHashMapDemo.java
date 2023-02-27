import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentHashMapDemo extends Thread{
	
	static ConcurrentHashMap<String, String> coursesRatings = new ConcurrentHashMap<String, String>();
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		coursesRatings.put("Kubernetes", "4.8");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentHashMapDemo arrayListProblem = new ConcurrentHashMapDemo();
		arrayListProblem.start();
		
		coursesRatings.put("Java", "5.0");
		coursesRatings.put("Python", "4.8");
		coursesRatings.put("AWS", "4.7");
		coursesRatings.put("Docker", "4.7");
		
		Iterator<String> iterator = coursesRatings.keySet().iterator();
		
		while (iterator.hasNext()) {
			Thread.sleep(2000);
			String course = iterator.next();
			System.out.println(coursesRatings.get(course));
			
		}
		
		System.out.println(coursesRatings);
	}

}
