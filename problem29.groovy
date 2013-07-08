ArrayList a = new ArrayList();
for(i = 2; i<=100;i++)
{
	for(j = 2;j<=100;j++)
	{
		def k = i**j;
		if(!a.contains(k))
		{
			a.add(k);
		}
	}
}
println a.size();
