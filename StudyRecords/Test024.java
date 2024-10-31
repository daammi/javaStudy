/* ================================================
■■■ 연산자(Operator) ■■■
- 비트단위 연산자
===================================================*/
public class Test024
{
	public static void main(String[] args)
	{
		int x = 128; // 00000000 00000000 00000000 10000000
		
		System.out.printf("x << 3 : %d\n", x << 3);
		// 왼쪽으로 3칸 이동 8만큼 곱해진다. 즉, 128 * 8 = 1024;
		
		System.out.printf("x >> 3 : %d\n", x >> 3);
		// 오른쪽으로 3칸 이동 8만큼 나눠진다. 즉, 128 / 8 = 16;
		
		System.out.printf("======================\n\n");
		
        System.out.printf("x << 24 : %d\n", x << 24);
		System.out.printf("x >> 24 : %d\n", x >>> 24);
		// 00000000 00000000 00000000 10000000
		// 10000000 00000000 00000000 00000000
		// --==> x << 24 : -2147483648
		
		System.out.printf("x << 25 : %d\n", x << 25);
		System.out.printf("x << 26 : %d\n", x << 26);
		System.out.printf("x << 27 : %d\n", x << 27);
		
		System.out.printf("x << 32 : %d\n", x << 32);
	}
}