def factorial(n)
{
	if( n== 0 )
	{
		return 1;
	}
	else{
		return n*factorial(n-1);
	}
}
def ncr(n,r)
{
	if(r == 0)
	{
		return 1;
	}
	else{
		long top = factorial(n);
		long bot = factorial(r)*factorial(n-r);
		return top/bot;
	}
}
total = 0;
for(i in 23..100)
{
	for(def j = 0;j <= (int)i/2;j++)
	{
		if(ncr(i,j) > 1000000)
		{
			total++;
		}
	}
}
println total;
