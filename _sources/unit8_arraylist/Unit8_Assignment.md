# Unit 8 Assignment

## Reading

* Eck Section 7.3 (ArrayList)
[http://math.hws.edu/javanotes/c7/s3.html](http://math.hws.edu/javanotes/c7/s3.html)


## Code

Make sure to write full unit tests for these functions.  Write at least one of these
functions using a standard for loop, and at least one with a for-each loop.

### Count lucky

A number is lucky if it is a multiple of 7 or ends in 7.  Write a function that
counts the number of lucky numbers in an ArrayList of integers.

```
countLucky(ArrayList{1, 2, 3}) -> 0
countLucky(ArrayList{7, 13, 17}) -> 2    
countLucky(ArrayList{107, 207}) -> 2    
```

### Sum of squares

Write a function that takes a single ArrayList of doubles as input, and returns the
sum of squares of the values.

```
sumOfSquares(ArrayList{0}) -> 0
sumOfSquares(ArrayList{1.0, 2.0, 3.0}) -> 14.0
sumOfSquares(ArrayList{2.0, 2.0, 2.0}) -> 12.0
```

### Total Z name length

Write a function that takes an ArrayList of strings as input, and returns 
the total length of the strings that start with "z" or "Z".

```
countZNames(ArrayList{"Dr. Kessner", "Dr. Sands"}) -> 0
countZNames(ArrayList{"Zorro", "zero", "zippy"}) -> 14
```

