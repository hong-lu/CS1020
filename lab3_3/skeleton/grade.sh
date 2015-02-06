#!/bin/bash

# Assumes a directory structure of:
# dir
# |-- skeleton
# |   |-- testFile.java
# |   +-- grade.sh (this file)
# +-- testdata
#     |-- input
#     |   |- test1.in
#     |   +- ...
#     |
#     +-- output
#         |- test1.out
#         +- ...

# Usage: ./grade.sh testFile (Don't need the .java extension)

javac $1.java

# Clear if tmp dir exists, then create
if [ -s "tmp" ]
  then
  rm -rf tmp
fi
mkdir tmp

total=0
passed=0

# Get list of input data files
input_files=(`ls ../testdata/input/*\.in`)
for file in "${input_files[@]}"
do
  total=`expr $total + 1`
  temp="${file##*/}"
  filename="${temp%.*}"
  # Run the file with the input and save the respective output
  java $1 < "$file" > "tmp/$filename.out"
  # Compare the two output files
  diff "tmp/$filename.out" "../testdata/output/$filename.out" > "tmp/$filename.diff"
  if [ -s "tmp/$filename.diff" ]
    then
    echo "$filename failed"
    echo "    Your output:"
    sed -e 's/^/        /' "tmp/$filename.out"
    echo "    Correct output:"
    sed -e 's/^/        /' "../testdata/output/$filename.out"
  else
    passed=`expr $passed + 1`
    echo "$filename passed"
  fi
  echo ""
done

echo "==============="
echo "Overall: $passed/$total tests passed"

# Cleaning up
rm *.class
rm -rf "tmp"
