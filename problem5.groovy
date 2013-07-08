def isEvenlyDiv(n,x)
{
	def isDiv = true;
	def i = 1;
	while(isDiv && i <= x)
	{
		if(n % i != 0)
		{
			isDiv = false;
		}
		i++;
	}
	return isDiv;
}
def smallestEvenDiv()
{
	def found = false;
	def i = 1;
	while(!found)
	{
		if(isEvenlyDiv(i,20))
		{	
			found = true;
		}
		else{
			i++;
		}
	}
	return i;
}
println largestEvenDiv();
