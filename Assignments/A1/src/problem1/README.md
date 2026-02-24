# 🏦 Problem 1: EMI Quote Calculator

A local bank wants a console-based **“Quick EMI Quote Calculator.”**  
Each time a visitor taps **“Try a sample quote,”** the kiosk should simulate a loan offer and show a clean summary.

---

## ✅ Requirements

Create a class `problem1.QuickEmiQuote` with a `main` method that performs the following steps:

---

## 1) Randomize Inputs (Use `Random` / `RandomGenerator` API)

- **Principal (P):** random integer in **[5,000 .. 25,000]** dollars
- **Tenure (n):** random integer months in **[6 .. 36]**
- **Annual interest rate (APR%):** random **one-decimal** value in **[3.5 .. 11.5]** (e.g., **7.2%**)

---

## 2) Compute EMI (Equated Monthly Installment — Use `Math` API)

- Monthly rate: `r = APR / 12 / 100`
- EMI formula (use `Math.pow`):

  \\[
  EMI = \\frac{P \\cdot r \\cdot (1 + r)^n}{(1 + r)^n - 1}
  \\]

- Total payment: `totalPayment = EMI * n`
- Total interest: `totalInterest = totalPayment - P`

---

## 3) Show Multiple Integer Views of the EMI

- **Cast to int:** truncate cents from calculated EMI (e.g., **$312**)
- **Rounded EMI:** round to the nearest int using `Math.round` (e.g., **$313**)

---

## 4) Format the Output Nicely (Inputs + Steps 1–3)

- Use `System.out.printf` to show money with **two decimals**
- Present a neat summary block