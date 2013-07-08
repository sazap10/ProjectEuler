def factorial(n)
{
	if(n == 0|| n==1)
	{
		return 1;
	}
	else if(n > 1)
	{
		return n*factorial(n-1);
	}
}
def total = 0;
for(i = 3;i<= 2540160;i++)
{
	def sum = 0;
	for(j in (String)i)
	{
		sum+=  factorial(Integer.parseInt(j));
	}
	if(sum == i)
	{
		total += i;
	}
}
println total;
