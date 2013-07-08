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
def primeFactors(n)
{
	def primes= [];
	def i = 1;
	while(i != n)
	{
		if(n % i == 0 && isPrime(i))
		{
			primes.add(i);
		}
		i++;
	}
	return primes;
}
println primeFactors(600851475143).last();
