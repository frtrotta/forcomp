import forcomp.Anagrams.Occurrences
import forcomp._

def a = List(1, 2, 3, 4)

(a take 1) ::: (a drop 2)
(a take 0) ::: (a drop 1)
(a take 3) ::: (a drop 4)

val b: Occurrences = List(('a', 1), ('b', 1))

(b take 0) ::: (b drop 1)


for {
  i <- 0 to 7
  j <- 0 to i
} yield (i, j)

