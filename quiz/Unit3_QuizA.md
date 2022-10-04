__Unit 3 Quiz A (Strings)__  
__AP Computer Science 2022-23 / Dr. Kessner__  

```
99 little bugs in the code,
99 bugs in the code,
1 bug fixed...compile again,
100 little bugs in the code...
```

Note: Be sure to write a complete function declaration for each of these.


### 1. Insult

Write a function that takes a String `name` and insults the person with that
name.  Unless the name is "Dr. Mirsky" or "Mr. Witman", in which case you
return a compliment.

```
insult("Dr. Kessner") -> "Dr. Kessner wears funny clothes!"
insult("Mr. President") -> "Mr. President wears funny clothes!"
insult("Dr. Mirsky") -> "Dr. Mirsky is awesome!"
insult("Mr. Witman") -> "Mr. Witman is awesome!"
```

\vspace{2.5in}


### 2. HotOrCold

Given a temperature as input, return "Hot" if the temperature is above 90, 
"Ok" between 60 and 90, and "Cold" below 60.

```
hotOrCold(100) -> "Hot"
hotOrCold(70) -> "Ok"
hotOrCold(50) -> "Cold"
```

\newpage


### 3. OddHeadEvenTail

Write a function that takes a single input string, and if the string length is
odd, return the substring consisting of the first character.  If the string length
is even, return the substring consisting of the last character.  If the string is
empty, return the empty string.

```
oddHeadEvenTail("") -> ""
oddHeadEvenTail("a") -> "a"
oddHeadEvenTail("ab") -> "b"
oddHeadEvenTail("abc") -> "a"
oddHeadEvenTail("abcd") -> "d"
oddHeadEvenTail("abcdefghijklmnopqrstuvwxyz") -> "z"

```


---
geometry: margin=1in
---


