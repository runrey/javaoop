package assign2;

import java.util.Scanner;
import java.util.ArrayList;

public class Validator{
	public static void main(String args[]){
		User u = null;
		ArrayList <User> users = new ArrayList<User>();
		Scanner in = new Scanner (System.in);
		System.out.println("How many users need to add?");
		int n = in.nextInt();
		for(int i = 0; i<n; i++) {
			
			System.out.println("Write your name:");
			String fname = in.next();
			
			
			System.out.println("Write your surname:");
			String sname = in.next();
			
			
			System.out.println("Write your age:");
			int age = in.nextInt();
			do {
				boolean d = checkAge(age);
				if(!d) age = in.nextInt();
				if(d) break;
			}while(true);
			
			
			System.out.println("Write your gender(m/f):");
			String gender = in.next();
			do {
				boolean d = checkGender(gender);
				if(!d) gender = in.next();
				if(d) break;
			}while(true);
			
			
			System.out.println("Write your password:");
			String pass = in.next();
			do {
				boolean d = checkPassword(pass);
				if(!d) pass = in.next();
				if(d) break;
			}while(true);
			
			
			System.out.println("Write your birth date(dd/mm/yyyy):");
			String date = in.next();
			do {
				boolean d = checkDate(date);
				if(!d) date = in.next();
				if(d) break;
			}while(true);
			
			u = new User(fname, sname, age, gender, pass, date);
			users.add(u);
			System.out.println("User was succesfully added!");
			System.out.println("");
		}
		
		for(int i = 0; i<users.size(); i++) {
			System.out.println("User #"+i);
			users.get(i).printAll();
			System.out.println("");
		}
		in.close();
	}		
	
	public static boolean checkAge(int a) {
		if(a<18) {
			System.out.println("Your age is less than 18!");
			return false;
		}
		else {
			return true;
		}
	}
	public static boolean checkGender(String m) {
		m = m.toUpperCase();
		char d = m.charAt(0);
		if(d == 'M' || d == 'F') {
			return true;
		}
		else {
			System.out.println("Write correct gender!");
			return false;
		}
	}
	
	public static boolean checkPassword(String p) {
		boolean len = false, up = false, low = false, num = false, symb = false;
		if(p.length()<8) {
			System.out.println("Password length must be >=8.");
		}
		else if(p.length()>=8) {
			len = true;
		}	
		for(int i = 0; i<p.length(); i++) {
			if(p.charAt(i)>=97 && p.charAt(i)<=122) {
				low = true;
			}
			if(p.charAt(i)>=65 && p.charAt(i)<=90) {
				up = true;
			}
			if(p.charAt(i)>=48 && p.charAt(i)<=57) {
				num = true;
			}
			if(p.charAt(i)==64 || p.charAt(i)==36 || p.charAt(i)==33 || p.charAt(i)==94) {
				symb = true;
			}
		}
		if(!up) {
			System.out.println("Password must contain at least 1 uppercase");
		}
		if(!low) {
			System.out.println("Password must contain at least 1 lowercase");
		}
		if(!num) {
			System.out.println("Password must contain at least 1 number");
		}
		if(!symb) {
			System.out.println("Password must contain at least 1 symbol(@,$,!,^)");
		}
		if(len && up && low && num && symb) {
			return true;
		}
			return false;
	}
	
	public static boolean checkDate(String d) {
		if(d.length()!=10) {
			System.out.println("wrong format");
			return false;
		}
		char d1 = d.charAt(0), d2 = d.charAt(1), s1 = d.charAt(2), m1 = d.charAt(3), m2 = d.charAt(4), s2 = d.charAt(5), y1 = d.charAt(6), y2 = d.charAt(7), y3 = d.charAt(8), y4 = d.charAt(9);
		if(d1>'3' || d1<'0') {
			System.out.println("wrong day");
			return false;
		}
		if(d1=='3') {
			if(d2>'1' || d2<'0') {
				System.out.println("wrong day");
				return false;
			}
		}
		if(d1>='0' && d1<'3') {
			if(d2>'9' || d2<'0') {
				System.out.println("wrong day");
				return false;
			}
		}
		
		if(s1!='/') {
			System.out.println("wrong format");
			return false;
		}
		
		if(m1>'1' || m1<'0') {
			System.out.println("wrong month");
			return false;
		}
		if(m1=='1') {
			if(m2>'2' || m2<'0') {
				System.out.println("wrong month");
				return false;
			}
		}
		if(m1=='0') {
			if(m2>'9' || m2<'0') {
				System.out.println("wrong month");
				return false;
			}
		}
		
		if(s2!='/') {
			System.out.println("wrong format");
			return false;
		}
		
		if(y1>'2') {
			System.out.println("wrong year");
			return false;
		}
		if(y1<='2' && y1>='0') {
			if(y2>'9' && y2<'0') {
				System.out.println("wrong year");
				return false;
			}
		}
		if(y1<='2' && y1>='0') {
			if(y2<='9' && y2>='0') {
				if(y3>'9' && y3<'0') {
					System.out.println("wrong year");
					return false;
				}
			}
		}
		if(y1<='2' && y1>='0') {
			if(y2<='9' && y2>='0') {
				if(y3<='9' && y3<='0') {
					if(y4>'9' && y4<'0') {
						System.out.println("wrong year");
						return false;
					}
				}
			}
		}
		return true;
	}
}