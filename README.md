
# CaesarEncrypt

A simple Java implementation of the **Caesar Cipher** encryption technique. This program allows users to input a message and a shift value to produce an encrypted version of the message by shifting each character forward in the alphabet.

## 🔐 What is the Caesar Cipher?

The **Caesar Cipher** is a classic encryption algorithm used in cryptography. It works by shifting each letter of the plaintext by a fixed number of positions in the alphabet.

For example, with a shift of 3:

- `A` becomes `D`
- `B` becomes `E`
- ...
- `Z` becomes `C`

This cipher is one of the simplest and most widely known encryption techniques.

## 📂 File Structure

- `Caesarencrypt.java`: Main source code file that:
  - Accepts user input
  - Validates the message and key
  - Encrypts the message using Caesar Cipher logic

## 🚀 How to Run

### Requirements

- Java Development Kit (JDK) installed  
  [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

### Steps

1. **Compile the Java file**:

   ```bash
   javac Caesarencrypt.java
   ```

2. **Run the program**:

   ```bash
   java Caesarencrypt
   ```

3. **Follow the prompts** to enter your message and a shift key.

## 🧠 Features

- Case-sensitive encryption (uppercase and lowercase handled)
- Non-alphabetic characters are preserved
- User-friendly input prompts and error handling
- GUI elements created from JOptionPane from Java Swing package

## 🛠️ How It Works

- The user inputs a string message and an integer shift.
- Each alphabetic character is shifted by the shift value (modulo 26).
- The result is printed as the encrypted message.

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
