#!/bin/bash
read -p "Enter Number:" num
if (((( num % 2 )) == 0 )); then
    echo "Even Number"
else
    echo "Odd Number"
fi