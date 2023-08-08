package OptionClass;

import java.util.Optional;

public class OptionExample {
	public static Optional<String> getName() {
		String name = "nikunj";
		return Optional.ofNullable(name);
	}
	public static void main(String[] args) {
		String str = "java is my passion";
		if (str == null) {
			System.out.println("this is Optional");
		} else {
			System.out.println(str.length());
		}
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
		System.out.println(optional.orElse("this string is null"));
		
		Optional<String> nameOptional=getName();
		System.out.println(nameOptional.orElse("null returned"));
	}
}
