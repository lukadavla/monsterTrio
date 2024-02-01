import java.util.Arrays;
public class monsterTrio {

    public static void main(String[] args) {
        int[] arr = new int[]{6,92,5,-12,34};
		System.out.println(Arrays.toString(shambles(arr)));
		System.out.println(concasse((arr)));
		System.out.println(redHawk(7,12));
		System.out.println(shishisonson(("GCAT")));
		System.out.println(ashura("abc","xyz"));
    }

       public static String[] shambles(int[] arr){
		String[] newArr = new String[arr.length];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > 0) newArr[i] = "Positive";
			else if (arr[i] < 0) newArr[i] = "Negative";
			else newArr[i] = "Zero";
		}
		return newArr;
	}

    public static String concasse(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (sum % 2 == 0) ? "even" : "odd";
    }

    public static double redHawk(int base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be a positive integer");
        }

        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }

    public static String shishisonson(String dna) {
        StringBuilder rna = new StringBuilder();
        for (char nucleotide : dna.toCharArray()) {
            if (nucleotide == 'T') {
                rna.append('U');
            } else {
                rna.append(nucleotide);
            }
        }
        return rna.toString();
    }

    public static String ashura(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i)).append(b.charAt(i));
        }

        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }
}

