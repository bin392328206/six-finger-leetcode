package main

import (
	"fmt"
	"time"
)

func main() {

	c := make(chan int)
	go func() {
		for i := 1; i < 101; i++ {
			c <- 12
			//奇数
			if i%2 == 1 {
				fmt.Println("线程1打印:", i)
			}
		}
	}()
	go func() {
		for i := 1; i < 101; i++ {
			<-c
			//偶数
			if i%2 == 0 {
				fmt.Println("线程2打印:", i)
			}
		}
	}()
	time.Sleep(3 * time.Second)

}
