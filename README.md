# 🏥 Java OOP Practice – Hospital Management System

A console-based Java application that simulates basic operations in a hospital. This project is ideal for practicing **Object-Oriented Programming** concepts such as inheritance, abstraction, encapsulation, and polymorphism.

---
## To start the assessment create a branch or clone the repo...Don't push to main
---

## ⏱ Duration

**Target Time:** 120 minutes  
**Skill Level:** Intermediate  
**Focus:** Real-world objects, polymorphism, abstract classes, business logic

---

## ✅ Objective

Build a CLI-based system that allows:
- Adding patients and doctors
- Scheduling and completing appointments
- Listing doctors and their specialties
- Displaying patient visit history

---

## 🧱 Requirements

- Use `Scanner` for input
- Store all data in `ArrayLists`
- Use `int` for any payment amounts (cents)
- Focus on clean, modular OOP design

---

## 🧩 Classes

### 🔶 Abstract Class: `Person`
- Fields:
    - `String id`
    - `String name`
- Abstract Method: `void displayInfo()`

---

### 🩺 Class: `Doctor` extends `Person`
- Extra Fields:
    - `String specialty`
- Implements `displayInfo()`

---

### 🧑‍⚕️ Class: `Patient` extends `Person`
- Extra Fields:
    - `int age`
    - `ArrayList<Appointment> history`
- Implements `displayInfo()`
- Methods:
    - `addToHistory(Appointment appointment)`
    - `getHistory()`

---

### 📅 Class: `Appointment`
- Fields:
    - `String appointmentId`
    - `Patient patient`
    - `Doctor doctor`
    - `String dateTime`
    - `boolean isCompleted`
- Methods:
    - `markAsCompleted()`
    - `displayInfo()`

---

### 🏥 Class: `HospitalService`
Handles logic for:
- Adding doctors and patients
- Scheduling appointments
- Marking appointments as complete
- Listing doctor/patient info
- Viewing patient appointment history

---

### 🖥️ Class: `Main`
Menu options:

```text
===== Hospital Menu =====
1. Add Doctor
2. Add Patient
3. Schedule Appointment
4. Complete Appointment
5. View Doctor Info
6. View Patient History
7. Exit
```
---
## 📦 Project Structure

src/
├── Main.java
├── model/
│   ├── Person.java
│   ├── Doctor.java
│   ├── Patient.java
│   ├── Appointment.java
├── service/
│   └── HospitalService.java

---

## 🧪 Example Workflow

> Add Doctor
Enter name: Dr. Smith
Enter specialty: Cardiology

> Add Patient
Enter name: Alex
Enter age: 22

> Schedule Appointment
Enter patient ID: P001
Enter doctor ID: D001
Enter date and time: 2025-06-03 10:30

> Complete Appointment
Enter appointment ID: A001

> View Patient History
[Shows all completed appointments for that patient]

---

##
