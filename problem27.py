import math;
import time; 
x = time.time()
def isPrime(n):
	if n< 2:
		return False
	elif n ==2:
		return True;
	elif n % 2 == 0:
		return False;
	elif n >3:
		p = int(math.ceil(math.sqrt(n)));
		for i in range(3,p,2):
			if n % i == 0:
				return False;
		return True;
result = 0
maxi = 0
for a in range(-999,1000):
	for b in range(-999,1000):
		n = 0
		number = 0
		while(True):
			number = n*n + a*n + b
			if(isPrime(number)== False):
				break;
			n+= 1;
		if n > maxi:
			maxi = n;
			result = a*b;
print "The answer is : %s" %result;
t = time.time() - x
print "\n Time Taken: %s seconds"%t;
