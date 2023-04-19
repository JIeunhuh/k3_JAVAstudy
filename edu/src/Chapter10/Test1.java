package Chapter10;

import java.util.ArrayList;
import java.util.Arrays;

class Employee {
	String name;
	int age;
	int height;
	int weight;
	char bloodtype;
	String email;

	public Employee(String name, int age, int height, int weight, char bloodtype, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bloodtype = bloodtype;
		this.email = email;
	}

	public String toString() {
		return "name : " + name + ", age : " + age + ", height : " + height + ", weight : " + weight + ", bloodtype : "
				+ bloodtype + " , email : " + email;
	}
}

public class Test1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("seoul");
		list.add("busan");
		list.add("jeonju");
		list.add("ulsan");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(" " + list.get(i));
		}
		list.add(0, "incheon"); // list.add()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

//		int[] a = new int[10];
//		Employee[] eset = new Employee[10];
//		eset[0] = new Employee("Hong", 11, 130, 50, 'A', "bhong@co.kr");
//		eset[1] = new Employee("Hun", 21, 160, 50, 'A', "mini@co.kr");
//		eset[2] = new Employee("Choi", 23, 172, 56, 'O', "euni@co.kr");
//		eset[3] = new Employee("Lee", 28, 180, 68, 'B', "kyung@co.kr");
//
////		for (Employee e : eset) {
////			System.out.println(e.toString());
////		}//확장 for문 error! 배열이 다 안만들어져서 에러남
//
//		for (int i = 0; i < 4; i++) {
//			System.out.println(eset[i]);
//		}
//		eset[4]=new Employee("Na", 24, 178, 63, 'B', "");
//	}
		Object arr[]=new Object[10];// array!! 
		ArrayList li = new ArrayList();// arraylist!!!
		String s = "java";
		Integer i = 123;
		arr[0]=s;
		arr[1]=i;
		li.add(s);
		li.add(i);
		Object obj[]=list.toArray();
		System.out.println(Arrays.toString(obj));
	}
}
