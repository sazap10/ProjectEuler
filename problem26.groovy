def isPrime(int n)
{
	if(n < 2)
	{	
		return false;
	}
	else if(n ==2)
	{
		return true;
	}
	else if(n > 3)
	{
		int p = Math.ceil(Math.sqrt(n))
		for(def i = 3;i <p;i+=2)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
n = 3;
list = []
while(n < 1000)
{
	if(isPrime(n))
	{
		list.add(n);

	}
	n+=2;
}
def b = 0;
def p = 7;
def t = 0;
def r = 1;
long n = 0;
while(true){
	t++;
	x = r*b;
	d = (int)(x/p);
	r = x % p;
	n = n*b +d
	if(r == 1)
	{
		break;
	}
} 
println t;
