import math;
import time; 
x = time.time()
def isPrime(n):
	if n ==2:
		return True;
	elif n % 2 == 0:
		return False;
	elif n >3:
		p = int(math.ceil(math.sqrt(n)));
		for i in range(3,p,2):
			if n % i == 0:
				return False;
		return True;
def isCircPrime(n):
	string = str(n);
	l = len(string);
	for x in range(0,l-1):
		string = string[1:l]+string[0];
		if isPrime(int(string)) == False:
			return False;
	return True;
	
def primes(n): 
	if n==2: return [2]
	elif n<2: return []
	s=range(3,n+1,2)
	mroot = n ** 0.5
	half=(n+1)/2-1
	i=0
	m=3
	while m <= mroot:
		if s[i]:
			j=(m*m-3)/2
			s[j]=0
			while j<half:
				s[j]=0
				j+=m
		i=i+1
		m=2*i+3
	return [2]+[x for x in s if x]
total = 0;
list1 = list(primes(1000000));
for i in list1:
	if isCircPrime(i):
		total+=1;
print "The total number of circular primes under 1 million are: %s" %total;
t = time.time() - x
print "\n Time Taken: %s seconds"%t;
