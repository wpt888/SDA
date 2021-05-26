package lab5p1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student student1 = new Student("Theodor", "Patratanu", 8, 8);
		Student student2 = new Student("Oprea", "Vlad-Andrei", 8, 8);
		Student student3 = new Student("Lazariciu", "Paula", 7, 7);
		Student student4 = new Student("Haruta", "Denisa", 8, 8);
		Student student5 = new Student("Adam", "Marian", 5, 6);
		Student student6 = new Student("Albu", "Remus", 6, 8);
		Student student7 = new Student("Bidilica", "Ionut-Razvan", 7, 7);
		Student student8 = new Student("Savu", "Alexandru", 6, 6);
		Student student9 = new Student("Amariei", "Rares", 10, 10);
		Student student10 = new Student("Voicu", "Florin", 9, 9);

		HashMap<String, Student> studentList_HashMap = new HashMap<>();
		studentList_HashMap.put("1133", student1);
		studentList_HashMap.put("2233", student2);
		studentList_HashMap.put("3333", student3);
		studentList_HashMap.put("4433", student4);
		studentList_HashMap.put("5533", student5);
		studentList_HashMap.put("6633", student6);
		studentList_HashMap.put("7733", student7);
		studentList_HashMap.put("8834", student8);
		studentList_HashMap.put("9935", student9);
		studentList_HashMap.put("6565", student10);

		LinkedHashMap<String, Student> studentList_LinkedHashMap = new LinkedHashMap<>();
		studentList_LinkedHashMap.put("1133", student1);
		studentList_LinkedHashMap.put("2233", student2);
		studentList_LinkedHashMap.put("3333", student3);
		studentList_LinkedHashMap.put("4433", student4);
		studentList_LinkedHashMap.put("5533", student5);
		studentList_LinkedHashMap.put("6633", student6);
		studentList_LinkedHashMap.put("7733", student7);
		studentList_LinkedHashMap.put("8834", student8);
		studentList_LinkedHashMap.put("9935", student9);
		studentList_LinkedHashMap.put("6565", student10);

		System.out.println("Inserati cnp-ul:");

		Scanner x = new Scanner(System.in);
		String CNP = x.nextLine();

		System.out.println(studentList_HashMap.get(CNP));

		for (String key : studentList_HashMap.keySet()) {
			System.out.println(key);
		}

		System.out.println();

		System.out.println(studentList_LinkedHashMap.get(CNP));

		for (String key : studentList_LinkedHashMap.keySet()) {
			System.out.println(key);

		}
		x.close();

	}
}