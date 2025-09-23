## 1. Detective

Detectives work hard to solve cases, but who has more work?

* Create two `ArrayList`s:

  * `sherlocksToDos` for Sherlock Holmes
  * `poirotsToDos` for Hercules Poirot
* Print the size of each to-do list.
* Compare the lists and print the name of the detective with more tasks.

---

## 2. Narges’ Program – Hash Collision Checker

Narges believes that using hashes does not always improve performance. She asks you to check the number of **hash collisions**.

### Class: `HashCollisionChecker`

Implement the following methods:

* Count unique hash codes in a `HashSet`:

  ```java
  public static <T> int countOfUniqueHashCodes(HashSet<T> set)
  ```

* Count unique hash codes of keys in a `HashMap`:

  ```java
  public static <K, V> int countOfUniqueHashCodes(HashMap<K, V> map)
  ```

### Example:

```java
HashSet<String> set = new HashSet<>();
set.add("c#c#c#c#c#c#bBc#c#c#c#bBc#");
set.add("abcd");
set.add("c#c#c#c#c#c#bBc#c#c#c#c#aa");
set.add("1234");
set.add("c#c#c#c#c#c#bBc#c#c#c#c#bB");
System.out.println(countOfUniqueHashCodes(set)); // 3

HashMap<String, Integer> map = new HashMap<>();
map.put("c#c#c#c#c#c#c#aaaaaaaabBbB", 14);
map.put("c#c#c#c#c#c#c#aaaaaaaac#c#", 12);
map.put("c#c#c#c#c#c#c#aaaaaaaac#cc", 16);
System.out.println(countOfUniqueHashCodes(map)); // 2
```

**Expected Output:**

```
3
2
```

---

## 3. University

Write a program that:

* Receives details of several students (name, student ID, GPA) from the user.
* Stores them in a `TreeSet`.
* Allows searching for a student by student ID and prints their details.

---

## 4. Shuffle!

Write a program that shuffles the elements of a `LinkedList`.

---

## 5. Car Queue

Write a program that simulates a **queue of cars**:

* Create a queue of cars and add them (enqueue).
* Print the queue contents.
* Remove cars one by one (dequeue).
* At the end, check if the queue is empty.

This exercise demonstrates how to use a **queue** and its basic operations.

---
