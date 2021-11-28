func solution(left int, right int) int {
	sum := 0
	for i := left; i <= right; i++ {
		count := 0
		for j := 1; j * j <= i; j++ {
			if i % j == 0 {
				count++
				if (j * j < i) {
					count++
				}
			}
		}
		if count % 2 == 0 {
			sum += i
		} else {
			sum -= i
		}
	}
	return sum
}