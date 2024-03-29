package Lambda;

@FunctionalInterface
public interface Contract{
	public void rule();
	public static void rule2() {
		
	}
	public default void rule3() {
		
	}
}