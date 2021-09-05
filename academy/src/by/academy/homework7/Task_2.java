package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task_2 {

	public static void main(String[] args) {
		Person person = new Person("Иван", "Иванов", 21, "12-05-2000");
		User user = new User("Ivan2000", "ivan5454", "ivanov@mail.ru");

		Class<? extends Person> personClass = Person.class;
		Class<? extends User> userClass = User.class;

		printNamedMethod(personClass, "getFirstName");
		printNamedMethodWithString(userClass, "setLogin");
		printNamedMethodWithInteger(personClass, "setAge");
		System.out.println();

		for (Method method : personClass.getMethods()) {
			System.out.println(method);
		}

		System.out.println();

		for (Method method : userClass.getMethods()) {
			System.out.println(method);
		}
		System.out.println();

		for (Field field : personClass.getFields()) {
			System.out.println(field);
		}
		System.out.println();

		for (Field field : userClass.getFields()) {
			System.out.println(field);
		}
		System.out.println();

		printNamedDeclaredMethod(userClass, "printUserInfo");
		printNamedDeclaredMethodWithInteger(personClass, "setAge");
		printNamedDeclaredMethodWithString(userClass, "setEmail");
		System.out.println();

		for (Method method : personClass.getDeclaredMethods()) {
			System.out.println(method);
		}
		System.out.println();

		for (Method method : userClass.getDeclaredMethods()) {
			System.out.println(method);
		}
		System.out.println();

		for (Field field : personClass.getDeclaredFields()) {
			System.out.println(field);
		}
		System.out.println();

		for (Field field : userClass.getDeclaredFields()) {
			System.out.println(field);
		}
		System.out.println();
		
		setField(person, "firstName", "Сергей");
		System.out.println();
		
		try {
			Method toStringPerson = personClass.getDeclaredMethod("toString");
			System.out.println(toStringPerson.invoke(person));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {			
			e.printStackTrace();
		}
		
		try {
			Method toStringUser = userClass.getDeclaredMethod("toString");
			System.out.println(toStringUser.invoke(user));
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {			
			e.printStackTrace();
		}
		

	}

	public static void printNamedMethod(Class some, String name) {
		try {
			System.out.println(some.getMethod(name, null));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void printNamedMethodWithInteger(Class some, String name) {
		try {
			System.out.println(some.getMethod(name, int.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void printNamedMethodWithString(Class some, String name) {
		try {
			System.out.println(some.getMethod(name, String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void printNamedField(Class some, String name) {
		try {
			System.out.println(some.getField(name));
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void printNamedDeclaredMethod(Class some, String name) {
		try {
			System.out.println(some.getDeclaredMethod(name, null));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void printNamedDeclaredMethodWithInteger(Class some, String name) {
		try {
			System.out.println(some.getDeclaredMethod(name, int.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void printNamedDeclaredMethodWithString(Class some, String name) {
		try {
			System.out.println(some.getDeclaredMethod(name, String.class));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void setField(Object object, String name, String newName) {
		Field field;
		try {
			field = object.getClass().getDeclaredField(name);
			field.setAccessible(true);
			field.set(object, newName);
			System.out.println(field.get(object));
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
