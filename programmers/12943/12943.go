func solution(num int) int {
	count := 0
	checkNum := num
	for {
		if checkNum == 1 {
			return count
		} else if count > 500 {
			return -1
		} else if checkNum % 2 == 0 {
			checkNum /= 2
			count++
		} else if checkNum % 2 == 1 {
			checkNum = checkNum * 3 + 1
			count++
		}
	}
}
