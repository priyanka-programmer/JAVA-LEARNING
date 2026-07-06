# Calculator

A simple console-based calculator built in Java as a practice project.

## Features

- Supports addition, subtraction, multiplication, division, and modulus
- Handles divide-by-zero and modulus-by-zero errors gracefully
- Runs in a loop so multiple calculations can be done without restarting
- Exit option (type `x` or `X`)

## What I learned

- Using `Scanner` for user input
- Structuring conditional logic with `switch` expressions
- Handling edge cases (division/modulus by zero)
- Debugging: found and fixed a bug where the exit condition (`x`/`X`) was unreachable because it was nested inside the wrong `if` block

## How to run

\`\`\`
javac Calculator.java
java Calculator
\`\`\`
