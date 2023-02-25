package level0;
import java.util.Arrays;
public class Problem120890 {
	public int solution(int[] array, int n) {
		Arrays.sort(array);
		int answer = array[0];
		for (int i = 1; i < array.length; i++) {
			if (Math.abs(array[i] - n) < Math.abs(answer - n)) {
				answer = array[i];
			}
		}
		return answer;
	}
}
