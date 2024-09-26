1. **setIthBit(n,pos)**- make 1 in the ith position
   `step 1:` Make a mask with pos (1 << pos)
   `step 2:` Then make bitwise (OR)(|) with n and store it  in `n`.
   `step 3:` return n.

2. **`getIthBit(n,pos)`** -get bit in the ith position
   `step 1:` Make a mask with pos (1 << pos)
   `step 2:` Then make bitwise (AND)(&) with n and store it in `bitval`
   `step 3:` Then check if it 1 return 1 otherwise return 0.

3. **clearIthBIt(n,pos)**- make 0 in th ith position.
   `step 1:` Make a mask with pos (1 << pos) then flips the bits by bitwise not (~)(1 << pos)
   `step 2:` Then make bitwise (AND)(&) with n and store it in `n`.
   `step 3:`  return `n`.

4. **clearLastIBits(n,pos)**- clear last i bit to 0.(pos-1)
   `step 1:` Make a mask with pos (-1 << pos) 
   `Note:` (-1-> 1111).
   `step 2:` Then make bitwise (AND)(&) with n and store it in `n`.
   `step 3:`  return `n`.

5. **updateIthBit(n,pos,val)**- update the bit in the specific  pos either (0 otr 1).
   `step 1:` first `cleatIthbit` with n,pos. (&)
   `step 2:` Then make a mask (val<< pos), val -> is either 0 or 1.
   `step 2:` Then make bitwise (OR)(|) with n and store it  in `n`.
   `step 3:`  return `n`.

6. **clearBitInRange(n,start,end)** -clear all the bit to 0 with in the range.
  `step 1:` take a variable and perform shift (~0)<< (end+1).
  `step 2:` take a variable and perform shift (1<< start) -1.
  `step 3:` Then make bitwise (OR)(|) with two variable and store it  in `mask`.
  `step 4:` Then make bitwise (And)(&) with n and store it  in `n`.
  `step 5:`  return `n`.

7. **countone(n)**- count the number of 1 in the number.
   `step 1:` initialize count to 0.
   `step 2:` until the n become zero perform `n&(n-1)`.
   `step 3:` return count.

8. **decimalToBinary(n)**- convert the decimal to binary.
   `step 1:` take the mask `1<<7`(unsigned)
   `step 2:` run a loop from 0<8.
   `step 3:` check the condtion that the number (AND)(&) mask will have non-zero values.
   `step 4:` if it return non zero print 1 otherwise print 0.
   `step 5:` then move the mask by performing right shift (>>).

9. **FastExpo(base,power)**-find the power of a given number.
   `step 1:` take a variable and store 1.
   `step 2:` run the loop till the power will become 0.
   `step 3:` find the lastbit by performing (AND)(&) with power and 1.
   `step 4:` if the lastbit is 1 the multiply the varible with base;  
   `step 5:` then multiply the base with base and store it in with base.
   `step 6:` then perform right shift with power by 1(power>>1).
   `step 7:` return the variable.

10. **FindOddEven** -check that that with n&1==1.

11. **powerOfTwo** check th number is power of 2 ot not.
     `step 1:` (n && !(n&(n-1)))


  