# Bank Account Management System with JUnit Testing #

This project is a "console-based Java application" that simulates a basic "Bank Account Management System", built with "Object-Oriented Programming (OOP)" principles and "unit tested using JUnit 5".

---

# 📌 Objectives

- Design and implement a simple banking system
- Apply "OOP concepts" (like encapsulation and classes)
- Practice "unit testing" using "JUnit (Test-Driven Development - TDD)"
- Handle common edge cases (negative values, overdraft prevention, etc.)

---

# 🛠️ Technologies Used

- Java 17
- JUnit 5
- VS Code (or any IDE)
- Command-line compilation('javac', 'java')
- "JUnit Console Launcher" for test execution

---

# 📁 Project Structure                 

BankAccountManagementSystem/
│
├── lib/ (Contains JUnit JAR file)
│ └── junit-platform-console-standalone-1.10.0.jar
│
├── bin/ (Compiled .class files)
│
├── src/
│ ├── main/java/
│ │ └── BankAccount.java (Main logic class)
│ │
│ └── test/java/
│ └── BankAccountTest.java (Unit test class)
│
└── README.md (Project documentation)

# 📦 Features Implemented

# "BankAccount" class:

- deposit(double amount)
- withdraw(double amount)
- getBalance()
- getTransactionHistory()

#  Key Constraints:

- Prevents deposits/withdrawals of negative amounts
- Prevents overdraft (withdrawals beyond available balance)
- Maintains transaction history

---

# ✅ Unit Test Coverage

Implemented using "JUnit 5" in 'BankAccountTest.java', covering:

- ✅ Valid deposit
- ✅ Invalid deposit (negative value)
- ✅ Valid withdrawal
- ✅ Insufficient balance withdrawal
- ✅ Negative withdrawal
- ✅ Transaction history verification

---

#  Running Tests (Manual CLI Compilation)

> Make sure 'junit-platform-console-standalone-1.10.0.jar' is placed in your 'lib' folder.

# Step 1: Compile Source Files

--bash:

javac -cp ".;lib/*;bin" -d bin src/test/java/BankAccountTest.java
java -jar lib/junit-platform-console-standalone-1.10.0.jar --class-path bin --scan-classpath

# 📷 Sample Output

Thanks for using JUnit!

Test run finished after 159 ms
[         5 containers found      ]
[         0 containers skipped    ]
[         5 containers started    ]
[         0 containers aborted    ]
[         5 containers successful ]
[         0 containers failed     ]
[        12 tests found           ]
[         0 tests skipped         ]
[        12 tests started         ]
[         0 tests aborted         ]
[        12 tests successful      ]
[         0 tests failed          ]


# 🙌 Credits

This project was created as part of the "ShadowFox Internship Program" to practice real-world Java and software testing skills.

# 👤 Author

Pavitra Khanagaonkar
Java Development Intern
ShadowFox Virtual Internship – Intermediate Level

