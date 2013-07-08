def fib(n)
{
	if(n == 0)
	{
		return 0;
	}
	else if(n == 1)
	{
		return 1;
	}
	else{
		return fib(n-1) + fib(n-2)
	}
}
def sum = 0;
def fibn = 0;
def i = 1;
while(fibn < 4000000)
{
	fibn = fib(i);
	if(fibn % 2 ==0)
	{
		sum += fibn;
	}
	i++;
}
println sum;
