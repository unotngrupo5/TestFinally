package practicaExcepciones2;

public class TestFinally {

	public static void main(String[] args) {
			System.out.println(cualEsLaSalida());

	}
	public static String cualEsLaSalida() {
		try {
			int a = 10/1;
			if (a > 110) return "a mayor a 0";
			System.out.println("salida cualEsLaSalida");
			return "a menor o igual a 0";
		} catch (Exception e) {
			System.out.println("ejecuto Exception");
//			System.out.println("ejecuto dos codigos");
			return "return Exception";
		} finally {
			System.out.println("ejecuto Finally");
//			return "return Finally";
		}
	}

}
