package practice1004;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Queue1{
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		String s;
		Queue<Integer> q = new LinkedList<Integer>(); 
		for(int i = 0; i<n; i++) {
			s = in.next();
			if(s.equals("+")) {
				int c = in.nextInt();
				q.add(c);
			}
			else {
				System.out.println(q.peek());
				q.remove();
			}
		}
	}
}