package People;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class LletresFase4 {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("j", "e", "s", "s", "i", "c", "a");
		List<String> surname = Arrays.asList("h", "e", "r", "n", "a", "n", "d", "o");
		List<String> espai = Arrays.asList(" ");

		List<String> newList = new ArrayList();
		newList.addAll(name);
		newList.addAll(espai);
		newList.addAll(surname);

		System.out.println("Full name: " + newList);

	}
}

/* List newList2 = new ArrayList(newList);newList.add(" "); */