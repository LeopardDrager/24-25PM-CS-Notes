import java.util.ArrayList;

public class ALMethods {
	public static void main(String[] args) {
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		int ia[] = { 1, 5, 9, 7, 4, 8, 2, 3, 6, 0, 9 };

		arr_list = create_al(ia);

		System.out.println(min_int_al(arr_list));
		System.out.println(max_int_al(arr_list));
		System.out.println(avg_int_al(arr_list));
		System.out.println(sum_int_al(arr_list));

		System.out.println(count_int_al(arr_list, 9));
		System.out.println(std_dev_int_al(arr_list));
		System.out.println(remove_duplicates_int_al(arr_list));
		System.out.println(mode(arr_list));
	}

	private static int min_int_al(ArrayList<Integer> arr_list) {
		int min = arr_list.get(0);
		for (int i = 0; i < arr_list.size(); i++)
			if (arr_list.get(i) < min) min = arr_list.get(i);
		return min;
	}

	private static int max_int_al(ArrayList<Integer> arr_list) {
		int max = arr_list.get(0);
		for (int i = 0; i < arr_list.size(); i++)
			if (arr_list.get(i) > max) max = arr_list.get(i);
		return max;
	}

	private static int avg_int_al(ArrayList<Integer> arr_list) {
		int sum = sum_int_al(arr_list);
		return sum / arr_list.size();
	}

	private static int sum_int_al(ArrayList<Integer> arr_list) {
		int sum = 0;
		for (int i = 0; i < arr_list.size(); i++)
			sum += arr_list.get(i);
		return sum;
	}

	private static double std_dev_int_al(ArrayList<Integer> arr_list) {
		int mean = avg_int_al(arr_list);
		ArrayList<Double> temp = new ArrayList<Double>();
		for (int i = 0; i < arr_list.size(); i++)
			temp.add(Math.pow(arr_list.get(i) - mean, 2));
		double sum = 0;
		for (int i = 0; i < temp.size(); i++)
			sum += temp.get(i);
		return Math.sqrt(sum / arr_list.size());
	}

	private static int count_int_al(ArrayList<Integer> arr_list, int item) {
		int count = 0;
		for (int i = 0; i < arr_list.size(); i++)
			if (arr_list.get(i) == i) count++;
		return count;
	}

	private static ArrayList<Integer> remove_duplicates_int_al(ArrayList<Integer> arr_list) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < arr_list.size(); i++) {
			if (!ret.contains(arr_list.get(i)))
				ret.add(arr_list.get(i));
		}
		return ret;
	}

	private static int mode(ArrayList<Integer> arr_list) {
		ArrayList<Integer> keys = new ArrayList<Integer>();
		ArrayList<Integer> counts = new ArrayList<Integer>();
		for (int i = 0; i < arr_list.size(); i++) {
			int key = arr_list.get(i);
			if (keys.contains(key)) {
				int j = keys.indexOf(key);
				counts.set(j, counts.get(j) + 1);
				continue;
			}
			keys.add(key);
			counts.add(1);
		}
		return keys.get(counts.indexOf(max_int_al(counts)));
	}

	private static ArrayList<Integer> create_al(int arr[]) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; ret.add(arr[i++]));
		return ret;
	}
}