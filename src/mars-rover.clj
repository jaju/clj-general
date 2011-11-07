;; Mars Rover
(reduce #((fn[[p d]c](case c(\l\r)[p(mod(({\l + \r -}c)d 90)360)]\m[(map + p({90[0 1]0[1 0]270[0 -1]180[-1 0]}d))d]))%1 %2)[[1 2]90]"lrmmmrmmmmmlll")