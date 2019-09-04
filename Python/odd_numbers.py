# Python program to print odd Numbers in given range 

start = int(input("Enter the starting range of a number: ")) 
end = int(input("Enter the ending range of a number: ")) 

# iterating each number in list 
for num in range(start, end + 1): 
	
    if num % 2 != 0: 
	    print(num, end = " ")
