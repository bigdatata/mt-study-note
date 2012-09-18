package mt.study.thebeautifulofprogramming;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 *
 */
public class SortADiskFile {

	public static void main(String[] args) throws Exception {
		int N=10000000;
		Random rand=new Random();
		Set<Integer> set=new TreeSet<Integer>();
		int i=0;
		List<Integer> list=new LinkedList<Integer>();
		while(i++<N){
			set.add(Math.abs(rand.nextInt(N)));
		}
		list.addAll(set);
		Collections.shuffle(list);
		File test=new File("rand.txt");
		PrintStream   out   =   new   PrintStream(new   FileOutputStream(test));
		//第一种遍历法：使用迭代器    
        java.util.Iterator<Integer> iter = list.iterator();    
        while (iter.hasNext()) {    
            int element = iter.next();    
            out.println(element);    
        }  
		
	}
}
