( Forth.com's "Starting Forth" guide, Chapter 4, Question 6)
: within ( n low-limit high-limit -- )
  ROT DUP ROT < ( Check if n is less than upper limit)
  -ROT <= AND ( Check if n is greater than or equal to lower limit)
;

( Forth.com's "Starting Forth" guide, Chapter 4, Question 8)
: speller ( n -- )
  DUP ABS DUP 4 <= ( Check that number is in range -- ABS n is less than 4? )
  IF DUP ROT <> IF ." negative " THEN ( If ABS n != n, print negative )
    DUP 0 = IF ." zero " ELSE
    DUP 1 = IF ." one " ELSE
    DUP 2 = IF ." two " ELSE
    DUP 3 = IF ." three " ELSE
    DUP 4 = IF ." four " THEN THEN THEN THEN THEN
  ELSE 
    ABORT" Out of range " ( ABS n > 4 )
  THEN
;

( Forth.com's "Starting Forth" guide, Chapter 4, Question 9)
: trap ( low-limit high-limit -- ) 
  ROT DUP 2SWAP ( preserve secret number z)
  within
  IF ." BETWEEN "
  ELSE ." Out of range "
  THEN
;
