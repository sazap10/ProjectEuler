def sumOfSpiralCorners(n)
{
	if(n == 1)
	{
		return 1
	}
	else if(n > 1)
	{
		def sum = 0;
		def corner = Math.pow(n,2);
		for(def i = 1;i <=4;i++)
		{
			sum+=corner;
			corner-=n-1;
		}
		return sum+sumOfSpiralCorners(n-2);
	}
}
println sumOfSpiralCorners(1001);
