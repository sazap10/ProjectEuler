def sumOfDiv(n)
{
	def sum = 0;
	for(i in 1..n/2)
	{
		if(n %i == 0)
		{
			sum+=i;
		}
	}
	return sum;
}
def isAmicable(n)
{
	def a = sumOfDiv(n);
	def b = sumOfDiv(a);
	if(b == n && a!=b)
	{
		return true;
	}
	else {
		return false;
	}
}
def sumOfAm(n)
{
	def sum = 0;
	for(def i =1;i <n;i++)
	{
		if(isAmicable(i))
		{
			sum+=i;
		}
	}
	return sum;
}
println sumOfAm(10000);
