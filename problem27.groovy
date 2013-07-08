def isPrime(int n)
{
	if(n < 2)
	{
		return false;
	}
	else if( n==2)
	{	
		return true;
	}
	else{
		int p = Math.ceil(Math.sqrt(n));
		for(int i = 3; i < p; i+=2)
		{
			if(n%i== 0)
			{
				return false;
			}
		}
	}
	return true;
}
def result = 0;
def max = 0;
for(def a = -999;a<=999;a++)
{
	for(def b = -999;b<=999;b++)
	{
		def n = 0;
		def number = 0;
		while(true)
		{
			number = n*n + a*n +b;
			if(!isPrime(number))
			{
				break;
			}
			n++;
		}
		if(n>max)
		{
			max = n;
			result = a*b;
		}
	}
}
println result;
