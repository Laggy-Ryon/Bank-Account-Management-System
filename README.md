# Bank Account Management System

A simple **Bank Account Management System** developed using Java to demonstrate Object-Oriented Programming (OOP) concepts such as classes, objects, constructors, instance variables, and methods.

## Project Overview

This project simulates basic banking operations using Java. It allows users to create bank accounts, deposit money, withdraw money, check account balances, and display account details.

The program creates two independent bank account objects, each maintaining its own account information and balance.

## Features

- Create bank accounts using a parameterized constructor.
- Deposit money into an account.
- Withdraw money from an account.
- Check the current account balance.
- Display account details.
- Handle insufficient balance during withdrawals.
- Maintain independent balances for multiple accounts.
- Validate deposit and withdrawal amounts.

## Technologies Used

- **Programming Language:** Java
- **Concepts:** Object-Oriented Programming (OOP)
- **IDE:** Visual Studio Code

## Project Structure

```text
Bank-Account-Management-System/
│
├── Main.java
└── README.md
```

## How to Run

**1. Clone the repository**

```bash
git clone https://github.com/Laggy-Ryon/Bank-Account-Management-System.git
```

**2. Navigate to the project directory**

```bash
cd Bank-Account-Management-System
```

**3. Compile the Java program**

```bash
javac Main.java
```

**4. Execute the program**

```bash
java Main
```

## OOP Concepts Implemented

| Concept | Implementation |
|---|---|
| Class | `BankAccount` |
| Objects | `acc1` and `acc2` |
| Instance Variables | Account number, holder name, balance |
| Parameterized Constructor | Initializes account details |
| Methods | Deposit, withdraw, check balance, display details |
| Object Independence | Each object maintains its own balance |

## Sample Output

```text
ACCOUNT 1 OPERATIONS
Deposited: Rs. 2000.0
Withdrawn: Rs. 1500.0
Current Balance: Rs. 5500.0

ACCOUNT 2 OPERATIONS
Deposited: Rs. 3000.0
Insufficient balance!
Withdrawn: Rs. 2000.0
Current Balance: Rs. 11000.0

===== FINAL ACCOUNT DETAILS =====

----- Account Details -----
Account Number: 101
Account Holder: Rahul
Balance: Rs. 5500.0

----- Account Details -----
Account Number: 102
Account Holder: Aman
Balance: Rs. 11000.0
```

## Learning Outcomes

Through this project, I gained practical experience in implementing Java OOP concepts, creating multiple objects, using parameterized constructors, defining instance methods, and managing independent object states.

---

**Project:** Bank Account Management System  
**Language:** Java  
**Repository:** [Bank-Account-Management-System](https://github.com/Laggy-Ryon/Bank-Account-Management-System)
