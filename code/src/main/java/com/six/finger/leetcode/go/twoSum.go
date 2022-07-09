package main

func main() {

}

func twosum(nums []int, target int) (res []int) {

	for i, num := range nums {
		for j := i + 1; j < len(nums); j++ {
			if num+nums[j] == target {
				res := make([]int, 2, 2)
				res[0] = i
				res[1] = j
				return res
			}

		}
	}
	return nil

}

func twosum1(nums []int, target int) (res []int) {

	maps := make(map[int]int)
	for i, num := range nums {
		value, ok := maps[target-num]
		if ok {
			return []int{value, i}
		} else {
			maps[num] = i
		}

	}

	return nil

}
