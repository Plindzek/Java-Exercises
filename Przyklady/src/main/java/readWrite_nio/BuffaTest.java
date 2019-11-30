package readWrite_nio;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class BuffaTest { 
	char[] arr = { 'a', 'b', 'v', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
	int ile = (arr.length) * 2;
	public static void main(String[] args) {

		BuffaTest adam = new BuffaTest();
		ByteBuffer buffa = ByteBuffer.allocate(adam.ile());
		System.out.println(buffa.capacity());
		adam.BuffPutta(buffa);
		buffa.position(0);
		adam.BuffReada(buffa);
	}
	void BuffPutta(ByteBuffer buffy) {

		for (int i = 0; buffy.remaining() > 0; i++)

		{
			buffy.putChar(arr[i]);
		}
	}
	void BuffReada(ByteBuffer buffy) {
		do {
			System.out.print(buffy.getChar() + ", ");
		} while (buffy.remaining() > 0);
	}
	int ile() {
		return ile;
	}

}
