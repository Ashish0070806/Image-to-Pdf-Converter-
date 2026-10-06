# Image to PDF Converter

A desktop application built using **Java Swing** and **iText 7** that allows users to select multiple image files (`.jpg`, `.png`) via a file chooser and merge them into a single PDF document.

---

## Features

- **Multi-Image Selection**: Select multiple images at once using a graphical file picker dialog.
- **Auto-Scaling**: Automatically scales images to fit neatly onto the PDF pages.
- **Multi-Page Generation**: Automatically creates a new page for each selected image.
- **User-Friendly Feedback**: Shows GUI alerts on success or if no files are chosen.

---

## Project Structure

```text
ImageToPDF/
├── lib/
│   ├── io-7.1.3.jar
│   ├── kernel-7.1.3.jar
│   ├── layout-7.1.3.jar
│   └── slf4j-api-1.7.25.jar
├── .gitignore
├── ImageToPDF.java
└── README.md
```

---

## Prerequisites

- **Java Development Kit (JDK 8 or higher)** installed and added to your system `PATH`.
  - Check with: `java -version` and `javac -version`

---

## How to Compile & Run

### On Windows (Command Prompt / PowerShell)

1. Open a terminal in this project directory:
   ```powershell
   cd ImageToPDF
   ```

2. Compile the Java source file with the required libraries:
   ```powershell
   javac -cp "lib/*" ImageToPDF.java
   ```

3. Run the application:
   ```powershell
   java -cp ".;lib/*" ImageToPDF
   ```

### On macOS / Linux

1. Compile:
   ```bash
   javac -cp "lib/*" ImageToPDF.java
   ```

2. Run (note the `:` separator instead of `;`):
   ```bash
   java -cp ".:lib/*" ImageToPDF
   ```

---

## Dependencies

The project uses the following dependencies (located in `lib/`):
- [iText 7 Community Core](https://itextpdf.com/) (`kernel`, `io`, `layout` version 7.1.3)
- [SLF4J API](https://www.slf4j.org/) (`slf4j-api-1.7.25`)
