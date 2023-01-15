# Assignment1

Consider the following code is written in a method. Now, refactor the code and write test cases for day, month, year, and leap year.

```
if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
   day = 1;   month++;
} else if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
   day = 1;   month++;
} else if ((month == 12) && day == 31) {
   day = 1;   month++;   year++;
} else if ((month == 2)) {
   if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
       if (day == 29) {
           day = 1;   month++;
       } else {
           day = day + 1;
       }
   } else {
       if (day == 28) {
           day = 1; month++;
       }
   }
} else {
   day = day + 1;
}
```

# Assignment2
Write examples of different types of coupling.

### Folder structure
Your folder structure will 

```
- Assignment_01
  - src
    - main
      - java
        - assignment1
          - ClassName.java
        - assignment2
          - indipendence
            - ClassName.java
          - DataCoupling
          - StampCoupling
          - controlCoupling
          - contentCoupling
    - test
      - java
        - assignment1
          - TestClass.java
```

