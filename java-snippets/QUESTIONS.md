# Java — Frequently Asked Interview Questions

Track your progress: `[ ]` todo, `[x]` done. Files marked with a path have a solution in this repo.

## 1. Basics & Flow Control

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Print numbers 1 to 100 without using a loop (3 ways) | Easy | `01-basics/BasicLoop.java` |
| 2 | Even or Odd — with and without modulus | Easy | `01-basics/EvenOdd.java` |
| 3 | FizzBuzz: print 1–100, multiples of 3 → Fizz, 5 → Buzz, both → FizzBuzz | Easy | — |
| 4 | Armstrong number check (e.g. 153 = 1³+5³+3³) | Easy | — |
| 5 | Leap year check | Easy | — |
| 6 | Find the largest of 3 numbers without using a library function | Easy | `01-basics/AreaVsPerimeter.java` |

## 2. Number Problems

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Reverse a number (1234 → 4321), handle negatives | Easy | `02-number-problems/ReverseNumber.java` |
| 2 | Sum of digits of a number | Easy | `02-number-problems/SumOfDigits.java` |
| 3 | Prime / Composite check in O(√n) | Easy | `02-number-problems/CompositeCheck.java`, `04-interview/misc/PrimeCheck.java` |
| 4 | Count trailing zeros in factorial of N (e.g. 100 → 24) | Medium | — |
| 5 | GCD / LCM using Euclid's algorithm | Medium | — |
| 6 | Check if a number is a power of two (`n & (n-1) == 0`) | Medium | — |
| 7 | Swap two numbers without a third variable | Easy | — |
| 8 | Print all divisors of N | Easy | — |

## 3. Patterns

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Right-angled number triangle | Easy | `03-patterns/NumberPattern.java` |
| 2 | Star rectangle / square | Easy | `03-patterns/StarRectangle.java`, `03-patterns/StarRow.java` |
| 3 | Inverted triangle, pyramid, diamond | Medium | — |
| 4 | Floyd's triangle | Medium | — |
| 5 | Pascal's triangle (print + nth row only) | Medium | — |

## 4. Arrays

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Find max and min in one pass | Easy | `04-interview/arrays/FindMaxMin.java` |
| 2 | Reverse an array in place with two pointers | Easy | `04-interview/arrays/ReverseArray.java` |
| 3 | Two Sum — return indices, O(n) with HashMap | Medium | `04-interview/arrays/TwoSum.java` |
| 4 | Remove duplicates from a sorted array in place | Medium | `04-interview/arrays/RemoveDuplicates.java` |
| 5 | Move all zeros to the end (stable) | Medium | — |
| 6 | Rotate an array by K positions | Medium | — |
| 7 | Merge two sorted arrays | Medium | — |
| 8 | Find the duplicate number in 1..N (cycle detection) | Medium | — |
| 9 | Kadane's algorithm — maximum subarray sum | Hard | — |
| 10 | Next permutation | Hard | — |

## 5. Strings

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Reverse a string without StringBuilder | Easy | `04-interview/strings/ReverseString.java` |
| 2 | Palindrome check (ignore case & spaces) | Easy | `04-interview/strings/PalindromeCheck.java` |
| 3 | Anagram check — sort approach + frequency array | Easy | `04-interview/strings/AnagramCheck.java` |
| 4 | Count vowels and consonants | Easy | `04-interview/strings/CountVowels.java` |
| 5 | First non-repeating character | Medium | — |
| 6 | Check if two strings are rotations (`"abcde"`, `"cdeab"`) | Medium | — |
| 7 | Longest common prefix | Medium | — |
| 8 | String compression: `aabcccccaaa → a2b1c5a3` | Medium | — |
| 9 | Longest substring without repeating characters | Hard | — |
| 10 | Minimum window substring | Hard | — |

## 6. Sorting & Searching

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Bubble sort with the "swapped" optimisation | Easy | `04-interview/misc/BubbleSort.java` |
| 2 | Binary search on a sorted array (iterative + recursive) | Medium | — |
| 3 | Selection sort and insertion sort — when is insertion better? | Medium | — |
| 4 | Count occurrences of an element using binary search | Medium | — |
| 5 | Sort an array of 0s, 1s and 2s in one pass (Dutch national flag) | Medium | — |
| 6 | Merge sort — write the merge function from memory | Hard | — |

## 7. Recursion

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | Factorial — iterative vs recursive | Easy | `04-interview/misc/Factorial.java` |
| 2 | Fibonacci — why naive recursion is O(2ⁿ), memoise it | Easy | `04-interview/misc/Fibonacci.java` |
| 3 | Sum of first N numbers / reverse an array using recursion | Easy | — |
| 4 | Tower of Hanoi | Medium | — |
| 5 | Power of a number in O(log n) (fast exponentiation) | Medium | — |
| 6 | Generate all subsets of a set (power set) | Hard | — |

## 8. Collections (very frequently asked)

| # | Question | Difficulty | Solution |
|---|----------|-----------|----------|
| 1 | ArrayList: add, get, remove, iterate — O complexities | Easy | `04-interview/collections/ArrayListDemo.java` |
| 2 | HashMap: put, get, entrySet iteration | Easy | `04-interview/collections/HashMapDemo.java` |
| 3 | HashSet vs HashMap vs TreeSet vs LinkedHashMap | Easy | `04-interview/collections/HashSetDemo.java` |
| 4 | Find the first non-repeating character using a HashMap | Medium | — |
| 5 | Group words by anagram in a Map&lt;String, List&lt;String&gt;&gt; | Medium | — |
| 6 | LRU Cache using LinkedHashMap (access order) | Hard | — |
| 7 | Hash collision — what happens and how is it resolved? | Theory | — |

## 9. OOP Theory (must-answer, oral)

| # | Question | Solution |
|---|----------|----------|
| 1 | Four pillars: encapsulation, inheritance, polymorphism, abstraction | `04-interview/oop/` |
| 2 | Overloading vs overriding — compile time vs runtime | `04-interview/oop/PolymorphismDemo.java` |
| 3 | abstract class vs interface — when do you choose which? | `04-interview/oop/AbstractionDemo.java` |
| 4 | IS-A vs HAS-A (composition) — examples | `04-interview/oop/InheritanceDemo.java` |
| 5 | `final`, `finally`, `finalize()` differences | — |
| 6 | Constructor chaining and `super()` call rules | — |
| 7 | Why is String immutable in Java? | — |
| 8 | `equals()` vs `==` and why override `hashCode()` with `equals()` | — |
| 9 | SOLID principles — explain with one example each | — |

## 10. Java Core Theory (frequently asked)

| # | Question |
|---|----------|
| 1 | `==`, `.equals()`, `hashCode()` differences |
| 2 | ArrayList vs LinkedList — internal structure and use cases |
| 3 | HashMap internal working: buckets, hashing, treeify at 8 |
| 4 | String, StringBuffer, StringBuilder — thread safety and speed |
| 5 | Checked vs unchecked exceptions; `try-catch-finally` flow |
| 6 | `Thread` vs `Runnable` vs `Callable`; `synchronized` vs `volatile` |
| 7 | `Iterator` vs `ListIterator` — why is `ConcurrentModificationException` thrown? |
| 8 | Garbage collection: how does the JVM decide to collect? |
| 9 | Java 8 features: lambda, stream API, default methods, Optional |
| 10 | Generics: what is type erasure? |

## 11. Must-practise problems before an interview

- [ ] Two Sum
- [ ] Reverse a linked list (write the class yourself)
- [ ] Detect a cycle in an array/graph (Floyd's)
- [ ] Kadane's algorithm
- [ ] Binary search (iterative + recursive)
- [ ] Merge two sorted arrays / linked lists
- [ ] Stack: valid parentheses `({[]})`
- [ ] Queue using two stacks
- [ ] String: longest substring without repeating characters
- [ ] Top K frequent elements
