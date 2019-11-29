public class StringRepresentValues {
	public boolean isNumeric(char[] str) {
		return String.valueOf(str).matches("[+-]?[0-9]*(\\.[0-9]+)?([eE][+-]?[0-9]+)?");
	}
}
