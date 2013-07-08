def isPrime(n)
{
	for(i in 2..n)
	{
		if(n % i == 0 && i < n)
		{
			return false;
		}
	}
	return true;
}
def prime10001()
{
	def counter = 0;
	def i = 2;
	while(counter != 10001)
	{
		if(isPrime(i))
		{
			counter++;
		}
		i++;
	}
	return i;
}
println prime10001();
	
