def totSum = 0;
for(def i = 2;i<= 354294;i++)
{
	def sum = 0;
	for(j in (String)i)
	{
		def dig = Integer.parseInt(j);
		sum+= dig ** 5;
	}
	if(sum == i)
	{
		totSum += i;
	}
}
println totSum;
