package practice1403;

import java.util.Scanner;

public class User{
	public static void main(String args[]) {
		try (Scanner in = new Scanner (System.in)) {
			String name = in.next();
			String email = in.next();
			UserDetails s = new UserDetails(name, email);
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			s.setEmail("example@mail.ru");
			s.setName("example");
			System.out.println(s.getName());
			System.out.println(s.getEmail());
		}
		
	}
}