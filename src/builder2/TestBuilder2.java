package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("integralno");
		
		builder.spread("urnebes").spread("kečap").meat("šunka").salad("zelena").spread("majonez");
		
		Sandwich sandwich = builder.build();
		
		System.out.println(sandwich);

	}

}
