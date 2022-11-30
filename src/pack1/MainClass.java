package pack1;

import java.util.Arrays;
import java.util.List;

public class MainClass 
{
	public static void main(String[] args)
	{
		Person p1 = new Person("David",23,"USA");
		Person p2 = new Person("Joy",63,"German");
		Person p3 = new Person("Rayan",87,"Italy");
		Person p4 = new Person("Ram",50,"India");
		Person p5 = new Person("Chinng",54,"China");
		Person p6 = new Person("Manas",12,"Inida");
		Person p7 = new Person("PopeGod",54,"Paris");
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		//anyMatch()
		boolean isAnyIndians =persons.stream()
		.anyMatch(p -> p.getPersonCountry().equals("India"));
		System.out.println("Is only Indians >> "+isAnyIndians);
		
		//allMatch()
		boolean isAllIndians = persons.stream()
				.allMatch((p) -> p.getPersonCountry().equals("India"));
		System.out.println("is All Indians >>"+isAllIndians);
		
		//noneMatch()
		boolean isNoPak = persons.stream()
				.noneMatch((p) -> p.getPersonCountry().equals("Paksithan"));
		System.out.println("is None from Pakisthan >>"+isNoPak);
		
		
		

		
	}

}
