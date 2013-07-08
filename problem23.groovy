def sumOfDiv(int n)
{
	    int prod=1;
        for(int k=2;k*k<=n;++k){
            int p=1;
            while(n%k==0){
                p=p*k+1;
                n/=k;
            }
            prod*=p;
        }
        if(n>1)
            prod*=1+n;
        return prod;
    }     
def isAbundant(n)
{
	if(sumOfDiv(n) > n)
	{
		return true;
	}
	else{
		return false;
	}
}
ArrayList abun = new ArrayList();
for(i in 12..28123)
{
	if(isAbundant(i))
	{
		abun.add(i);
	}
}
ArrayList sum = new ArrayList();
for(j in abun)
{
	for(k in abun)
	{
		def jk = j+k
		if(jk<28123)
		{
			sum.add(jk);
		}
	}
}
def total = 0;
for(l in 24..28123)
{
	if(!sum.contains(l))
	{
		total+= l;
	}
}
println total;
