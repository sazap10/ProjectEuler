long chain = 0;
long num = 0;
for(long i =  800000 ;i < 1000000;i+=1)
{
	long inChain =0;
	long n = i;
	while(n != 1)
	{
		if(i%2==0)
		{
			n = n/2;
			inChain++;
		}
		else
		{
			n = 3*n+1;
			inChain++;
		}
	}
	if(inChain > chain)
	{
		chain = inChain;
		num = i;
	}
}
println num;
		
