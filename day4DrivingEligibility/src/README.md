# 🚗 Driving Eligibility Check

This is a simple Java console application that checks if a user is allowed to drive based on their age and whether they have a driver's license.

---

## 📌 Features

- Asks the user for:
  - **Age**
  - **Driver’s license status** (`true` or `false`)
- Uses `Scanner` for input handling
- Uses `if / else if / else` logic to return:
  - ✅ You can drive
  - ⚠️ You’re old enough but need a license
  - ❌ You can’t drive

---

## 📄 Code Example

```java
Scanner input = new Scanner(System.in);
System.out.print("Enter your age: ");
int age = input.nextInt();

System.out.print("Do you have a driver's license? (true or false): ");
boolean hasLicense = input.nextBoolean();

if (age >= 18 && hasLicense) {
    System.out.println("You can drive");
} else if (age >= 18 && !hasLicense) {
    System.out.println("You are old enough, but you need a driving license");
} else {
    System.out.println("You can't drive");
}
```

---

## 🧠 What You Learn

- How to take user input in Java using `Scanner`
- How to store different types of data: `int` and `boolean`
- How to use `if / else` conditions for decision making
- How to keep your code clean and readable

---

## 🛠️ How to Run

1. Open terminal  
2. Navigate to the project folder  
3. Compile:
   ```bash
   javac drivingEligibility.java
   ```
4. Run:
   ```bash
   java drivingEligibility
   ```

---

## 📂 File Structure

```
drivingEligibility.java
README.md
```

---

## ✅ Status

✔️ Finished — beginner-friendly project to practice basic input and condition logic.

---

## 🙋 Author

**Jawad** — Java Developer in training 💻  
Daily practice, daily progress 💪
