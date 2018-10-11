package hw01;

public class CaesarCipher {
	public static void main(String args[]) {
		String shift = args[0];
		int m = Integer.valueOf(shift);
		String result = "";
		for(int k = 1; k < args.length; k++) {
			result += caesarCipher(args[k], m);
			result += "\n";
		}
		System.out.print(result);
	}

	public static String caesarCipher(String message, int shift) {
		// StringBuffer object is mutable and its length can be changed
		StringBuffer result= new StringBuffer(); 
		String msg = message;
		for(int i = 0; i < msg.length(); i++)
		{
			int firstletter = msg.charAt(i);
			char ch = msg.charAt(i);
			// special chars like : should not be shifted
			// and should be printed as it is
			if (!Character.isUpperCase(firstletter) &&
				!Character.isLowerCase(firstletter)) {
				if (ch == '\\') {
					// \n => ch = \\ = msg.charAt(i)
					// 'n' = msg.charAt(i+1)
					// Look at the next character.
					result.append((char)firstletter);
					firstletter = msg.charAt(i + 1);
					i = i+1;
				}
				result.append((char)firstletter);
				continue;
			}
			int mya = 'a';
			if (Character.isUpperCase(firstletter))
				mya = 'A';
			int aftershift = 0;
			int finalresult = 0;
			if (shift > 0)
			{
				shift = ((shift % 26) + 26) % 26;
				aftershift = firstletter + shift;
				//System.out.println("firstletter: " + firstletter + ", shift: " + shift + ", aftershift: " + aftershift);
				finalresult = (aftershift % mya) % 26 + mya;
				//System.out.println("finalresult: " + finalresult);
			}
			//additional code to fix the problem
			else
			{
				//int mul = (mya - (firstletter + shift))/26 + 1;
				//aftershift = firstletter + shift + 26*mul;
				int n = ((shift %26)+26) + firstletter;
				finalresult = (n % mya) % 26 + mya;
				//finalresult = (aftershift % mya) % 26 + mya;
			}

			char charfinal = (char)finalresult;
			result.append(charfinal);
		}
		//System.out.print(result);
		return result.toString();
	}
}

/*
Testcases:
pass: -10 a b -> q r
pass: -36 a b -> q r
pass: -20 a b -> g h
pass: 10 x y -> h i
pass: 20 x y -> r s
pass: 36 x y -> h i
pass: -10 x y -> n o
pass: 10 a b -> k l
capital:
pass: -10 A B -> Q R
pass: -36 A B -> Q R
pass: -20 A B -> G H
pass: 10 A B -> K L
pass: 10 X Y -> H I
pass: 20 X Y -> R S
pass: 36 X Y -> H I
pass: -10 X Y -> N O

Special characters:
pass: -10 X: Y -> N: O
pass: -10 X\n Y -> N\n O
pass: -10 X\p Y -> N\p O
pass: -10 X\r Y -> N\r O
pass: -10 "X Y" "Y X" -> N O  O N
pass: -54321 "Some test string!" "and another TEST STRING!" -> Lhfx mxlm lmkbgz! tgw tghmaxk MXLM LMKBGZ!
pass: 2 "ab xy!\n",) -> cd za!\n,)
pass: 0 This is an example: abcxyz -> This is an example: abcxyz
pass: 1 This is an example: abcxyz -> Uijt jt bo fybnqmf: bcdyza
pass: 2 This is an example: abcxyz -> Vjku ku cp gzcorng: cdezab
pass: -2 This is an example: abcxyz -> Rfgq gq yl cvyknjc: yzavwx

pass: -270 a b -> q r
pass: -296 a b -> q r
pass: +270 q r -> a b
pass: +296 q r -> o p
pass: 10 q r -> a b
pass: 62 q r -> a b
pass: 88 q r -> a b

*/