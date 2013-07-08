def isTriangleNum(long n)
{
	def c = ((Math.sqrt((8*n)+1))-1)/2;
	if(c - (int)c > 0)
	{
		return false;
	}
	return true;
}
def isPentNum(long n)
{
	def c= (Math.sqrt(24*n +1) +1)/6;
	if(c - (int)c >0)
	{
		return false;
	}
	return true;
}
def isHexNum(long n)
{
	def c= (Math.sqrt(8*n +1) +1)/4;
	if(c - (int)c >0)
	{
		return false;
	}
	return true;	
}
def hexNum(n)
{
	def x = n*((2*n) -1)
	return x;
}

	def n = 144;
	def result = 0;
	while(result == 0)
	{
		long tr = hexNum(n);
		if(isPentNum(tr))
		{
			result = tr;
			break;
		}
		n++;
	}
	println "The answer is: " + result;
	println isTriangleNum(result);

